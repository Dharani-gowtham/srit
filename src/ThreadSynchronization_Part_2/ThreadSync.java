package ThreadSynchronization_Part_2;

public class ThreadSync implements Runnable{
    @Override
    public void run() {
        ThreadSync.print();
    }

//  public static void print(){   <- Try this for non synced output
  public static synchronized void print(){
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " --Number :" + i);
        }
    }
}
