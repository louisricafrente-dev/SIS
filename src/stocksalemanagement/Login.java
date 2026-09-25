package stocksalemanagement;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel loginFrame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setForeground(new Color(255, 255, 255));
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 320);
		setLocationRelativeTo(null);
		loginFrame = new JPanel();
		loginFrame.setBackground(new Color(255, 255, 255));

		setContentPane(loginFrame);
		loginFrame.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(117, 11, 69, 35);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		loginFrame.add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(100, 104, 177, 20);
		loginFrame.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(37, 107, 60, 14);
		loginFrame.add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setBounds(100, 142, 177, 20);
		loginFrame.add(password);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(37, 145, 60, 14);
		loginFrame.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sales and Inventory System");
		lblNewLabel_3.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(60, 57, 184, 14);
		loginFrame.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = username.getText().trim();
				String pass = new String(password.getPassword());
				
				if ("admin".equals(user) && "admin".equals(pass)) {
					Menu menu = new Menu();
					menu.setVisible(true);
					dispose();
				} else {
					Notadmin not = new Notadmin();
					not.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(54, 216, 89, 23);
		loginFrame.add(btnNewButton);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register regframe = new Register();
				regframe.setVisible(true);
				dispose();
			}
		});
		register.setBounds(163, 216, 89, 23);
		loginFrame.add(register);
	}
}
