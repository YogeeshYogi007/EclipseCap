package javaAwt;

import java.awt.*;

public class awtusinginterface extends Frame{
	
	public awtusinginterface() {
		
		Button b = new Button("Click Here");
		b.setBounds(40, 100, 80, 40);
		add(b);
		setSize(300,300);
		setTitle("Welcome Yogi");
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		awtusinginterface ex1 = new awtusinginterface();
	}

}
