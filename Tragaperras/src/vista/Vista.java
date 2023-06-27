package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import controlador.Controlador;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

public class Vista {

	public JFrame frame;
	public JTextField textusuario;
	public JLabel lblNewLabel, lblNewLabel_1, lblimg, lblNewLabel_3,label, lbl1, lbl2, lbl3,lblpremio, lblsaldo, saldo, lblusuario, lbltiradas;
	public JSpinner spinner;
	public JPasswordField passwordField;
	public JTextField textFieldsaldoinicial;
	public JPanel panel;
	public JButton btningresar,btnRetirar, cusuario, btnIniciarSesion, btntirar, btncerrarsesion,btnañadirtiradas;
	public JTextField textFieldretirar;
	public JTextField textFieldañadir;
	public JRadioButton rbtn1, rbtn2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Vista window = new Vista();
					window.frame.setVisible(true);
					Controlador controlador = new Controlador(window);
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 997, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textusuario = new JTextField();
		textusuario.setBounds(632, 34, 216, 22);
		frame.getContentPane().add(textusuario);
		textusuario.setColumns(10);
		
		lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(522, 34, 100, 22);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(504, 80, 119, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblimg = new JLabel("");
		lblimg.setIcon(new ImageIcon("C:\\Users\\raul\\Downloads\\logo2.jpg"));
		lblimg.setBounds(26, 11, 360, 178);
		frame.getContentPane().add(lblimg);
		
		spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 25));
		spinner.setBounds(26, 425, 100, 41);
		frame.getContentPane().add(spinner);
		
		lblNewLabel_3 = new JLabel("Tirada");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(26, 389, 102, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		label = new JLabel("New label");
		label.setBounds(149, 119, 46, 14);
		frame.getContentPane().add(label);
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setForeground(Color.BLUE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(224, 212, 526, 201);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lbl1 = new JLabel("");
		lbl1.setIcon(new ImageIcon("cereza.png"));
		lbl1.setBounds(10, 11, 161, 179);
		panel.add(lbl1);
		
		lbl2 = new JLabel("");
		lbl2.setIcon(new ImageIcon("cereza.png"));
		lbl2.setBounds(184, 11, 161, 179);
		panel.add(lbl2);
		
		lbl3 = new JLabel("");
		lbl3.setIcon(new ImageIcon("cereza.png"));
		lbl3.setBounds(355, 11, 161, 179);
		panel.add(lbl3);
		
		JLabel lblpremio = new JLabel("PREMIO");
		lblpremio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpremio.setBounds(431, 455, 102, 25);
		frame.getContentPane().add(lblpremio);
		
		lblsaldo = new JLabel("0.0");
		lblsaldo.setForeground(Color.BLACK);
		lblsaldo.setBackground(Color.WHITE);
		lblsaldo.setOpaque(true);
		lblsaldo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblsaldo.setBounds(854, 455, 58, 41);
		frame.getContentPane().add(lblsaldo);
		
		saldo = new JLabel("SALDO");
		saldo.setFont(new Font("Tahoma", Font.BOLD, 20));
		saldo.setBounds(831, 430, 81, 23);
		frame.getContentPane().add(saldo);
		
		lblpremio = new JLabel("?");
		lblpremio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpremio.setBounds(466, 474, 20, 67);
		frame.getContentPane().add(lblpremio);
		
		btningresar = new JButton("INGRESAR");
		btningresar.setEnabled(false);
		btningresar.setBounds(817, 212, 119, 41);
		frame.getContentPane().add(btningresar);
		
		btnRetirar = new JButton("RETIRAR");
		btnRetirar.setEnabled(false);
		btnRetirar.setBounds(817, 160, 119, 41);
		frame.getContentPane().add(btnRetirar);
		
		lblusuario = new JLabel("--------------------------");
		lblusuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblusuario.setBackground(Color.white);
		lblusuario.setOpaque(true);
		lblusuario.setBounds(786, 282, 185, 47);
		frame.getContentPane().add(lblusuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(632, 80, 216, 25);
		frame.getContentPane().add(passwordField);
		
		textFieldsaldoinicial = new JTextField();
		textFieldsaldoinicial.setBounds(632, 135, 119, 22);
		frame.getContentPane().add(textFieldsaldoinicial);
		textFieldsaldoinicial.setColumns(10);
		
		JLabel lblsaldoingresarinicial = new JLabel("Cantidad a a\u00F1adir inicial");
		lblsaldoingresarinicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblsaldoingresarinicial.setBounds(396, 131, 222, 22);
		frame.getContentPane().add(lblsaldoingresarinicial);
		
		cusuario = new JButton("Crear usuario");
		cusuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cusuario.setBounds(431, 160, 168, 41);
		frame.getContentPane().add(cusuario);
		
		btntirar = new JButton("TIRAR");
		btntirar.setEnabled(false);
		btntirar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btntirar.setBounds(363, 411, 255, 36);
		frame.getContentPane().add(btntirar);
		
		textFieldretirar = new JTextField();
		textFieldretirar.setEnabled(false);
		textFieldretirar.setBounds(919, 34, 52, 22);
		frame.getContentPane().add(textFieldretirar);
		textFieldretirar.setColumns(10);
		
		JLabel lblRetirar = new JLabel("Retirar");
		lblRetirar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRetirar.setBounds(856, 34, 68, 22);
		frame.getContentPane().add(lblRetirar);
		
		textFieldañadir = new JTextField();
		textFieldañadir.setEnabled(false);
		textFieldañadir.setColumns(10);
		textFieldañadir.setBounds(919, 80, 52, 22);
		frame.getContentPane().add(textFieldañadir);
		
		JLabel lblAadir = new JLabel("A\u00F1adir");
		lblAadir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAadir.setBounds(854, 80, 68, 22);
		frame.getContentPane().add(lblAadir);
		
		btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIniciarSesion.setBounds(613, 160, 168, 41);
		frame.getContentPane().add(btnIniciarSesion);
		
		btncerrarsesion = new JButton("Cerrar sesi\u00F3n");
		btncerrarsesion.setEnabled(false);
		btncerrarsesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btncerrarsesion.setBounds(797, 361, 158, 36);
		frame.getContentPane().add(btncerrarsesion);
		
		btnañadirtiradas = new JButton("A\u00F1adir tiradas");
		btnañadirtiradas.setEnabled(false);
		btnañadirtiradas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnañadirtiradas.setBounds(26, 318, 169, 41);
		frame.getContentPane().add(btnañadirtiradas);
		
		JLabel lblNewLabel_2 = new JLabel("Total tiradas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(26, 477, 136, 41);
		frame.getContentPane().add(lblNewLabel_2);
		
		lbltiradas = new JLabel("0");
		lbltiradas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbltiradas.setBounds(174, 484, 46, 34);
		lbltiradas.setBackground(Color.white);
		lbltiradas.setOpaque(true);
		frame.getContentPane().add(lbltiradas);
		
		ButtonGroup grupo1 = new ButtonGroup();
		
		rbtn1 = new JRadioButton("a");
		rbtn1.setBounds(725, 461, 103, 21);
		frame.getContentPane().add(rbtn1);
		
		rbtn2 = new JRadioButton("b");
		rbtn2.setBounds(725, 491, 103, 21);
		frame.getContentPane().add(rbtn2);
		
		grupo1.add(rbtn1);
		grupo1.add(rbtn2);
	}
}
