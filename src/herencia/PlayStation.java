package herencia;

public class PlayStation extends Consola{
	
	private String codigoPlayNetwork;
	
	//tiene qe nacer el padre para que nazca el hijo a travez del constructor hijo
	
	public PlayStation(String marca, String empresa, int anio, String codigoPlayNetwork) {
		super(marca, empresa, anio);
		
		this.codigoPlayNetwork = codigoPlayNetwork;
	}

}
