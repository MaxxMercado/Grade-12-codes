package Mercado_Activity2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Index {
    
    public static void main(String args[]){

        ImageIcon logo = new ImageIcon("Calculator.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        
    
        JLabel header = new JLabel();
        header.setText("Maangas All in one na calculator");
        header.setBounds(10,10,450,200);
        header.setFont(new Font("Arial", Font.CENTER_BASELINE, 25));
        header.setHorizontalAlignment(header.CENTER);
        header.setVerticalAlignment(header.CENTER);
        header.setBackground(Color.BLACK);
        header.setOpaque(true);
        header.setForeground(Color.WHITE);
        header.setBorder(border);

        JButton button = new JButton();
        button.setBounds(130 , 225, 200, 70);
        button.setText("Calculate!!!!");

        JLabel name = new JLabel();
        name.setText(" ");
        name.setBounds(100, 280, 400,100);
        name.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        JLabel sum = new JLabel();
        sum.setText("Sum: ");
        sum.setBounds(30, 350, 400,100);
        sum.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        JLabel diff = new JLabel();
        diff.setText("Difference: ");
        diff.setBounds(300, 350, 400,100);
        diff.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
       
        JLabel quo = new JLabel();
        quo.setText("Quotient: ");
        quo.setBounds(30, 450, 400,100);
        quo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
       
        JLabel pro = new JLabel();
        pro.setText("Product: ");
        pro.setBounds(300, 450, 400,100);
        pro.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        JLabel rem = new JLabel();
        rem.setText("Remainder: ");
        rem.setBounds(120, 550, 400,100);
        rem.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
       
        JFrame window = new JFrame();
        window.setTitle("Calculator");
        window.setVisible(true);
        window.setLayout(null);
        window.setSize(500, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setIconImage(logo.getImage());

        window.add(header);
        window.add(name);
        window.add(sum);
        window.add(diff);
        window.add(quo);
        window.add(pro);
        window.add(button);
        window.add(rem);
    
        button.addActionListener(e->calculate(sum, diff,quo,pro, rem,name));
    }

    public static void calculate(JLabel sum, JLabel diff, JLabel quo, JLabel pro, JLabel rem, JLabel name){
        JOptionPane pop = new JOptionPane();

        String na = JOptionPane.showInputDialog("Enter name : ");
        
        pop.showMessageDialog(null, "Welcome " + na +" To the Maangas All in one calculator");

        String num1 = JOptionPane.showInputDialog("Value of number1 ");
        int _num1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("Value of number2: ");
        int _num2 = Integer.parseInt(num2);

        pop.showMessageDialog(null, "Calculating");

        int add = _num1 + _num2;
        int sub = _num1 - _num2;
        int div = _num1 / _num2;
        int mul = _num1 * _num2;
        int r = _num1 % _num2;

        name.setText("Hello " + na + "! " + "The results of the operation");
        sum.setText("Sum = " + _num1 + " + " + _num2 + " = " + add );
        diff.setText("Difference = " + _num1 + " - " + _num2 + " = " + sub );
        quo.setText("Quotient = " + _num1 + " / " + _num2 + " = " + div );
        pro.setText("Product = " + _num1 + " * " + _num2 + " = " + mul );
        pro.setText("Product = " + _num1 + " * " + _num2 + " = " + mul );
        rem.setText("Remainder = " + r);
    }
 
    
   
}
