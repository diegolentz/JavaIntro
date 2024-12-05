package repaso;

import java.util.ArrayList;

import poo.Articulo;

public class Musica extends Articulo{
	
	private ArrayList<String> listaCanciones;

	public Musica(Integer id, String nombre, String autor, Double precio, String urlImagen, ArrayList<String> listaCanciones) {
		super(id, nombre, autor, precio, urlImagen);

		this.listaCanciones = new ArrayList<String>();
		this.listaCanciones = listaCanciones;
	}

	public ArrayList<String> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(String listaCanciones) {
		this.listaCanciones.add(listaCanciones);
	}
		
	public void agregarTema(String tema) {
		this.listaCanciones.add(tema);
	}

	@Override
	public void detalleHijo() {
		System.out.println("Lista Canciones: " + this.listaCanciones);
		// TODO Auto-generated method stub
		
	}
	
	

}
