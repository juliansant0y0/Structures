package herencia.ejemplos.basico;

public class Formas {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();

		t1.altura = 4.0;
		t1.ancho = 4.0;
		t1.estilo = "isosceles";

		t2.altura = 8.0;
		t2.ancho = 12.0;
		t2.estilo = "escaleno";

		System.out.println("Informacion para t1: ");
		t1.mostrarDimension();
		t1.mostrarEstilo();
		System.out.println("El area es " + t1.area());

		System.out.println("");

		System.out.println("Informacion para t2: ");
		t2.mostrarDimension();
		t2.mostrarEstilo();
		System.out.println("El area es " + t2.area());
		
		FormaDosD forma = new FormaDosD();
		
		forma.altura = 10;
		forma.ancho = 20;
		
		forma.mostrarDimension();

	}

}

