import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;



public class main extends JFrame {

	private JPanel contentPane;
	private JTextField c_usu1;
	private JPasswordField c_contra1;
	private JTextField c_usu2;
	private JPasswordField c_contra2;
	private JTextField resultado;

	List<users>usuarioslista=new ArrayList<users>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		c_usu1 = new JTextField();
		c_usu1.setBounds(100, 54, 86, 20);
		contentPane.add(c_usu1);
		c_usu1.setColumns(10);

		c_contra1 = new JPasswordField();
		c_contra1.setBounds(100, 85, 86, 20);
		contentPane.add(c_contra1);
		c_contra1.setColumns(10);

		JLabel usu_1 = new JLabel("Usuario");
		usu_1.setBounds(10, 57, 46, 14);
		contentPane.add(usu_1);

		JLabel contra_1 = new JLabel("Contrase\u00F1a");
		contra_1.setBounds(10, 88, 65, 14);
		contentPane.add(contra_1);

		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				users user = new users(c_usu1.getText(),c_contra1.getText());
				user.setPassword(c_contra1.getText());
				user.setUsuario(c_usu1.getText());
				usuarioslista.add(user);


				c_usu1.setText("");
				c_contra1.setText("");



			}
		});
		btnCrear.setBounds(97, 116, 89, 23);
		contentPane.add(btnCrear);

		JLabel usu_2 = new JLabel("Usuario");
		usu_2.setBounds(10, 201, 46, 14);
		contentPane.add(usu_2);

		JLabel contra_2 = new JLabel("Contrase\u00F1a");
		contra_2.setBounds(10, 232, 65, 14);
		contentPane.add(contra_2);

		c_usu2 = new JTextField();
		c_usu2.setBounds(100, 198, 86, 20);
		contentPane.add(c_usu2);
		c_usu2.setColumns(10);

		c_contra2 = new JPasswordField();
		c_contra2.setBounds(100, 229, 86, 20);
		contentPane.add(c_contra2);
		c_contra2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Crear Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 11, 103, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIniciarSesion.setBounds(10, 160, 103, 14);
		contentPane.add(lblIniciarSesion);

		JButton inicio = new JButton("Iniciar Session");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


			for(int i = 0; i < usuarioslista.size(); i++) {
				if(usuarioslista.get(i).getUsuario().equals(c_usu2.getText()) && usuarioslista.get(i).getPassword().equals(c_contra2.getText())){
					resultado.setText("Correcto");
					i= usuarioslista.size();
					c_usu2.setText("");
					c_contra2.setText("");

				}
				else{
					resultado.setText("Falso");
				}
			}

			}
		});
		inicio.setBounds(100, 266, 112, 23);
		contentPane.add(inicio);

		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(302, 267, 122, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
	}
}
