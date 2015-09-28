package serveur;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class Subject implements ISubject,Serializable{
	
	/* 
	 * liste des pointeurs vers les abonnée
	 */
	
	
	
	private ArrayList<String> history;
	
	private String name;
	
	public Subject(String name) {
		this.name = name;	
		this.history= new ArrayList<String>();
	}
	
	
	
	@Override
	public boolean broadcast() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean subscription() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unsubscribe() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public void putMessage(String message) throws RemoteException {
		this.history.add(message);
	}
	
	public ArrayList<String> getLastMessages(int n) {
		
		ArrayList<String> messages = new ArrayList<String>();
		
		if (n <= history.size()) {
			for(int i=0;i<history.size();i++) {
				messages.add(history.get(i));
			}
		} else {
			return history;
		}
		
		return messages;
		
	}
	
	public ArrayList<String> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<String> history) {
		this.history = history;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	
	
	
	
	
	
	
	
}
