package persistencia.basico;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistenciaObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("archivo.x"));
			String s = new String("Me van a serializar");
			objout.writeObject(s);
			ObjectInputStream objin = new ObjectInputStream(new FileInputStream("archivo.x"));
			String s2 = (String) objin.readObject();
			System.out.println(s2);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
