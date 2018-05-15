package listener;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.SecureRandom;

public class Demonio {

	// private static volatile Demonio instance = null;

	// private static Demonio getInstance() {
	// if (instance == null) {
	// synchronized (Demonio.class) {
	// if (instance == null) {
	// instance = new Demonio();
	// }
	// }
	// }
	// return instance;
	// }

	public void invocacion() {
		// 1. Acceder a un directorio especifico de trabajo

		String ruta = "c:/listener/";

		File directorio = new File(ruta);

		if (!directorio.exists()) {
			directorio.mkdirs();
		}

		// 2. Crear un fichero con nombre "file_" + RANDOM + ".txt" y rellenar con
		// contenido aleatorio
		SecureRandom random = new SecureRandom();

		OutputStream out = null;
		StringBuffer datos = null;

		for (int i = 0; i < 10; i++) {

			try {
				out = new FileOutputStream(new File(ruta + "file_" + random.nextLong() + ".txt"));
				datos = new StringBuffer();
				datos.append(random.nextLong() + " " + random.nextLong() + " " + random.nextLong());
				out.write(datos.toString().getBytes());
				out.close();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void recoleccionAlmas() {

		String ruta = "c:/listener/";

		File directorio = new File(ruta);

		if (directorio.exists()) {
			SecureRandom random = new SecureRandom();
			File consumir = null;
			for (String alma : directorio.list()) {
				consumir = new File(ruta + alma);

				if (random.nextLong() % 2 == 0) {
					consumir.delete();
				}
			}

		}
	}
}
