/*
 * Problem Set 1: 
	Write a program for addition,subtraction,multiplication and division of two numbers using java swings.
 * 
 * Author :- Rajesh kumar Sheela
 * 
 */
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
public class A1 extends JFrame implements ActionListener {
	JButton b;
	JTextField t,d;
	JComboBox comboBox;
	JTextArea textArea;
	A1(){
		t=new JTextField();
		b= new JButton();
		d=new JTextField();
		t.setBounds(20,20,80,30);
		d.setBounds(220, 20, 80, 30);
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "/", "*", "%"}));
		comboBox.setBounds(120, 20, 80, 30);
		textArea = new JTextArea();
		textArea.setBounds(80, 80, 150, 70);
		textArea.setText("Result Box");
		b.setBounds(100, 180, 120, 50);
		b.setText("CalCulate");
		b.addActionListener(this);
		add(textArea);
		add(b);
		add(comboBox);
		add(t);
		add(d);
		setSize(350,300);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		int c;
		if(comboBox.getSelectedItem()=="+"){
			c=Integer.parseInt(t.getText())+Integer.parseInt(d.getText());
			textArea.setText("Result is "+Integer.toString(c));
		}else if(comboBox.getSelectedItem()=="-"){
			c=Integer.parseInt(t.getText())-Integer.parseInt(d.getText());
			textArea.setText("Result is "+Integer.toString(c));
		}else if(comboBox.getSelectedItem()=="/"){
			c=Integer.parseInt(t.getText())/Integer.parseInt(d.getText());
			textArea.setText("Result is "+Integer.toString(c));
		}else if(comboBox.getSelectedItem()=="*"){
			c=Integer.parseInt(t.getText())*Integer.parseInt(d.getText());
			textArea.setText("Result is "+Integer.toString(c));
		}else if(comboBox.getSelectedItem()=="%"){
			c=Integer.parseInt(t.getText())%Integer.parseInt(d.getText());
			textArea.setText("Result is "+Integer.toString(c));
		}
		
	}
	public static void main(String[] argsv){
		new A1();
	}

}
