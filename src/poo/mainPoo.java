package poo;

import java.util.Scanner;

public class mainPoo {

	public static void main(String[] args) {
		String claveBusqueda = "";
		Integer continuar;
		
		Scanner teclado = new Scanner(System.in);
		Carrito miCarrito = new Carrito();
		do {
			
			do {
				System.out.println("Ingrese la clave de busqueda");
				claveBusqueda = teclado.next();
			} while (claveBusqueda == "" || claveBusqueda == null);
			Buscador buscador = new Buscador(claveBusqueda);
	
	
	
			buscador.buscar();
			buscador.mostrarResultados();
			buscador.detalle();
	
	
			if (buscador.getCantidadResultados()> 0) {
				for (Articulo articulo : buscador.getArticulos()) {
	
					if (articulo.getId() % 2 != 0)
						miCarrito.agregarItem(articulo);
				}
			}
	
			System.out.println("cantidad de items " + miCarrito.cantidadItems());
			System.out.println("precio total " + miCarrito.obtenerPrecio());
	
			
			System.out.println("desea continuar? /n" );
			System.out.println("1-si 2-no/n" );
			continuar = teclado.nextInt();
		}while(continuar == 1);	
		teclado.close();
		System.out.println("fin");
	}

}
