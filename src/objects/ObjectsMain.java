package objects;

public class ObjectsMain {

	public static void main(String[] args) {

		Auto auto = new Auto("Ford", "Fiesta", 2020);

		auto.encender();
		auto.acelerar();
		auto.acelerar();
		auto.acelerar();

		auto.apagar();

	}

}
