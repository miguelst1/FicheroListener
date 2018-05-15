package listener;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BorrarListener extends TimerTask implements ServletContextListener {

	private Timer timerCreacion;

	@Override
	public void run() {
		Demonio satanael = new Demonio();
		satanael.recoleccionAlmas();
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		if (timerCreacion != null) {
			timerCreacion.cancel();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("INICIANDO LISTENER FPDUAL.DEMONIO. 2 GORA SATAN!!");

		timerCreacion = new Timer();
		timerCreacion.schedule(this, 15000, 9000);

		// String clase = "listener.Demonio";
		// Class<?> cls = null;
		// try {
		// cls = Class.forName(clase);
		// Method instance = cls.getMethod("getInstance", null);
		// instance.invoke(null, null);
		// timerBorrado = new Timer();
		//
		// // timerBorrado.schedule(this,120000,3600000); // Cada hora
		// } catch (ClassNotFoundException ex) {
		// ex.printStackTrace();
		// } catch (SecurityException e) {
		// e.printStackTrace();
		// } catch (NoSuchMethodException e) {
		// e.printStackTrace();
		// } catch (IllegalArgumentException e) {
		// e.printStackTrace();
		// } catch (IllegalAccessException e) {
		// e.printStackTrace();
		// } catch (InvocationTargetException e) {
		// e.printStackTrace();
		// }
	}
}
