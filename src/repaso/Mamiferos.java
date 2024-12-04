package repaso;

public class Mamiferos extends Animal {

	private Integer tiempoGestacion;

	public Mamiferos(String color, String especie, Integer edad, Integer tiempoGestacion) {
		super(color, especie, edad);
		
		this.tiempoGestacion = tiempoGestacion;
	}

}
