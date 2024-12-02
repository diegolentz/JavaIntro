package funciones;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;

		double a;
		double b;
		double resultado;

		menu();

		opcion = sc.nextInt();

		while (opcion != 0) {
			switch (opcion) {
			case 1:
				System.out.println("introduce el primer numero");
				a = sc.nextInt();
				System.out.println("introduce el segundo numero");
				b = sc.nextInt();
				resultado = suma(a, b);
				System.out.println("\nel resultado de la suma es: " + resultado);
				break;

			case 2:
				System.out.println("introduce el primer numero");
				a = sc.nextInt();
				System.out.println("introduce el segundo numero");
				b = sc.nextInt();
				resultado = resta(a, b);
				System.out.println("\nel resultado de la resta es: " + resultado);
				break;
			case 3:
				System.out.println("introduce el primer numero");
				a = sc.nextInt();
				System.out.println("introduce el segundo numero");
				b = sc.nextInt();
				resultado = multiplicacion(a, b);
				System.out.println("\nel resultado de la multiplicacion es: " + resultado);
				break;
			case 4:
				System.out.println("introduce el primer numero");
				a = sc.nextInt();
				System.out.println("introduce el segundo numero");
				b = sc.nextInt();
				resultado = division(a, b);
				System.out.println("\nel resultado de la division es: " + resultado);
				break;

			default:
				System.out.println("opcion no valida");
				break;
			}
			menu();
			opcion = sc.nextInt();
		}
		System.out.println("adios");
		sc.close();
		System.exit(0);

	}

	private static void menu() {
		System.out.println("elije que operacion realizar");
		System.out.println("1 - suma");
		System.out.println("2 - resta");
		System.out.println("3 - multiplicacion");
		System.out.println("4 - division");
		System.out.println("0 - salir	");
	}

	public static double suma(double a, double b) {
		return a + b;
	}

	public static double resta(double a, double b) {
		return a - b;
	}

	public static double multiplicacion(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		double res = (b != 0) ? a / b : 0;
		return res;
	}

}
