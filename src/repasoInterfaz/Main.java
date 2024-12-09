package repasoInterfaz;

public class Main {

	public static void main(String[] args) {

		Espanol Espanol = new Espanol();
		Ingles Ingles = new Ingles();
		Italiano Italiano = new Italiano();

		Persona p = new Persona("Diego", Espanol);

		p.decir("Hola");

		p.aprenderIdioma(Ingles);
		p.decir("Hello", Ingles);

		p.decir("Hello", Italiano);

	}

}
