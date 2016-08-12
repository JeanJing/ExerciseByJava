package RestaurantTest;
//: concurrency/Restaurant.java
// The producer-consumer approach to task cooperation.
import java.util.concurrent.*;


class Meal {
  private final int orderNum;
  public Meal(int orderNum) { this.orderNum = orderNum; }
  public String toString() { return "Meal " + orderNum; }
}

class WaitPerson implements Runnable {
  private Restaurant_Reentrantlock restaurant;
  public WaitPerson(Restaurant_Reentrantlock r) { restaurant = r; }
  public void run() {
    try {
      while(!Thread.interrupted()) {
        synchronized(this) {
          while(restaurant.meal == null)
            wait(); // ... for the chef to produce a meal
        }
        System.out.println("Waitperson got " + restaurant.meal);
        synchronized(restaurant.chef) {
          restaurant.meal = null;
          restaurant.chef.notifyAll(); // Ready for another
        }
      }
    } catch(InterruptedException e) {
      System.out.println("WaitPerson interrupted");
    }
  }
}

class Chef implements Runnable {
  private Restaurant_Reentrantlock restaurant;
  private int count = 0;
  public Chef(Restaurant_Reentrantlock r) { restaurant = r; }
  public void run() {
    try {
      while(!Thread.interrupted()) {
        synchronized(this) {
          while(restaurant.meal != null)
            wait(); // ... for the meal to be taken
        }
        if(++count == 10) {
          System.out.println("Out of food, closing");
          restaurant.exec.shutdownNow();
        }
        System.out.println("Order up! ");
        synchronized(restaurant.waitPerson) {
          restaurant.meal = new Meal(count);
          restaurant.waitPerson.notifyAll();
        }
        TimeUnit.MILLISECONDS.sleep(100);
      }
    } catch(InterruptedException e) {
      System.out.println("Chef interrupted");
    }
  }
}

public class Restaurant_Reentrantlock {
  Meal meal;
  ExecutorService exec = Executors.newCachedThreadPool();
  WaitPerson waitPerson = new WaitPerson(this);
  Chef chef = new Chef(this);
  public Restaurant_Reentrantlock() {
    exec.execute(chef);
    exec.execute(waitPerson);
  }
  public static void main(String[] args) {
    new Restaurant_Reentrantlock();
  }
} 

