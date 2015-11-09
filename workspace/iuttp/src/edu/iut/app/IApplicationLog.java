package edu.iut.app;

public interface IApplicationLog {
	/** TP1 : Créérr les méthodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	
	void setMessage(String message);
	
	public String getMessage();
	
	public void addListener(IApplicationLogListener listener);
	
	IApplicationLogListener[] getpplicationLogListeners();
}
