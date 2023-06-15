import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {
    int findGreatestNumber(int num1, int num2) throws RemoteException;
}
