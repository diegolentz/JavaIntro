package repaso;

import java.util.Scanner;

public class RepasoMain {

	public static void main(String[] args) {
		int edad;

		Animal perro = new Animal("negro", "lagartija", 10);
		

		perro.hablar();
		System.out.println(perro.getColor());

		perro.setColor("marron");
		System.out.println(perro.getColor());

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("ingrese la edad del animal/n");
			edad = sc.nextInt();
		} while (edad < 0);
		
		perro.setEdad(edad);
		System.out.println(perro.getEdad());
	}

}
