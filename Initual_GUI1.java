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

public class Initual_GUI1 extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel labelSize,labelOrder,labelGlass,labelReport;
	private JComboBox<String> size;
	private JRadioButton rdJuice,rdWater,rdTea,rdCoffee;
	private ButtonGroup btnGroup;
	private JTextField txtGlass;
	private JButton btnAdd,btnOrder;
	
	public Initual_GUI1() {
		setLayout(null);
		setSize(600,400);
		setLocationRelativeTo(null);
		setTitle("Order");
		init();
		btnAdd.addActionListener(this); 
		btnOrder.addActionListener(this);
		setVisible(true);
		
	}
	
	public void init() {
		labelSize = new JLabel("Select size:");
		labelSize.setSize(250, 50);
		labelSize.setLocation(100, 10);
		add(labelSize);
		
		String[] sizes = {"Small","Medium","Large"};
		size = new JComboBox<String>(sizes);//
		size.setSelectedIndex(0);// задаваме че default е small
		size.setSize(100, 25);
		size.setLocation(100, 50);
		add(size);
		
		labelOrder = new JLabel("Select which type of beverage you want to order:");
		labelOrder.setSize(500, 50);
		labelOrder.setLocation(100, 75);
		add(labelOrder);
		
		btnGroup = new ButtonGroup();
		
		rdJuice = new JRadioButton("Juice");
		rdJuice.setSize(75, 50);
		rdJuice.setLocation(100, 110);
		add(rdJuice);
		
		rdWater = new JRadioButton("Water");
		rdWater.setSize(75, 50);
		rdWater.setLocation(175, 110);
		add(rdWater);
		
		rdTea = new JRadioButton("Tea");
		rdTea.setSize(75, 50);
		rdTea.setLocation(250, 110);
		add(rdTea);
		
		rdCoffee = new JRadioButton("Coffee");
		rdCoffee.setSize(75, 50);
		rdCoffee.setLocation(325, 110);
		add(rdCoffee);
		
		btnGroup.add(rdJuice);
		btnGroup.add(rdWater);
		btnGroup.add(rdTea);
		btnGroup.add(rdCoffee);
		
		labelGlass = new JLabel("Type how many glasses you want to order:");
		labelGlass.setSize(500, 50);
		labelGlass.setLocation(100, 145);
		add(labelGlass);
		
		txtGlass = new JTextField(); //за чашите
		txtGlass.setSize(300, 25);
		txtGlass.setLocation(100, 185);
		add(txtGlass);
		
		btnAdd = new JButton("Add");
		btnAdd.setSize(120, 40);
		btnAdd.setLocation(100, 230);
		add(btnAdd);
		
		btnOrder = new JButton("Order");
		btnOrder.setSize(120, 40);
		btnOrder.setLocation(280, 230);
		btnOrder.setEnabled(false);
		add(btnOrder);
		
		labelReport = new JLabel(); //показва какво сме добавили 
		labelReport.setSize(500, 50);
		labelReport.setLocation(100, 270);
		add(labelReport);
	
	
			JOptionPane.showMessageDialog(this, labelReport);
			JOptionPane.showMessageDialog(this,	 "You should pay " + " Lv");
			labelReport.setText(null);
			btnOrder.setEnabled(false);
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
		
	}	
	

