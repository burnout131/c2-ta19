package ejercicio3;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Respuesta extends JFrame {

	private JPanel contentPane;

	public Respuesta(String OSSelected, ArrayList<String> specialities, int hours) {
		setTitle("Respuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOpcionesSeleccionadas = new JLabel("Opciones seleccionadas");
		lblOpcionesSeleccionadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcionesSeleccionadas.setBounds(10, 11, 414, 14);
		contentPane.add(lblOpcionesSeleccionadas);

		JLabel lblSistemaOperativo = new JLabel("Sistema operativo: " + OSSelected + ".");
		lblSistemaOperativo.setBounds(10, 36, 414, 14);
		contentPane.add(lblSistemaOperativo);

		if (specialities.size() == 1) {
			JLabel lblEspecialidades = new JLabel("Tu especialidad:");
			lblEspecialidades.setBounds(10, 61, 414, 14);
			contentPane.add(lblEspecialidades);
			JTextArea listEspecialidades = new JTextArea(specialities.get(0));
			listEspecialidades.setBounds(10, 80, 300, 50);
			contentPane.add(listEspecialidades);
		} else {
			JLabel lblEspecialidades = new JLabel("Tus especialidades:");
			lblEspecialidades.setBounds(10, 61, 414, 14);
			contentPane.add(lblEspecialidades);
			JTextArea listEspecialidades = new JTextArea();
			listEspecialidades.setBounds(10, 80, 300, 50);
			contentPane.add(listEspecialidades);

			for (int i = 0; i < specialities.size(); i++) {
				listEspecialidades.append(" " + specialities.get(i) + "\n");
			}
		}

		JLabel lblHoras = new JLabel("Dedicas " + hours + " horas en el PC.");
		lblHoras.setBounds(10, 150, 337, 14);
		contentPane.add(lblHoras);

		setVisible(true);
	}

}
