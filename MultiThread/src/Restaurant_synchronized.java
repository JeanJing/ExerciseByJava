
// The producer-consumer approach to task cooperation.
import java.util.concurrent.*;
import java.util.concurrent.locks.*;


class Meal {
  private final int orderNum;
  public Meal(int orderNum) { this.orderNum = orderNum; }
  public String toString() { return "Meal " + orderNum; }
}

class WaitPerson implements Runnable {
  private Restaurant_synchronized restaurant;
  protected ReentrantLock Wlock = new ReentrantLock();
  protected Condition Wconditon  = Wlock.newCondition();
  public WaitPerson(Restaurant_synchronized r) { restaurant = r; }
  public void run() {
    try {
      while(!Thread.interrupted()) {
    	Wlock.lock();
        try{
          while(restaurant.meal == null)
        	  Wconditon.await(); // ... for the chef to produce a meal
        }finally{
        	Wlock.unlock();
        }
        System.out.println("Waitperson got " + restaurant.meal);
        restaurant.chef.Clock.lock();
        try {
          restaurant.meal = null;
          restaurant.chef.Ccondition.signalAll(); // Ready for another
        }finally{
        	restaurant.chef.Clock.unlock();
        }
      }
    } catch(InterruptedException e) {
      System.out.println("WaitPerson interrupted");
    }
  }
}

class Chef implements Runnable {
  private Restaurant_synchronized restaurant;
  protected ReentrantLock Clock = new ReentrantLock();
  protected Condition Ccondition = Clock.newCondition();
  private int count = 0;
  public Chef(Restaurant_synchronized r) { restaurant = r; }
  public void run() {
    try {
      while(!Thread.interrupted()) {
    	  Clock.lock();
        try{
          while(restaurant.meal != null)
            Ccondition.await(); // ... for the meal to be taken
        }finally{
        	Clock.unlock();
        }
        if(++count == 10) {
          System.out.println("Out of food, closing");
          restaurant.exec.shutdownNow();
        }
        System.out.println("Order up! ");
        restaurant.waitPerson.Wlock.lock();
        try{
          restaurant.meal = new Meal(count);
          restaurant.waitPerson.Wconditon.signalAll();
        }finally{
        	 restaurant.waitPerson.Wlock.unlock();
        }
        TimeUnit.MILLISECONDS.sleep(0);
      }
    } catch(InterruptedException e) {
      System.out.println("Chef interrupted");
    }
  }
}

public class Restaurant_synchronized {
  Meal meal;
  ExecutorService exec = Executors.newCachedThreadPool();
  WaitPerson waitPerson = new WaitPerson(this);
  Chef chef = new Chef(this);
  public Restaurant_synchronized() {
    exec.execute(chef);
    exec.execute(waitPerson);
  }
  public static void main(String[] args) {
    new Restaurant_synchronized();
  }
} /* Output:
Order up! Waitperson got Meal 1
Order up! Waitperson got Meal 2
Order up! Waitperson got Meal 3
Order up! Waitperson got Meal 4
Order up! Waitperson got Meal 5
Order up! Waitperson got Meal 6
Order up! Waitperson got Meal 7
Order up! Waitperson got Meal 8
Order up! Waitperson got Meal 9
Out of food, closing
WaitPerson interrupted
Order up! Chef interrupted
*///:~
