package ejercicioInterfaz;

public class Avion extends Volador implements IAterrizable {
	private Float velocidad;

	public Avion(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aterrizar() {
		System.out.println("El avion aterriza");

	}

}
