package interfaces;

public class ServiceMain {

	public static void main(String[] args) {

		String sitio = "2";

		IService servicio = ServiceBuilder.buildService(sitio);

		Dato dato = servicio.consultar();
		dato.detalle();

	}

}
