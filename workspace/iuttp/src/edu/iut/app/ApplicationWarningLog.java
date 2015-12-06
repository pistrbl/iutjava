package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	public ApplicationWarningLog() {
		super();
	}
	/**
	 * @param message
	 * Initialise tous les logs avec le message pass� en param�tre 
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().warning(this.message);
		super.fireMessage("[WARNING]", this.message);
	}
}
