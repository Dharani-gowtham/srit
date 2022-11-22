package ThreadSynchronization_Part_2;

public class Main {
    public static void main(String[] args) {
        Thread thread1 =new Thread(new ThreadSync(),"Thread 1");
        Thread thread2 =new Thread(new ThreadSync(),"Thread 2");
        thread1.start();
        thread2.start();
    }
}
