package stocksalemanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel registerFrame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 500);
		registerFrame = new JPanel();
		registerFrame.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(registerFrame);
		registerFrame.setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegister.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblRegister.setBounds(81, 29, 142, 35);
		registerFrame.add(lblRegister);
		
		textField = new JTextField();
		textField.setBounds(121, 89, 130, 20);
		registerFrame.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(47, 91, 64, 14);
		registerFrame.add(lblNewLabel);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastname.setBounds(47, 116, 64, 14);
		registerFrame.add(lblLastname);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 114, 130, 20);
		registerFrame.add(textField_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login logback = new Login();
				logback.show();
				
				dispose();
			}
		});
		btnNewButton.setBounds(31, 406, 89, 23);
		registerFrame.add(btnNewButton);
	}

}
