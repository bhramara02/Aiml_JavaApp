package first_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;
int i=0;
int b=0;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 805, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(300, 25, 132, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\pineapple.png"));
		lblNewLabel_1.setBounds(10, 91, 201, 162);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\pineapple1.png"));
		lblNewLabel_2.setBounds(271, 79, 201, 189);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\pineapple2.png"));
		lblNewLabel_3.setBounds(529, 91, 168, 174);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("rs 150");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(86, 264, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("rs 5");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(362, 279, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("rs 1000");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(600, 276, 59, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "1 kg", "2 kg", "3 kg"}));
		c1.setBounds(86, 304, 59, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1kg", "2kg", "3kg"}));
		c2.setBounds(349, 304, 59, 22);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"select", "1kg", "2kg", "3kg"}));
		c3.setBounds(596, 301, 63, 22);
		frame.getContentPane().add(c3);
		
		JLabel lb = new JLabel("cart:0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb.setBounds(636, 25, 46, 14);
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("total:0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb2.setBounds(636, 46, 89, 14);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			int i=0;
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart:"+i);
				b=b+150;
				lb2.setText("total:"+b);
				String c=(String)c1.getSelectedItem();	
				JOptionPane.showMessageDialog(btnNewButton, "Selected:\n"+c);}
		});
		btnNewButton.setBounds(70, 331, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			int i=0;
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart:"+i);
				b=b+5;
				lb2.setText("total:"+b);
				String c=(String)c2.getSelectedItem();	
				JOptionPane.showMessageDialog(btnNewButton, "Selected:\n"+c);

				
			}
		});
		btnNewButton_1.setBounds(333, 331, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			int i=0;
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart:"+i);
				b=b+1000;
				lb2.setText("total:"+b);
				String c=(String)c3.getSelectedItem();	
				JOptionPane.showMessageDialog(btnNewButton, "Selected:\n"+c);

			}
		});
		btnNewButton_2.setBounds(583, 331, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
