package ciclos;

import java.util.Scanner;

public class Promedios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float nota1;
		float nota2;
		float nota3;
		float promedio;
		boolean aprobo;

		System.out.println("Ingrese la primer nota: ");
		nota1 = scanner.nextFloat();

		System.out.println("Ingrese la segunda nota: ");
		nota2 = scanner.nextFloat();

		System.out.println("Ingrese la tercer nota: ");
		nota3 = scanner.nextFloat();

		promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			aprobo = true;
			System.out.println("el promedio de las notas es: " + promedio + " \naprobado: " + aprobo);
		} else {
			aprobo = false;
			System.out.println("el promedio de las notas es: " + promedio + " \naprobado: " + aprobo);
		}
		scanner.close();
	}

}
