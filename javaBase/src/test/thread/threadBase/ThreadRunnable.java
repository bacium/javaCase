package test.thread.threadBase;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnabla线程"+ Thread.currentThread().getName());
    }
}
