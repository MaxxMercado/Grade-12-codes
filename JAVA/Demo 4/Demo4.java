import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Demo4 implements ActionListener{

    public static void main(String args[]){

        ImageIcon dream = new ImageIcon("Dreamy.png");
        Border border = BorderFactory.createLineBorder(Color.ORANGE);

        JButton pindot = new JButton();
        pindot.setBounds(300, 300, 150, 150);
        pindot.setText("Click me");

        JLabel head = new JLabel();
        head.setText("Computer programming");
        head.setBounds(10, 10, 450,200);
        head.setBorder(border);
        head.setFont(new Font("Arial", Font.ITALIC, 25));
        head.setHorizontalAlignment(head.CENTER);
        head.setVerticalAlignment(head.CENTER);
        head.setBackground(Color.red);
        head.setOpaque(true);
        head.setForeground(Color.black);

        JFrame window = new JFrame();
        window.setTitle("Demo Day 4: Java 2");
        window.setVisible(true);
        window.setLayout(null);
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setIconImage(dream.getImage());

        window.add(head);
        window.add(pindot);
        
        //pindot.addActionListener(new Demo4()); first way 

       // pindot.addActionListener(e->hello());
          pindot.addActionListener(e->change(head));

    }

    public static void change(JLabel head){
        //head.setText("Grade 12 cprog ");
        JOptionPane pop = new JOptionPane();
        String num1 = JOptionPane.showInputDialog("Enter first number: ");
        int _num1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("Enter second number: ");
        int _num2 = Integer.parseInt(num2);

        int sum = _num1 + _num2;

        pop.showMessageDialog(null, "thank you");

        head.setText("sum = " + sum);
    }

    public static void hello(){
        int count = 0;
        count++;
        System.out.println("your count is: " + count);
    }

    public void actionPerformed(ActionEvent e){ //first way 

        System.out.println("Hellow Computer programming");

    }
}
