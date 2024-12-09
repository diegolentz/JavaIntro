package ejercicioInterfaz;

public class Superman extends Volador implements IAterrizable {

	public Superman() {
		super("Superman");
	}

	@Override
	public void aterrizar() {
		System.out.println("Superman aterriza");
		
	}

}
