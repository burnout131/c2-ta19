package ejercicio4;

public class MainApp {

	public static void main(String[] args) {
		try {
			Calculadora frame = new Calculadora();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
