package ThreadPriority;

public class ThreadPriority {
    public static class myRun implements Runnable{
        @Override
        public void run() {
            System.out.println("Count down Begins");
            for (int i=10;i>0;i--){
                System.out.println(i);
            }
        }
    }

    public static class myMessage implements Runnable{
        @Override
        public void run() {
            System.out.println("Happy Diwali");
        }
    }
}
