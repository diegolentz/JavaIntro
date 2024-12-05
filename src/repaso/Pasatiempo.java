package repaso;

import poo.Articulo;

public class Pasatiempo extends Articulo{
	private String marca;
	
	public Pasatiempo(Integer id, String nombre, String autor, Double precio, String urlImagen, String marca) {
		super(id, nombre, autor, precio, urlImagen);
		this.marca = marca;
	}

	@Override
	public void detalleHijo() {
		System.out.println("marca: " + this.marca);
		
	}

}
