package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
        super.fireMessage("[INFO]", this.message);
	}
	
	public String getMessage() {
		return null;
	}

	public void addListener(IApplicationLogListener listener) {
		
	}

	public IApplicationLogListener[] getpplicationLogListeners() {
		return null;
	}

}
