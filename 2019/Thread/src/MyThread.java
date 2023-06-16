import java.io.IOException;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);
        thread1.start();
    }
}
