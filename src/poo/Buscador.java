package poo;

import java.util.ArrayList;

public class Buscador {

	private String claveBusqueda;
	private Integer cantidadResultados;

	private ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	private ArrayList<Articulo> resultados = new ArrayList<Articulo>();
	
	//constructor
//	public Buscador() {
//		this.claveBusqueda = "";
//		cantidadResultados = 0;
//	}
	
	public Buscador(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
		cantidadResultados = 0;
	}
	
	//metodos
	public void buscar() {
		cargarArticulos();
		
		if (claveBusqueda != "") {
			for ( Articulo articulo : resultados) {
				evaluar(articulo);
			}
		}
	}

	public void evaluar(Articulo articulo) {
		if (articulo.getNombre().contains(claveBusqueda)) {
			articulos.add(articulo);
			cantidadResultados += 1;
		}
	}

	private void cargarArticulos() {
		resultados.add(new Articulo(1,"batman ", "christopher nolan", 200.0, "una imagen"));
		resultados.add(new Articulo(2,"batman inicia", "christopher nolan", 200.0, "otra imagen"));
		resultados.add(new Articulo(3,"batman el caballero", "christopher nolan", 200.0, ""));
		resultados.add(new Articulo(4,"pepe el caballero", "christopher nolan", 200.0, ""));
	}
	
	public void mostrarResultados() {
		System.out.println("se encontraron " + cantidadResultados + " resultados\n");
	}
	
	public void detalle() {
		for (Articulo articulo : articulos) {
			System.out.println(articulo.getNombre());
			System.out.println(articulo.getAutor());
			System.out.println(articulo.tieneImagen());
			System.out.println(articulo.getPrecio());
		}
	}
	
	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

	public Integer getCantidadResultados() {
		return cantidadResultados;
	}

	public void setCantidadResultados(Integer cantidadResultados) {
		this.cantidadResultados = cantidadResultados;
	}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	public ArrayList<Articulo> getResultados() {
		return resultados;
	}

	public void setResultados(ArrayList<Articulo> resultados) {
		this.resultados = resultados;
	}

	public int cantidadArticulos() {
		return  (this.articulos == null) ? 0 : this.articulos.size();
	}
	
}
