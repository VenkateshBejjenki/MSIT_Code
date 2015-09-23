import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
public class B1 extends JFrame implements ActionListener {

	JButton b;
	JTextArea textArea1;
	JLabel textArea2;
	B1(){
		b=new JButton();
		textArea1=new JTextArea();
		textArea2=new JLabel();

		textArea1.setBounds(50, 20, 200,70);
		textArea2.setBounds(80, 120, 200,40);
		textArea2.setText("Word Count is");
		b.setBounds(100, 220, 100, 30);
		b.setText("Count");
		b.addActionListener(this);
		add(b);
		add(textArea1);
		add(textArea2);
		this.setTitle("Word Counter");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		String f=textArea1.getText();
		String strArray[] = f.split(" ");
		textArea2.setText("Word count is "+Integer.toString(strArray.length));
		
	}
	public static void main(String[] argsv){
		new B1();
	}

}
