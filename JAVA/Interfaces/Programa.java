package herencia.ejemplos.interfaces;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		ArrayList<Animal> elementos = new ArrayList<Animal>();
		
		elementos.add(new Humano("Pedro"));
		elementos.add(new Humano("Maria"));
		elementos.add(new Perro("Fido"));
		elementos.add(new Perro("Rex"));
		
		for (Animal animal : elementos) {
			animal.alimentarse();
			animal.dormir();
		}
			
	}

}

