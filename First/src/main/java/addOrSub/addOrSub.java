package addOrSub;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;

public class addOrSub {

	public static void main(String[] args) {
	
		Frame f = new Frame();
		GridLayout G = new GridLayout(2,6);
        f.setLayout(G);
        
        Button FB = new Button("First No.");
        TextField FT = new TextField(20);
        Button SB = new Button("Second No.");
        TextField ST = new TextField(20);
        JButton Add = new JButton("Addition");
        JButton Sub = new JButton("Subtraction");
        TextField RT = new TextField(20);
        
        f.add(FB);
        f.add(FT);
        f.add(SB);
        f.add(ST);
        
        f.setSize(400,400);
        f.setVisible(true);
	}

}
