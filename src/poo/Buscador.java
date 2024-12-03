package poo;

import java.util.ArrayList;

public class Buscador {

	String claveBusqueda;
	Integer cantidadResultados;

	ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	ArrayList<Articulo> resultados = new ArrayList<Articulo>();
	
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
		if (articulo.nombre.contains(claveBusqueda)) {
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
	
	void mostrarResultados() {
		System.out.println("se encontraron " + cantidadResultados + " resultados\n");
	}
	
	void detalle() {
		for (Articulo articulo : articulos) {
			System.out.println(articulo.nombre);
			System.out.println(articulo.autor);
			System.out.println(articulo.tieneImagen());
			System.out.println(articulo.precio + "\n");
		}
	}
	
	
}
