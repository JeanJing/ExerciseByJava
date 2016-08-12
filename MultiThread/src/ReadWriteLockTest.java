import java.util.Random;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantReadWriteLock.*;

public class ReadWriteLockTest {
	//���ȶ����д��reentrantreadwritelock
	private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	//������������д���ϵ��÷����ֱ����������д������ͬһ����д������Ŀ�ģ�����Ϊ��ʹ������д��֮�以��
	private ReadLock readLock = readWriteLock.readLock();
    private WriteLock writeLock = readWriteLock.writeLock();
    
    private String shareData = " ��į�ȴ���..." ;

    public void write(String str) throws InterruptedException {

        writeLock .lock();

              System. err .println( "ThreadName:" +Thread. currentThread ().getName()+ "write locking..." );

              try {

                     shareData = str;

                     System. err .println( "ThreadName:" + Thread. currentThread ().getName()+ " �޸�Ϊ" +str);

                     Thread. sleep (1);

              } catch (InterruptedException e) {

                     e.printStackTrace();

              } finally {

                     System. err .println( "ThreadName:" + Thread. currentThread ().getName()+ "  unlock..." );

                     writeLock .unlock();

              }

       }

       public String read() {

              readLock .lock();

              System. out .println( "ThreadName:" + Thread. currentThread ().getName()+ "read lock..." );

              try {

                     System. out .println( "ThreadName:" +Thread. currentThread ().getName()+ " ��ȡΪ��" + shareData );

                     Thread. sleep (1);

              } catch (InterruptedException e) {

                     e.printStackTrace();

              } finally {

                     System. out .println( "ThreadName:" + Thread. currentThread ().getName()+ "unlock..." );

                     readLock .unlock();

              }

              return shareData ;

       }

       public static void main(String[] args) {

              final ReadWriteLockTest shareData = new ReadWriteLockTest();
        

              for ( int i = 0; i < 50; i++) {

                     new Thread( new Runnable() {

                            public void run() {

                                          try {

                                                 Thread. sleep (1);

                                          } catch (InterruptedException e) {

                                                 e.printStackTrace();

                                          }

                                          shareData.read();

                                   }

                     }, "get Thread-read" +i).start();

              }

              for ( int i = 0; i < 5; i++) {

                     new Thread( new Runnable() {

                            public void run() {

                                   try {

                                          Thread. sleep (1);

                                   } catch (InterruptedException e1) {

                                          e1.printStackTrace();

                                   }

                                   try {

                                          shareData.write( new Random().nextLong()+ "" );

                                   } catch (InterruptedException e) {

                                          e.printStackTrace();

                                   }

                            }

                     }, "wirte Thread-write" +i).start();

              }

       }

}