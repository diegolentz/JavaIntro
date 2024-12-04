package poo;

public class Articulo {

	private Integer id;
	private String nombre;
	private String autor;
	private Double precio;
	private String urlImagen;

	public Articulo(Integer id, String nombre, String autor, Double precio, String urlImagen) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.urlImagen = urlImagen;
	}

	public boolean tieneImagen() {
		return this.urlImagen != "" && this.urlImagen != null;
	}

	public void agregarAlCarrito() {

	}

//	public int suID() {
//		return this.id;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

//	public Double obtenerPrecio() {
//		return this.precio;
//	}

	public String getNombre() {
		return this.nombre;
	}

	public String getAutor() {
		return this.autor;
	}

}
