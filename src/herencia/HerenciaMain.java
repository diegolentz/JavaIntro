package herencia;

public class HerenciaMain {

	public static void main(String[] args) {
		
		Consola c = new Consola("generica", "china", 2020);
		PlayStation ps = new PlayStation("Play", "Sony", 2020, "123456");
		
		System.out.println(ps instanceof Consola);
		
	}
}
