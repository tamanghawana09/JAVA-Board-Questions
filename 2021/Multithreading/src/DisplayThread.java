public class DisplayThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("My Name is Hawana");
            System.out.println("My Address is Gathaghar, bhaktapur");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DisplayThread nameThread = new DisplayThread();
        DisplayThread addressThread = new DisplayThread();
        nameThread.start();
        addressThread.start();
    }
}
