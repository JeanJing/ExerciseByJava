//: concurrency/ExplicitCriticalSection.java
// Using explicit Lock objects to create critical sections.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

// Synchronize the entire method:
class ExplicitPairManager1 extends PairManager {
  private Lock lock = new ReentrantLock();
  public synchronized void increment() {
    lock.lock();
    try {
      p.incrementX();
      p.incrementY();
      store(getPair());
    } finally {
      lock.unlock();
    }
  }
}

// Use a critical section:
class ExplicitPairManager2 extends PairManager {
  private Lock lock = new ReentrantLock();
  public void increment() {
    Pair temp;
    lock.lock();
    try {
      p.incrementX();
      p.incrementY();
      temp = getPair();
    } finally {
      lock.unlock();
    }
    store(temp);
  }
}

public class ExplicitCriticalSection {
	static void
	  testApproaches(PairManager pman1, PairManager pman2, PairManager pman3) {
	    ExecutorService exec = Executors.newCachedThreadPool();
	    PairManipulator
	      pm1 = new PairManipulator(pman1),
	      pm2 = new PairManipulator(pman2);
	      //pm3 = new PairManipulator(pman3);
	    PairChecker
	      pcheck1 = new PairChecker(pman1),
	      pcheck2 = new PairChecker(pman2);
	      //pcheck3 = new PairChecker(pman3);
	    
	   exec.execute(pm1);
	    exec.execute(pm2);
	    //exec.execute(pm3);
	    
	    exec.execute(pcheck1);
	   exec.execute(pcheck2);
	    //exec.execute(pcheck3);

	    
	    try {
	      TimeUnit.MILLISECONDS.sleep(500);
	    } catch(InterruptedException e) {
	      System.out.println("Sleep interrupted");
	    }
	    System.out.println("\npm1: " + pm1 +"\npm2: " + pm2);
	    System.exit(0);
	  }
  public static void main(String[] args) throws Exception {
    PairManager
      pman1 = new ExplicitPairManager1(),
      pman2 = new ExplicitPairManager2(),
      pman3 = new ExplicitPairManager2();
     testApproaches(pman1, pman2,pman3);
  }
} /* Output: (Sample)
pm1: Pair: x: 15, y: 15 checkCounter = 174035
pm2: Pair: x: 16, y: 16 checkCounter = 2608588
*///:~
