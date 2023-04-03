package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;

public class Encuesta extends JFrame {

	private JPanel contentPane;
	
	
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(23, 65, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(23, 91, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(23, 117, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(23, 24, 162, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(23, 163, 128, 23);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		chckbxNewCheckBox.setBounds(23, 193, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gràfico");
		chckbxNewCheckBox_1.setBounds(23, 219, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(23, 245, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(23, 334, 200, 26);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas");
		lblNewLabel_2.setBounds(23, 291, 95, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(172, 386, 89, 23);
		contentPane.add(btnNewButton);
	}
}
