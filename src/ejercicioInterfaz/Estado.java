package ejercicioInterfaz;

public class Estado {
	
	private boolean error;
	private String mensaje;
	
	public Estado(boolean error, String mensaje) {
		this.error = error;
		this.mensaje = mensaje;
	}

	public boolean isError() {
		return error;
	}

	public String getMensaje() {
		return mensaje;
	}

	

}
