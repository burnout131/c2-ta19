package ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Encuesta extends JFrame {

	private JPanel contentPane;
	private ButtonGroup opcionesSO;
	private JCheckBox chckbxProgramming, chckbxGraphDes, chckbxAdmin;
	private JSlider selectorHoras;
	private JLabel muestraHoras;

	public Encuesta() {
		setTitle("Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(23, 24, 162, 23);
		contentPane.add(lblNewLabel);

		JRadioButton windowsChoice = new JRadioButton("Windows");
		windowsChoice.setBounds(23, 65, 109, 23);
		contentPane.add(windowsChoice);

		JRadioButton linuxChoice = new JRadioButton("Linux");
		linuxChoice.setBounds(23, 91, 109, 23);
		contentPane.add(linuxChoice);

		JRadioButton macChoice = new JRadioButton("Mac");
		macChoice.setBounds(23, 117, 109, 23);
		contentPane.add(macChoice);

		opcionesSO = new ButtonGroup();
		opcionesSO.add(windowsChoice);
		opcionesSO.add(linuxChoice);
		opcionesSO.add(macChoice);

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(23, 163, 128, 23);
		contentPane.add(lblNewLabel_1);

		chckbxProgramming = new JCheckBox("Programacion");
		chckbxProgramming.setBounds(23, 193, 135, 23);
		contentPane.add(chckbxProgramming);

		chckbxGraphDes = new JCheckBox("Diseño gràfico");
		chckbxGraphDes.setBounds(23, 219, 135, 23);
		contentPane.add(chckbxGraphDes);

		chckbxAdmin = new JCheckBox("Administración");
		chckbxAdmin.setBounds(23, 245, 135, 23);
		contentPane.add(chckbxAdmin);

		selectorHoras = new JSlider();
		selectorHoras.setValue(0);
		selectorHoras.setMaximum(10);
		selectorHoras.setBounds(23, 334, 200, 26);
		selectorHoras.addChangeListener(sliderChange);
		contentPane.add(selectorHoras);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas");
		lblNewLabel_2.setBounds(23, 291, 95, 23);
		contentPane.add(lblNewLabel_2);

		JButton btnSend = new JButton("Enviar");
		btnSend.addActionListener(send);
		btnSend.setBounds(172, 386, 89, 23);
		contentPane.add(btnSend);

		muestraHoras = new JLabel("0");
		muestraHoras.setBounds(254, 334, 65, 26);
		contentPane.add(muestraHoras);
	}

	ActionListener send = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ArrayList<String> selectedBoxes = new ArrayList<String>();
			String selectedBtn = "";
			int hours = selectorHoras.getValue();

			if (chckbxProgramming.isSelected()) {
				selectedBoxes.add(chckbxProgramming.getText());
			}

			if (chckbxGraphDes.isSelected()) {
				selectedBoxes.add(chckbxGraphDes.getText());
			}

			if (chckbxAdmin.isSelected()) {
				selectedBoxes.add(chckbxAdmin.getText());
			}

			for (Enumeration<AbstractButton> buttons = opcionesSO.getElements(); buttons.hasMoreElements();) {
				AbstractButton tempbutton = buttons.nextElement();
				if (tempbutton.isSelected()) {
					selectedBtn = tempbutton.getText();
				}
			}
			Respuesta frame = new Respuesta(selectedBtn, selectedBoxes, hours);
		}
	};

	ChangeListener sliderChange = new ChangeListener() {
		public void stateChanged(ChangeEvent e) {
			muestraHoras.setText(Integer.toString(selectorHoras.getValue()));
		}
	};
}
