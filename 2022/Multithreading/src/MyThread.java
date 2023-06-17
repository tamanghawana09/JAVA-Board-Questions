public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Thread = " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
       Thread thread = new MyThread();
       thread.start();
    }
}
