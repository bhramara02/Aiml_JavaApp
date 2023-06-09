package first_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(189, 11, 66, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(58, 55, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(58, 119, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(58, 74, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=t1.getText();
				String password=p1.getText();
				if(username.equals("hema@gmail.com")&& password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "login done");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid");
				}
			}
		});
		btnNewButton.setBounds(166, 199, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(58, 135, 112, 20);
		frame.getContentPane().add(p1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
