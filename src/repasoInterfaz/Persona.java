package repasoInterfaz;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private IIdioma idiomaNativo;
	private ArrayList<IIdioma> masIdiomas = new ArrayList<IIdioma>();

	public Persona(String nombre, IIdioma idiomaNativo) {
		super();
		this.nombre = nombre;
		this.idiomaNativo = idiomaNativo;
	}

	public void aprenderIdioma(IIdioma idioma) {
		masIdiomas.add(idioma);
	}

	public void decir(String palabra) {
		if (palabra != null) {
			this.idiomaNativo.decir(palabra);
		}
	}

	public void decir(String palabra, IIdioma idioma) {
		if (palabra != null && contieneIdioma(idioma)) {
			idioma.decir(palabra);
		} else {
			System.out.println("No se puede decir en ese idioma");
		}
	}

	private boolean contieneIdioma(IIdioma idioma) {
		boolean contiene = false;

		if (masIdiomas.contains(idioma) || idiomaNativo.equals(idioma)) {
			contiene = true;
		}
		return contiene;
	}

}
