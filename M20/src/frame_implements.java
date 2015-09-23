
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frame_implements extends Frame implements ActionListener {
	TextField tf,tf2,tf3;
	Label l;
	frame_implements(){
		this.setTitle("Rajesh");
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		tf2=new TextField();
		tf2.setBounds(60,80,170,20);
		tf3=new TextField();
		tf3.setBounds(60,120,170,20);
		
		Button bt = new Button("Click Me");
		bt.setBounds(100,150,80,30);
		bt.addActionListener(this);
		Label l=new Label();
		l.setText("Program");
		l.setBounds(120,30,100,15);
		add(tf3);
		add(tf2);
		add(l);
		add(bt);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setBackground(Color.orange);
	}
	public void actionPerformed(ActionEvent e) {
		
		String strI = Integer.toString(Integer.parseInt(tf.getText())+Integer.parseInt(tf2.getText()));
		System.out.println(strI);
		tf3.setText(strI);
		
	}
	public static void main(String[] argvs){
		new frame_implements();
	}
	
}	
