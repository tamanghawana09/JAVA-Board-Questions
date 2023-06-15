import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Service {
    public Server() throws RemoteException{
        super();
    }
    public int findGreatestNumber(int num1, int num2) throws RemoteException{
        return Math.max(num1,num2);
    }
    public static void main(String[] args){
        try{
            Server server = new Server();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Service", server);
            System.out.println("Server is running");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
