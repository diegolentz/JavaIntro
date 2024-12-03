package poo;

public class Item {
	
	Articulo articulo;
	int cantidad;

	public Item(Articulo articulo, int cantidad) {
		this.articulo = articulo;
		this.cantidad = cantidad;
	}


	void aumentarCantidad() {
		this.cantidad++;
	}

	void disminuirCantidad() {
		this.cantidad--;
	}

	void eliminar() {
		this.cantidad = 0;
	}


}
