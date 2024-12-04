package poo;

import java.util.ArrayList;

public class Carrito {

	ArrayList<Item> items = new ArrayList<Item>();

	public Carrito() {

	}

	public void agregarItem(Articulo articulo) {
		Item item = new Item(articulo, 1);
		items.add(item);

	}

	public void seguirComprando() {
		System.out.println("seguir comprando");
	}

	public void limpiarCarrito() {
		items.clear();
	}

	public void actualizar(ArrayList<Item> items) {
		this.items = items;
	}

	public Double obtenerPrecio() {
		Double precio = 0.0;
		for (Item unItem : this.items) {
			precio += unItem.articulo.getPrecio();
		}
		return precio;
	}

	public void eliminarItem(Item eliminarItem) {
		for (Item unItem : this.items) {
			if (unItem.articulo.getId() == (eliminarItem.articulo.getId())) {
				if (existeItem(unItem.articulo.getId())) {
					this.items.remove(unItem);
					break;
				}
			}
		}
	}

	public boolean existeItem(Integer id) {
		boolean existe = false;
		for (Item unItem : this.items) {
			if (unItem.articulo.getId() == (id)) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	public int cantidadItems() {
		return this.items.size();
	}

}
