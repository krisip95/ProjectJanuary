package guiver1;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Coffee1_GUI extends Order1_GUI {
	private boolean milk; 

	public Coffee1_GUI(String size,int amount,Component parent) {
        super(size,amount);
        if(JOptionPane.showConfirmDialog(parent, "Would you like milk?","Milk",JOptionPane.YES_NO_OPTION)==0) milk=true;
		else milk=false;
		double price;
		if(size.equals("Small")) price=3.5;
		else if(size.equals("Medium")) price=5;
		else price=6.5;
		if(milk) price*=1.5;
		setPrice(price);
	}

	public String toString() {
		if(milk) return super.toString()+" Coffee with milk";
		else return super.toString()+" Coffee";
	}
}