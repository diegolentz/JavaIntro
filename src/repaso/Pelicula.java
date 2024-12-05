package repaso;

import poo.Articulo;

public class Pelicula extends Articulo{
	private String productora;

	public Pelicula(Integer id, String nombre, String autor, Double precio, String urlImagen) {
		super(id, nombre, autor, precio, urlImagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void detalleHijo() {
		System.out.println("Productora: " + this.productora);
		
	}

}
