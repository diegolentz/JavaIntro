package log;

public abstract class Log {
	private String msj;

	public Log(String msj) {
		this.msj = msj;
	}
	
	public Log() {
	}

	public String getMsj() {
		String msj;
		if (this.msj != null) {
			msj = this.msj;
		} else {
			msj = "No hay mensaje";
		}
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

	public abstract void loggear();

}
