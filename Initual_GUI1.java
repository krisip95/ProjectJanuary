package guiver1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Initual_GUI1 {
    private static JLabel labelSize;
    private static JLabel labelOrder;
    private static JLabel labelGlass;
    private static JTextArea areaReport;
    private static JComboBox<String> size;
    private static JRadioButton rdJuice;
    private static JRadioButton rdWater;
    private static JRadioButton rdTea;
    private static JRadioButton rdCoffee;
    private static ButtonGroup btnGroup;
    private static JTextField txtGlass;
    private static JButton btnAdd;
    private static JButton btnOrder;
    static int amount_of;
    static ArrayList<Order1_GUI> list_of_beverages = new ArrayList<Order1_GUI>();


    public static void main(String[] args) {
        //Initial_GUI app = new InitialGUI();
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(600, 400);
        setLocationRelativeTo(null);
        frame.setTitle("NEO zone");
        labelSize = new JLabel("Select size:");
        labelSize.setForeground(Color.green);
        labelSize.setSize(250, 50);
        labelSize.setLocation(100, 10);
        frame.add(labelSize);
        frame.getContentPane().setBackground(Color.black);

        

        String[] sizes = { "Small", "Medium", "Large" };
        size = new JComboBox<String>(sizes);//
        size.setSelectedIndex(0); // задаваме, че default e small 
        size.setSize(100, 25);
        size.setLocation(100, 50);
        size.setBackground(Color.green);
        frame.add(size);

        labelOrder = new JLabel("Select which type of beverage you want to order:");
        labelOrder.setForeground(Color.green);
        labelOrder.setSize(500, 50);
        labelOrder.setLocation(100, 75);
        frame.add(labelOrder);

        btnGroup = new ButtonGroup();

        rdJuice = new JRadioButton("Juice");
        rdJuice.setBackground(Color.black);
        rdJuice.setForeground(Color.green);
        rdJuice.setSize(75, 50);
        rdJuice.setLocation(100, 110);
        frame.add(rdJuice);
        
        rdWater = new JRadioButton("Water");
        rdWater.setBackground(Color.black);
        rdWater.setForeground(Color.green);
        rdWater.setSize(75, 50);
        rdWater.setLocation(175, 110);
        frame.add(rdWater);

        rdTea = new JRadioButton("Tea");
        rdTea.setBackground(Color.black);
        rdTea.setForeground(Color.green);
        rdTea.setSize(75, 50);
        rdTea.setLocation(250, 110);
        frame.add(rdTea);

        rdCoffee = new JRadioButton("Coffee");
        rdCoffee.setBackground(Color.black);
        rdCoffee.setForeground(Color.green);
        rdCoffee.setSize(75, 50);
        rdCoffee.setLocation(325, 110);
        frame.add(rdCoffee);

        btnGroup.add(rdJuice);
        btnGroup.add(rdWater);
        btnGroup.add(rdTea);
        btnGroup.add(rdCoffee);

        labelGlass = new JLabel("Type how many glasses you want to order:");
        labelGlass.setForeground(Color.green);
        labelGlass.setSize(500, 50);
        labelGlass.setLocation(100, 145);
        frame.add(labelGlass);

        txtGlass = new JTextField(); // за чашите 
        txtGlass.setBackground(Color.lightGray);
        txtGlass.setSize(300, 25);
        txtGlass.setLocation(100, 185);
        frame.add(txtGlass);
       
        btnAdd = new JButton("Add");
        btnAdd.setForeground(Color.black);
        btnAdd.setBackground(Color.green);
        btnAdd.setSize(120, 40);
        btnAdd.setLocation(100, 230);
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String size_of = (String) size.getSelectedItem();
                if (rdJuice.isSelected() || rdTea.isSelected() || rdCoffee.isSelected()|| rdWater.isSelected() && !(txtGlass.getText().isEmpty())) {
                    try {
                        amount_of = Integer.parseInt(txtGlass.getText().trim());
                        Order1_GUI beverage;
                        if (rdJuice.isSelected()) {
                            beverage = new Juice1_GUI(size_of, amount_of, frame);
                        } else if (rdWater.isSelected()) {
                            beverage = new Water1_GUI(size_of, amount_of, frame);
                        } else if (rdTea.isSelected()) {
                            beverage = new Tea1_GUI(size_of, amount_of, frame);
                        } else {
                            beverage = new Coffee1_GUI(size_of, amount_of, frame);
                        }
                        
                        txtGlass.setText(null);
                        list_of_beverages.add(beverage);
                        areaReport.setText(areaReport.getText() + beverage.toString() + " added" +"\n");
                        btnGroup.clearSelection();
                        btnOrder.setEnabled(true);
                        
                    } catch (NumberFormatException e1) { //ако въведеното не може да се конвертира като [String,char,double etc...]
                        JOptionPane.showMessageDialog(null, frame, "Enter an integer as amount", amount_of);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Choose a beverage type and enter an amount");
                    // if none of the radio buttons are selected or the textField is empty
                }
            }
        });
        
        frame.add(btnAdd);

        btnOrder = new JButton("Order");
        btnOrder.setForeground(Color.black);
        btnOrder.setBackground(Color.green);
        btnOrder.setSize(120, 40);
        btnOrder.setLocation(280, 230);
        btnOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String report = "";
                double pay = 0.0;
                for (int i = 0; i < list_of_beverages.size(); i++) {
                    Order1_GUI beveragei = list_of_beverages.get(i);
                    report += beveragei.toString();
                    double totalprice_of_product = beveragei.getAmount() * beveragei.getPrice();
                    pay += totalprice_of_product;
                    report = report + " - " + totalprice_of_product + " Lv\n";
      
                }

                frame.setVisible(true);
                JOptionPane.showMessageDialog(frame, areaReport.getText());
                JOptionPane.showMessageDialog(frame, "You should pay " + pay + " Lv" + amount_of);
                areaReport.setText(null);
                btnOrder.setEnabled(false);
                list_of_beverages.clear(); 
            }
        });
        
        // btnOrder.setEnabled(false);
        frame.add(btnOrder);

        areaReport = new JTextArea(); //показва какво сме добавили
        areaReport.setBackground(Color.lightGray);
        areaReport.setSize(300, 150);
        areaReport.setLocation(100, 290);
        frame.add(areaReport);

        frame.setVisible(true);
    }

    private static void setVisible(boolean b) { 
        // TODO Auto-generated method stub

    }

    private static void setLocationRelativeTo(Object object) {
        // TODO Auto-generated method stub

    }
}
