/*
 * 
 * Name: Sikder Shadman Sami
 * ID: 16201056
 * 
 */
package rmiassignment;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class ClientOperation {
    
	private static RMIInterface lookUp;

	public static void main(String[] args) 
		throws MalformedURLException, RemoteException, NotBoundException {
		
		lookUp = (RMIInterface) Naming.lookup("//localhost/MyServer");
		String txt = JOptionPane.showInputDialog("What is your name?");
			
		String response = lookUp.helloTo(txt);
		JOptionPane.showMessageDialog(null, response);

	}

}

