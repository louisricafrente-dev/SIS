package stocksalemanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

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
		username.setText(" ");
		username.setBounds(100, 104, 177, 20);
		loginFrame.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(37, 107, 53, 14);
		loginFrame.add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setBounds(100, 142, 177, 20);
		loginFrame.add(password);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(37, 145, 46, 14);
		loginFrame.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sales and Inventory System");
		lblNewLabel_3.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(60, 57, 184, 14);
		loginFrame.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = username.getText();
				String pass = password.getText();
				
				if (user.contains("admin") && pass.contains("admin")) {
					Menu menu = new Menu();
					menu.show();
					dispose();
				} else {
					Notadmin not = new Notadmin();
					not.show();
					dispose();
				}
			}
		});
		btnNewButton.setBounds(54, 216, 89, 23);
		loginFrame.add(btnNewButton);
		
//		register button
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register regframe = new Register();
				regframe.show();
				
				dispose();
			}
		});
		register.setBounds(163, 216, 89, 23);
		loginFrame.add(register);
	}
}
