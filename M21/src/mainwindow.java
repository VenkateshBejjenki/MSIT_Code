import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class mainwindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainwindow window = new mainwindow();
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
	public mainwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnFact = new JButton("Word Count");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				B1 b=new B1();
				
			}
		});
		frame.getContentPane().add(btnFact, BorderLayout.SOUTH);
		
		JButton btnCcall = new JButton("Call");
		btnCcall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1 a=new A1();
			
			}
		});
		frame.getContentPane().add(btnCcall, BorderLayout.NORTH);
	}
}
