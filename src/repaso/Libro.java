package repaso;
import poo.Articulo;

public class Libro extends Articulo{
	private String isbn;
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Libro(Integer id,String nombre, String autor, double precio, String urlImagen, String isbn) {
		super(id,nombre, autor, precio, urlImagen);
		
		this.isbn = isbn;
		
	}
	
	@Override
	public void detalleHijo() {
		System.out.println("ISBN: " + this.isbn);
		
	}
	
}
