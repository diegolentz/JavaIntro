package ciclos;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidad = 10;
		int numero;

		int sumaPares = 0;
		int sumaImpares = 0;

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese un número: ");
			numero = scanner.nextInt();

			if (numero % 2 == 0) {
				System.out.println("El número es par");
				sumaPares += numero;
			} else {
				System.out.println("El número es impar");
				sumaImpares += numero;
			}
		}
		System.out.println("La suma de los números pares es: " + sumaPares);
		System.out.println("La suma de los números impares es: " + sumaImpares);
		scanner.close();
	}

}
