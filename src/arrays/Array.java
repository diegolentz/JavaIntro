package arrays;

import java.util.ArrayList;
import java.util.Random;

public class Array {

	public static void main(String[] args) {

//		int [] array = new int[size];
//		int[] array = { 10, 11, 15, 20, 30, 40, 50, 60, 7, 80 };
		ArrayList<Integer> edades = new ArrayList<Integer>();

		System.out.println("cargamos el array con numeros random");
		
		for (int i = 0; i < 20; i++) {
			int edad = new Random().nextInt(20);
			edades.add(edad);
			System.out.println("se agrego: " + edad);
		}

		System.out.println("ahora veremos cual es el menor y si tiene repetidos");

		int menor = getMenor(edades);
		int repetidosMenor = getRepetidos(edades, menor);
		
		int mayor = getmayor(edades);
		int repetidosMayor= getRepetidosMayor(edades, menor);
		
		System.out.println("el menor es: " + menor + " y se repite: " + repetidosMenor + " veces");
		System.out.println("el mayor es: " + mayor + " y se repite: " + repetidosMayor + " veces");
		
	}
	
	public static int getMenor(ArrayList<Integer> array) {
		int menor = array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) < menor) {
				menor = array.get(i);
			}
		}
		return menor;
	}
	
	public static int getRepetidos(ArrayList<Integer> array , int menor) {
		int repetidos = 0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i) == menor) {
				repetidos++;
			}
		}
		return repetidos;
	}
	
	public static int getmayor(ArrayList<Integer> array) {
		int mayor = array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) > mayor) {
				mayor = array.get(i);
			}
		}
		return mayor;
	}
	
	public static int getRepetidosMayor(ArrayList<Integer> array, int mayor) {
		int repetidos = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == mayor) {
				repetidos++;
			}
		}
		return repetidos;
	}
}
