package log;

public class FSLog extends Log {

	public FSLog(String msj) {
		super(msj);
	}

	public FSLog() {
		super();
	}

	@Override
	public void loggear() {
		System.out.println("FSLog: " + super.getMsj());

	}

}
