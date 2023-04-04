package ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JLabel lblMuestraResultado;
	private JTextField txtOp1;
	private JTextField txtOp2;

	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOperando1 = new JLabel("Operando 1");
		lblOperando1.setBounds(25, 21, 65, 25);
		contentPane.add(lblOperando1);

		JLabel lblOperando2 = new JLabel("Operando 2");
		lblOperando2.setBounds(25, 56, 65, 25);
		contentPane.add(lblOperando2);

		txtOp1 = new JTextField();
		txtOp1.setBounds(120, 23, 86, 20);
		contentPane.add(txtOp1);
		txtOp1.setColumns(10);

		txtOp2 = new JTextField();
		txtOp2.setColumns(10);
		txtOp2.setBounds(120, 61, 86, 20);
		contentPane.add(txtOp2);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(25, 121, 65, 25);
		contentPane.add(lblResultado);

		lblMuestraResultado = new JLabel("");
		lblMuestraResultado.setBounds(100, 121, 106, 25);
		contentPane.add(lblMuestraResultado);

		JButton sumar = new JButton("+");
		sumar.addActionListener(suma);
		sumar.setBounds(253, 22, 50, 23);
		contentPane.add(sumar);

		JButton restar = new JButton("-");
		restar.addActionListener(resta);
		restar.setBounds(321, 22, 50, 23);
		contentPane.add(restar);

		JButton multiplicar = new JButton("X");
		multiplicar.addActionListener(multiplica);
		multiplicar.setBounds(253, 71, 50, 23);
		contentPane.add(multiplicar);

		JButton dividir = new JButton("/");
		dividir.addActionListener(divide);
		dividir.setBounds(321, 71, 50, 23);
		contentPane.add(dividir);
		
		JButton salir = new JButton("SALIR");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		salir.setBounds(282, 206, 89, 23);
		contentPane.add(salir);
	}

	ActionListener suma = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			double op1 = Double.parseDouble(txtOp1.getText());
			double op2 = Double.parseDouble(txtOp2.getText());
			double resultado = op1 + op2;
			lblMuestraResultado.setText(Double.toString(resultado));
		}
	};

	ActionListener resta = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			double op1 = Double.parseDouble(txtOp1.getText());
			double op2 = Double.parseDouble(txtOp2.getText());
			double resultado = op1 - op2;
			lblMuestraResultado.setText(Double.toString(resultado));
		}
	};

	ActionListener multiplica = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			double op1 = Double.parseDouble(txtOp1.getText());
			double op2 = Double.parseDouble(txtOp2.getText());
			double resultado = op1 * op2;
			lblMuestraResultado.setText(Double.toString(resultado));
		}
	};

	ActionListener divide = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			double op1 = Double.parseDouble(txtOp1.getText());
			double op2 = Double.parseDouble(txtOp2.getText());
			double resultado = op1 / op2;
			lblMuestraResultado.setText(Double.toString(resultado));
		}
	};
}
