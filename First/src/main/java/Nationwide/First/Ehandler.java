package Nationwide.First;

import java.awt.*;
import java.awt.event.*;

public class Ehandler implements ActionListener{
	 TextField T1;
		
	public Ehandler (TextField A) {
		T1=A;
	}
		
	public void actionPerformed(ActionEvent d) {
		Button btn=(Button) d.getSource();
		T1.setText(T1.getText()+btn.getLabel());
	}
}