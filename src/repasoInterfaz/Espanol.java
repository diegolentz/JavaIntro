package repasoInterfaz;

public class Espanol implements IIdioma {

	@Override
	public void decir(String texto) {
		System.out.println("Espanol: " + texto);
	}

}
