package base.thread.base;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        try {
            MyThread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
