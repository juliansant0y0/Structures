package herencia.ejemplos.basico;

public class Triangulo extends FormaDosD {

	public String estilo;

	public double area() {
		return (ancho * altura) / 2;
	}

	public void mostrarEstilo() {
		System.out.println("El triangulo es " + estilo);
	}

	
	public String toString() {
		return "Triangulo [estilo=" + estilo + "]";
	}

	
	
}

