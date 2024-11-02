package herencia.ejemplos.interfaces;

public class Humano extends Animal implements Humanidad{
	
	public Humano(String nombre) {
		super(nombre);
	}

	@Override
	public void alimentarse() {
		System.out.println(nombre + " come alimentos preparados (HUMANO)");		
	}

	@Override
	public void dormir() {
		System.out.println(nombre + " duerme en un refugio calido (HUMANO)");
	}

	public void bailar() {
		System.out.println(nombre + " se mueve al compas de una cancion (HUMANO)");
	}

	public void tocarInstrumentos() {
		System.out.print(nombre + " toca un instrumento (HUMANO)");
	}

}
