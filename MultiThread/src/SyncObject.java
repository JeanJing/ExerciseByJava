class DualSynch {
  private Object syncObject = new Object();
 
  public synchronized void f() {
    for(int i = 0; i < 5; i++) {
      System.out.println("f()");
      Thread.yield();
    }
  }
  public void g() {
    synchronized(this) {
      for(int i = 0; i < 5; i++) {
        System.out.println("g()");
        Thread.yield();
      }
    }
  }
}

public class SyncObject {
  public static void main(String[] args) {
    final DualSynch ds = new DualSynch();
    new Thread() {
      public void run() {
        ds.f();
      }
    }.start();
    System.out.println("线程g已经启动");
    ds.g();
  }
}