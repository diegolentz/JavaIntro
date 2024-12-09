package repasoInterfaz;

public class Ingles implements IIdioma {

	@Override
	public void decir(String texto) {
		System.out.println("Ingles: " + texto );
	}

}
