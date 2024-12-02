package condicionales;

public class Condicionales {

	public static void main(String[] args) {
		int edad = 17;

		if (edad > 18) {
			if (edad >= 20 && edad <= 30) {
				System.out.println("Eres mayor de edad y tienes entre 20 y 30 años");
			} else {
				System.out.println("Eres mayor de edad, pero no tienes entre 20 y 30 años");
			}
		} else {
			System.out.println("Sos menor de edad wachin");
		}
		
		
		// Operador ternario
		String mensaje = (edad > 18) ? "Mayor de edad con ternadios" : "Menor de edad con ternadios";
		System.out.println(mensaje);
	}

}
