package herencia.ejemplos.polimorfismo;

import java.util.ArrayList;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija
	// a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		

		SeleccionFutbol entrenador = new Entrenador(1, "Francisco", "Pekerman", 60, 28489);
		SeleccionFutbol futbolista = new Futbolista(2, "Rodrigo", "Rodriguez", 24, 6, "Delantero");
		SeleccionFutbol masajista = new Masajista(3, "Pedro", "Perez", 41, "Fisioterapeuta", 18);

		integrantes.add(entrenador);
		integrantes.add(futbolista);
		integrantes.add(masajista);

		System.out.println("--- Metodos de SuperClase---");
		
		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		System.out.println("--- Metodos con Polimorfismo---");
		
		// ENTRENAMIENTO
		System.out.println(
				"nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenamiento();
		}

		// PARTIDO DE FUTBOL
		System.out
				.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.partidoFutbol();
		}
		
		System.out.println("--- Metodos de Clase---");

		// PLANIFICAR ENTRENAMIENTO
		System.out.println(
				"nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
		System.out.print(entrenador.getNombre() + " " + entrenador.getApellidos() + " -> ");
		((Entrenador) entrenador).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
		System.out.print(futbolista.getNombre() + " " + futbolista.getApellidos() + " -> ");
		((Futbolista) futbolista).entrevista();

		// MASAJE
		System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(masajista.getNombre() + " " + masajista.getApellidos() + " -> ");
		((Masajista) masajista).darMasaje();

	}
}


