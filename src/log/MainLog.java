package log;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLog {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer op;
		String msj = "Mensaje a enviar";

		ArrayList<Log> log = new ArrayList<Log>();

		System.out.println("ingrese la cantidad de logs");
		Integer cantidad = teclado.nextInt();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("1-FS 2-Email");
			op = teclado.nextInt();

			Log aux = getLog(op);
			aux.setMsj(msj);
			log.add(aux);

			for (Log l : log) {
				l.loggear();
			}
		}
		teclado.close();
	}

	public static Log getLog(Integer op) {
		Log log;
		switch (op) {
		case (1):
			log = new FSLog();
			break;
		case (2):
			log = new EmailLog();
			break;
		default:
			log = new DefaultLog();
			break;
		}
		return log;
	}
}
