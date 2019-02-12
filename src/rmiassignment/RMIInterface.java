/*
 * 
 * Name: Sikder Shadman Sami
 * ID: 16201056
 * 
 */
package rmiassignment;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
    public String helloTo(String name) throws RemoteException;
}
