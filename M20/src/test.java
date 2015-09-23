
import java.awt.*;


public class test extends Frame {
	test(){
		Button bt=new Button("Ok");
		bt.setBounds(30,50,80,30);
		add(bt);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setBackground(Color.yellow);
	}
	public static void main(String[] argvs){
		test y=new test();
	}
}	
