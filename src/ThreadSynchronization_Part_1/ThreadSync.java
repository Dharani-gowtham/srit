package ThreadSynchronization_Part_1;

public class ThreadSync extends Thread{

    private int threadNumber;
    public ThreadSync(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 1; i < 5; i++){
            System.out.println(i+" from Thread "+threadNumber);
        }
    }
}
