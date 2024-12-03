package poo;

public class Articulo {
	
	Integer id;
	String nombre;
	String autor;
	Double precio;
	String urlImagen;
	
// constructor	
//	public Articulo() {
//		this.nombre = "";
//		this.autor = "";
//		this.precio = 0.0;
//		this.urlImagen = "";
//	}
//	
	
	public Articulo(Integer id,String nombre, String autor, Double precio, String urlImagen) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.urlImagen = urlImagen;
	}
	boolean tieneImagen() {
		return this.urlImagen != "" &&  this.urlImagen != null;
	}
	
	void agregarAlCarrito() {
		
	}
	
	
	

}
