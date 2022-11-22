package Multi_Threading;

public class Main {
    public static void main(String[] args) {
        multiThreading thread1 = new multiThreading();
        multiThreading thread2 = new multiThreading();
        thread1.start();
        thread2.start();
    }
}
