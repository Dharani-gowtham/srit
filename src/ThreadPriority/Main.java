package ThreadPriority;

public class Main {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(new ThreadPriority.myRun());
        Thread messageThread = new Thread(new ThreadPriority.myMessage());

        countdownThread.setPriority(Thread.MAX_PRIORITY);
        messageThread.setPriority(Thread.MIN_PRIORITY);

        messageThread.start();
        countdownThread.start();
    }
}
