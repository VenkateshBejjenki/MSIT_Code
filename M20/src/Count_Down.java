import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Count_Down extends Frame implements ActionListener {
	TextField tf;
	Label l;
	int cot=88;
	Count_Down(){
		this.setTitle("Count Down");
		tf=new TextField();
		tf.setBounds(100,50,170,20);
		tf.setText("88");
		Button bt = new Button("Click Me");
		bt.setBounds(300,50,80,30);
		bt.addActionListener(this);
		Label l=new Label();
		l.setText("Count");
		l.setBounds(0,50,100,15);
		add(l);
		add(bt);
		add(tf);
		setSize(400,100);
		setLayout(null);
		setVisible(true);
		setBackground(Color.orange);
		
	}
	public void actionPerformed(ActionEvent e) {
		cot--;
		String strI = Integer.toString(cot);
		System.out.println(strI);
		tf.setText(strI);
		
	}
	public static void main(String[] argvs){
		new Count_Down();
	}

}
