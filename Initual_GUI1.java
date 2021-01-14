package guiver1;

 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

 

public class Initual_GUI1 implements ActionListener{
	private static JLabel labelSize;
	private static JLabel labelOrder;
	private static JLabel labelGlass;
	private static JLabel labelReport;
    private static JComboBox<String> size;
    private static JRadioButton rdJuice;
	private static JRadioButton rdWater;
	private static JRadioButton rdTea;
	private static JRadioButton rdCoffee;
    private static ButtonGroup btnGroup;
    private static JTextField txtGlass;
    private static JButton btnAdd;
	private static JButton btnOrder;
	
    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(600,400);
        setLocationRelativeTo(null);
        frame.setTitle("Order");
        frame.setVisible(true);
        labelSize = new JLabel("Select size:");
        labelSize.setSize(250, 50);
        labelSize.setLocation(100, 10);
        frame.add(labelSize);
        
        String[] sizes = {"Small","Medium","Large"};
        size = new JComboBox<String>(sizes);//
        size.setSelectedIndex(0); //задаваме че default е small
        size.setSize(100, 25);
        size.setLocation(100, 50);
        frame.add(size);
        
        labelOrder = new JLabel("Select which type of beverage you want to order:");
        labelOrder.setSize(500, 50);
        labelOrder.setLocation(100, 75);
        frame.add(labelOrder);
        
        btnGroup = new ButtonGroup();
        
        rdJuice = new JRadioButton("Juice");
        rdJuice.setSize(75, 50);
        rdJuice.setLocation(100, 110);
        frame.add(rdJuice);
        
        rdWater = new JRadioButton("Water");
        rdWater.setSize(75, 50);
        rdWater.setLocation(175, 110);
        frame.add(rdWater);
        
        rdTea = new JRadioButton("Tea");
        rdTea.setSize(75, 50);
        rdTea.setLocation(250, 110);
        frame.add(rdTea);
        
        rdCoffee = new JRadioButton("Coffee");
        rdCoffee.setSize(75, 50);
        rdCoffee.setLocation(325, 110);
        frame.add(rdCoffee);
        
        btnGroup.add(rdJuice);
        btnGroup.add(rdWater);
        btnGroup.add(rdTea);
        btnGroup.add(rdCoffee);
        
        labelGlass = new JLabel("Type how many glasses you want to order:");
        labelGlass.setSize(500, 50);
        labelGlass.setLocation(100, 145);
        frame.add(labelGlass);
        
        txtGlass = new JTextField(); //за чашите
        txtGlass.setSize(300, 25);
        txtGlass.setLocation(100, 185);
        frame.add(txtGlass);
        
        btnAdd = new JButton("Add");
        btnAdd.setSize(120, 40);
        btnAdd.setLocation(100, 230);
        frame.add(btnAdd);
        
        btnOrder = new JButton("Order");
        btnOrder.setSize(120, 40);
        btnOrder.setLocation(280, 230);
        //btnOrder.setEnabled(false);
        frame.add(btnOrder);
        
        labelReport = new JLabel(); //показва какво сме добавили
        labelReport.setSize(500, 50);
        labelReport.setLocation(100, 270);
        frame.add(labelReport); 
    

    JOptionPane.showInputDialog(this, labelReport);
	JOptionPane.showInputDialog(this, "You should pay " + " Lv");
	labelReport.setText(null);
	btnOrder.setEnabled(false);
	
    
    }

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
    
        }
		
	

	private static void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}    
	
	
}    
