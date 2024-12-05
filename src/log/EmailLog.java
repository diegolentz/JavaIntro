package log;

public class EmailLog extends Log {

	public EmailLog(String msj) {
		super(msj);
	}
	
	public EmailLog() {
		super();
	}

	@Override
	public void loggear() {
		System.out.println("Email log: " + super.getMsj());
	}

}
