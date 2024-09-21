package persistencia.basico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ManejoArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		escritura();
		System.out.println(lectura());
	}

	public static String lectura() {
		String texto = new String();
		try {
			FileReader fr = new FileReader("archivo.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			while ((s = entrada.readLine()) != null) {
				texto += s;
				texto += "\n";
			}
			entrada.close();
		} catch (java.io.FileNotFoundException fnfex) {
			System.out.println("Archivo no encontrado: " + fnfex);
		} catch (java.io.IOException ioex) {
		}
		return texto;
	}

	public static void escritura() {
		try {
			FileWriter fw = new FileWriter("archivo.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.println("soy la primera linea");
			salida.close();
			// continuar escribiendo el archivo
			bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.print("yo soy la segunda linea. ");
			double b = 123.45;
			salida.println(b);
			salida.close();
		} catch (java.io.IOException ioex) {
		}
	}

}
