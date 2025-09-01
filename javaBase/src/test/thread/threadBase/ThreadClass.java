package test.thread.threadBase;

public class ThreadClass extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("创建线程");
    }
}
