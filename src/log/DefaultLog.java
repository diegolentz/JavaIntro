package log;

public class DefaultLog extends Log {

	public DefaultLog(String msj) {
		super(msj);
	}
	
	public DefaultLog() {
		super();
	}

	@Override
	public void loggear() {
		System.out.println("Default log: " + super.getMsj());

	}

}
