package ejercicioInterfaz;

public abstract class Volador {
	protected String nombre;
	static int contador;
	
	public Volador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	
}
