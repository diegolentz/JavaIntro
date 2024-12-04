package repaso;

public class Animal {
	protected String color;
	protected String especie;
	protected int edad;

	public Animal(String color, String especie, int edad) {
		this.color = "";
		this.especie = "";
	}

	public void hablar() {
		System.out.println("animal hablando");
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad = edad;
			
		}
	}

	// el get no puede modificar directamente los atributos de la clase
	public String getColor() {
		String color;
		if (this.color == "") {
			color = "N/D";
		} else {
			color = this.color;
		}
		return color;
	}

	public void setColor(String color) {
		if (color != null) {
			this.color = color;
		} else {
			System.out.println("No se puede asignar un color nulo");
		}
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
