package ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Saludador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	
	public Saludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 32, 189, 26);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(91, 94, 236, 33);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("¡Saludar!");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola " + textField.getText() + "!");
			}

		});

		btnNewButton.setBounds(178, 174, 89, 23);
		contentPane.add(btnNewButton);
	}
}
