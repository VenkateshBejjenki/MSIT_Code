import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import javax.swing.JTable;



public class mainWindow extends Applet{


	public void init(){
		Button b=new Button("ok");
		add(b);
		Button b2=new Button();
		b2.setLabel("Cancle");
		add(b2);
		Checkbox ck=new Checkbox("CheckBox",null,true);
		//ck.setLabel("CheckBox");
		add(ck);
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox cb1=new Checkbox("one",cg,true);
		Checkbox cb2=new Checkbox("Two",cg,false);
		Checkbox cb3=new Checkbox("three",cg,false);
		add(cb1);
		add(cb2);
		add(cb3);
		
	}
	/*public static void main(String[] argsv){
		Button b1=new Button("ok");
		b1.setSize(20, 20);
		Button b2=new Button("kk");
		b2.setSize(20, 20);
		Frame frame; 
		frame=new Frame("Title");
		frame.setSize(300, 300);
		frame.add(b1);
		frame.add(b2);
		frame.setVisible(true);
		//frame.validate();
	}*/

	

}
