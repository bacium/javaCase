package test.thread.threadBase;

public class ThreadRunnnableCase {
    public static void main(String[] args) {
        ThreadRunnable tu=new ThreadRunnable();
        Thread th=new Thread(tu);
        th.start();
    }
}
