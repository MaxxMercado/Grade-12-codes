 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.border.*;


public class Calculatortest extends JFrame implements ActionListener {
    String s0,s1,s2;

    static JTextField input;

    Calculatortest()
    {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[]){
   
        input = new JTextField();
        input.setText("Input area");
        input.setBounds(150, 300, 150, 30);
        input.setBorder(BorderFactory.createLineBorder(Color.black));
        input.setEditable(false);


        JButton one = new JButton("1");
        one.setBounds(150, 350, 50, 50);

        JButton two = new JButton("2");
        two.setBounds(200, 350, 50, 50);

        JButton three = new JButton("3");
        three.setBounds(250, 350, 50, 50);

        JButton four = new JButton("4");
        four.setBounds(150, 400, 50, 50);

        JButton five = new JButton("5");
        five.setBounds(200, 400, 50, 50);

        JButton six = new JButton("6");
        six.setBounds(250, 400, 50, 50);      

        JButton seven = new JButton("7");
        seven.setBounds(150, 450, 50, 50);

        JButton eight = new JButton("8");
        eight.setBounds(200, 450, 50, 50);
    
        JButton nine = new JButton("9");
        nine.setBounds(250, 450, 50, 50);

        JButton zero = new JButton("0");
        zero.setBounds(200, 500, 50, 50);

        JButton clear = new JButton("c");
        clear.setBounds(300, 350, 50, 50);

        JButton equals = new JButton("=");
        equals.setBounds(300, 500, 50, 50);

        JButton plus = new JButton("+");
        plus.setBounds(300, 400, 50, 50);

        JButton minus = new JButton("-");
        minus.setBounds(300, 450, 50, 50);
        
        JButton div = new JButton("/");
        div.setBounds(150, 500, 50, 50);

        JButton multiplication = new JButton("*");
        multiplication.setBounds(250, 500, 50, 50);

        JButton period = new JButton(".");
        period.setBounds(350, 350, 50, 50);

        JFrame window = new JFrame();
        window.setTitle("calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLayout(null);
        window.setSize(500,700);
        window.setResizable(false);
        
        Calculatortest c = new Calculatortest();

        one.addActionListener(c);
        two.addActionListener(c);
        three.addActionListener(c);
        four.addActionListener(c);
        five.addActionListener(c);
        six.addActionListener(c);
        seven.addActionListener(c);
        eight.addActionListener(c);
        nine.addActionListener(c);
        zero.addActionListener(c);
        clear.addActionListener(c);
        equals.addActionListener(c);
        plus.addActionListener(c);
        minus.addActionListener(c);
        div.addActionListener(c);
        multiplication.addActionListener(c);
        period.addActionListener(c);

        window.add(input);
        window.add(one);
        window.add(two);
        window.add(three);
        window.add(four);
        window.add(five);
        window.add(six);
        window.add(seven);
        window.add(eight);
        window.add(nine);
        window.add(zero);
        window.add(clear);
        window.add(equals);
        window.add(plus);
        window.add(minus);
        window.add(div);
        window.add(multiplication);
        window.add(period);
    }

    public void actionPerformed(ActionEvent e ){
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else 
                s0 = s0 + s;
            
            input.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'c'){
            s0 = s1 = s2 = "";

            input.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '='){
            double num;
            if (s1.equals("+"))
                num = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                num = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                num = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else 
                num = (Double.parseDouble(s0) * Double.parseDouble(s2));

                input.setText(s0 + s1 + s2 + "=" + num);

                s0 = Double.toString(num);

                s1 = s2 = "";
        }
        else {
            if (s1.equals("") || s2.equals(""))
            s1 = s;
            else {
                double num;
            if (s1.equals("+"))
                num = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                num = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                num = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else 
                num = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(num);
                s1 = s;
                s2 = "";

            }
            input.setText(s0 + s1 + s2);
           

        }
    }
}