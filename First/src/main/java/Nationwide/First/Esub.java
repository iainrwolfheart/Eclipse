package Nationwide.First;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Esub implements ActionListener{
	TextField No1, No2, Result;

    public Esub(TextField A, TextField B, TextField C){
        No1=A;
        No2=B;
        Result=C;
    }
    public void actionPerformed (ActionEvent e){
        int a, b, c;
        a=Integer.parseInt(No1.getText());
        b=Integer.parseInt(No2.getText());
        c=a-b;
        Result.setText(Integer.toString(c));
    }
}