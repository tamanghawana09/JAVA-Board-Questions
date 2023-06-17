public class Threading extends Thread{
    String message;
    Threading(String mess){
         message = mess;

    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(message);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Threading nameThread = new Threading("My Name is Hawana");
        Threading addressThread = new Threading("My Address is Bhaktapur");
        nameThread.start();
        addressThread.start();
    }
}
