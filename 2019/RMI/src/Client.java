import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            Service service = (Service) registry.lookup("Service");
            int num1 = 10;
            int num2 = 20;
            int greatestNumber = service.findGreatestNumber(num1,num2);
            System.out.println("Greatest Number is :" + greatestNumber);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
