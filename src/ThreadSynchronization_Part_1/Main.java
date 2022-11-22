package ThreadSynchronization_Part_1;

public class Main {
    public static void main(String[] args) {

//      This program is for displaying the thread is running Randomly
        for (int i = 0; i<=3; i++){
            ThreadSync thread = new ThreadSync(i);
            thread.start();
        }
    }
}
