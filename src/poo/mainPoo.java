package poo;

public class mainPoo {

	public static void main(String[] args) {

		String claveBusqueda = "batman";

		Buscador buscador = new Buscador(claveBusqueda);

		buscador.buscar();
		buscador.mostrarResultados();
		buscador.detalle();

		// agrego al carrito
		Carrito miCarrito = new Carrito();

		if (buscador.cantidadResultados > 0) {
			for (Articulo articulo : buscador.articulos) {

				if (articulo.id % 2 != 0)
					miCarrito.agregarItem(articulo);
			}
		}

		System.out.println("cantidad de items " + miCarrito.cantidadItems());
		System.out.println("precio total " + miCarrito.obtenerPrecio());

	}

}
