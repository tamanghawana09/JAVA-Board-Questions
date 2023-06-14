public class MyThread extends Thread {
    public void run(){
        for(int i =0 ; i<5;i++){
            System.out.println("Thread: " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();
    }


}
