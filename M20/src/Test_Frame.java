import java.awt.EventQueue;
import java.awt.JobAttributes;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Test_Frame {

	private JFrame frame;
	private JLabel lblLable;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_Frame window = new Test_Frame();
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
	public Test_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			String s=textField.getText();
			JOptionPane.showMessageDialog(null,s);
				//lblLable.setText("hello");
			}
		});
		btnOk.setBounds(271, 196, 138, 25);
		frame.getContentPane().add(btnOk);
		
		textField = new JTextField();
		textField.setBounds(45, 38, 284, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
