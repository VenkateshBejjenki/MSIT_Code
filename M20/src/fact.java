import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fact extends Frame implements ActionListener {
	static int c=1;
	TextField tf1,tf2;
	Label l1,l2;
	
	fact(){
		this.setTitle("Factorial");
		l1=new Label();
		l1.setText("N");
		l1.setBounds(0, 30, 10, 30);
		tf1=new TextField();
		tf1.setBounds(30, 30, 50, 30);
		
		l2=new Label();
		l2.setText("Factorial");
		l2.setBounds(80, 30, 60, 30);
		tf2=new TextField();
		tf2.setBounds(150, 30, 220, 30);
		
		Button bt =new Button("Fact");
		bt.setBounds(300,65,80,30);
		bt.addActionListener(this);
		bt.setBackground(Color.yellow);
		
		tf1.setText("1");
		tf2.setText("1");
		add(bt);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		setSize(400,100);
		setLayout(null);
		setVisible(true);
		setBackground(Color.red);
		
	}
	public void actionPerformed(ActionEvent e) {
		double fact=1;
		c++;
		for(int i=c;i>=1;i--){
			fact*=i;
			System.out.println(i);
		}
		System.out.println(fact);
		tf1.setText(Integer.toString(c));
		tf2.setText(Double.toString(fact));
		
	}
	public static void main(String[] argvs){
		new fact();
	}
}
