package javaAwt;
import java.awt.*;
public class usingAssociation {
	usingAssociation(){
		Frame f = new Frame();
		Button b = new Button("Enter");
		Label l = new Label("Enter Your Name Here: ");
		TextField t= new TextField();
		t.setBounds(20, 100, 80, 30);
		l.setBounds(200, 80, 80, 80);
		b.setBounds(100, 100, 80, 30);
		f.add(b);
		f.add(l);
		f.add(t);
		f.setSize(400, 300);
		f.setTitle("Welcome Enter Your Details here");
		f.setLayout(null);
		f.setVisible(true);
		}
	
	public static void main(String[] args) {
		usingAssociation u = new usingAssociation();
	}

}
