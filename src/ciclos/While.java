package ciclos;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int contador = 0;
		int numero;
		
		System.out.println("Ingrese un número: ");
		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextInt();
		
		while (numero != 0 ) {
			if(numero <= 6) {
				contador++;
				System.out.println("Ingrese un nuevo numero: ");
				numero = scanner.nextInt();
			}else {
				break;
			}
		}
		System.out.println("Cantidad de Iteraciones: " + contador);
		scanner.close();
	}
}
