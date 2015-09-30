package org.alma.distributedforum.client;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CustomerView extends UnicastRemoteObject implements ICustomerView,Serializable {

	protected CustomerView() throws RemoteException {
		super(11000);
		// TODO Auto-generated constructor stub
	}

	public void show(String message) throws RemoteException {
		System.out.println(message);
	}
}
