package guiver1;

import javax.swing.JOptionPane;

public class Tea1_GUI extends Order1_GUI {
	private boolean sugar;

	public Tea1_GUI(String size,int amount,Initual_GUI1 label) {
		super(size,amount);
		if(JOptionPane.showConfirmDialog(label, "Would you like sugar?","Sugar",JOptionPane.YES_NO_OPTION)==0) sugar=true;
		else sugar=false;
		double price;
		if(size.equals("Small")) price=3.0;
		else if(size.equals("Medium")) price=4.0;
		else price=5.0;
		if(sugar) price*=1.25;
		setPrice(price);
	}
	
	public String toString() {
		if(sugar) return super.toString()+"Tea with sugar";
		else return super.toString()+"Tea";
	}
}