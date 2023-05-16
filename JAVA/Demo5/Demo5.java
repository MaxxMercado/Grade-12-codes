import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class Demo5 implements ActionListener{

    public static void main(String args[]){
        JTextField inputnum1 = new JTextField("");
        inputnum1.setBounds(170,70, 150, 30 ); 

        JTextField inputnum2 = new JTextField("");
        inputnum2.setBounds(170,100, 150, 30 ); 

        JButton butt = new JButton("click me");
        butt.setBounds(170, 135, 120, 80);
        // butt.setPreferredSize(new Dimension(150, 70));

        JLabel title = new JLabel();
        title.setText("Demo day  5");
        title.setBounds(10, -25, 450, 150);
        title.setFont(new Font("Arial", Font.BOLD, 17));
        title.setHorizontalAlignment(JLabel.CENTER);

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setSize(500,500);
        // window.setLayout(new FlowLayout(0));

        window.add(title);
        window.add(butt);
        window.add(inputnum1);
        window.add(inputnum2);

        butt.addActionListener(new Demo5());

        Demo5 demo = new Demo5();

        // butt.addActionListener(e -> demo.countHi());
        butt.addActionListener(e -> inputgetset(inputnum1, inputnum2, title));
    }

    public static void inputgetset(JTextField inputnum1, JTextField inputnum2,  JLabel title){
        String inputdata = inputnum1.getText();
        String _inputdata = inputdata.trim();

        String inputdata2 = inputnum2.getText();
        String _inputdata2 = inputdata2.trim();

        if(_inputdata.isEmpty() || _inputdata2.isEmpty()){
            JOptionPane.showMessageDialog(null, "missing data");
        }else{
            double d_inputdata = Double.parseDouble(_inputdata);
            double d_inputdata2 = Double.parseDouble(_inputdata2);

            double sum = d_inputdata + d_inputdata2;
            
            title.setText(inputdata + " + " + inputdata2 + " = " + sum); 
        }


    }

    int count = 1;

    public void countHi(){
        System.out.println(count + "Hi");
        count++;
    }

   
    public void actionPerformed(ActionEvent e){
        System.out.println(count + "Hello world");
        count++;
    }

}