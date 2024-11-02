package herencia.ejemplos.interfaces;

public class Animal implements Acciones {

	public String nombre;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public void alimentarse() {
		System.out.println(nombre + " come alimentos crudos (ANIMAL)");
	}

	public void dormir() {
		System.out.println(nombre + " duerme a la intemperie (ANIMAL)");
	}

}

