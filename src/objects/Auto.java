package objects;

public class Auto {
	String marca;
	Float velocidad;
	String modelo;
	Integer anio;
	boolean encendido;

//	Constructor parametrizado
	Auto(String marca, String modelo, Integer anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		init();
	}

	// Constructor vacio
	Auto() {
		init();
	}

	void init() {
		encendido = false;
		velocidad = 0.0f;
	}

	void encender() {
		if (!encendido) {
			encendido = true;
			System.out.println("el auto esta encendido");
		} else {
			System.out.println("el auto ya estaba encendido");
		}
	}

	void apagar() {
		if (encendido) {
			while (velocidad > 0) {
				frenar();
				System.out.println("frenando..." + velocidad);
			}
			encendido = false;
			System.out.println("el auto esta apagado");
		} else {
			System.out.println("el auto ya estaba apagado");
		}
	}

	void acelerar() {
		if (encendido) {
			velocidad += 10;
			System.out.println("el auto esta acelerando");
		} else {
			System.out.println("el auto esta apagado");
		}
	}

	void frenar() {
		if (encendido && velocidad > 0) {
			velocidad -= 10;
			System.out.println("el auto esta frenando");
		} else {
			System.out.println("el auto esta apagado o ya estaba detenido");
		}
	}
}
