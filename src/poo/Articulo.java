package poo;

public abstract class Articulo {

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

	public String tieneImagen() {
		String urlImagen;
		if (this.urlImagen != null) {
			urlImagen = this.urlImagen;
		} else {
			urlImagen = "no tiene imagen";
		}
		return urlImagen;
	}

	public void agregarAlCarrito() {

	}

	public void detalle() {
		System.out.println(this.getNombre());
		System.out.println(this.getAutor());
		System.out.println(this.tieneImagen());
		System.out.println(this.getPrecio());

		this.detalleHijo();
	}
	
	public abstract void detalleHijo();
	
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
