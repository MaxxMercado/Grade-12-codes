import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Mercado_Test2 implements ActionListener {
    public static void main (String args[]){

        //bmi calcu
        JLabel head = new JLabel();
        head.setText("Adult BMI Calculator");
        head.setBounds(30,0,400,50);
        head.setHorizontalAlignment(JLabel.CENTER);
        head.setFont(new Font("arial", Font.BOLD, 20));
        head.setBackground(Color.yellow);
        head.setOpaque(true);

        JLabel results = new JLabel();
        results.setText("BMI Results = 0 (Status)");
        results.setBounds(30,75,400,50);
        results.setHorizontalAlignment(JLabel.CENTER);
        results.setFont(new Font("arial", Font.BOLD, 15));
    
        JTextField weight = new JTextField();
        weight.setBounds(80,135,120,30);

        JTextField height = new JTextField();
        height.setBounds(250,135,120,30);

        JLabel text_weight = new JLabel();
        text_weight.setText("Weight (KG)");
        text_weight.setBounds( 110,155,400,50);

        JLabel text_height = new JLabel();
        text_height.setText("Height (Meters)");
        text_height.setBounds(265,155,400,50);

        JButton convert = new JButton("Convert");
        convert.setBounds(90, 200, 100, 30);
        
        JButton clear  = new JButton("Clear");
        clear.setBounds(260, 200, 100, 30);
        

        //height/weight converter
        JLabel head2 = new JLabel();
        head2.setText("Height | Weight Converter");
        head2.setBounds(30,250,400,50);
        head2.setHorizontalAlignment(JLabel.CENTER);
        head2.setFont(new Font("arial", Font.BOLD, 20));
        head2.setBackground(Color.yellow);
        head2.setOpaque(true);
        
        JLabel results2 = new JLabel();
        results2.setText("Results");
        results2.setBounds(30, 300,400,50);
        results2.setHorizontalAlignment(JLabel.CENTER);
        results2.setFont(new Font("arial", Font.BOLD, 15));

        JButton lbstokg = new JButton("lbs to kg");
        lbstokg.setBounds(30, 350, 100, 30);

        JButton inchtomet = new JButton("inches to meters");
        inchtomet.setBounds(170, 350, 120, 30);
        inchtomet.setFont(new Font("arial", Font.BOLD, 10));

        JButton fttomet = new JButton("ft to meters");
        fttomet.setBounds(320, 350, 100, 30);

        JButton cmtomet = new JButton("cm to meters");
        cmtomet.setBounds(170, 400, 120, 30);

        JFrame window = new JFrame();
        window.setTitle("Adult BMI Calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLayout(null);
        window.setSize(500,600);
        window.setResizable(false);
        window.getContentPane();

        window.add(head);
        window.add(results);
        window.add(weight);
        window.add(height);
        window.add(text_weight);
        window.add(text_height);
        window.add(convert);
        window.add(clear);
        window.add(head2);
        window.add(results2);
        window.add(lbstokg);
        window.add(inchtomet);
        window.add(fttomet);
        window.add(cmtomet);

        convert.addActionListener(e -> converting (weight,height,results));
        clear.addActionListener(e -> clearing (weight,height,results));
        lbstokg.addActionListener(e -> lbs_kg (results2));
        inchtomet.addActionListener(e -> inch_met(results2));
        fttomet.addActionListener(e -> ft_met(results2));
        cmtomet.addActionListener(e -> cm_met(results2));

        }

//BMI CALCULATOR
        public static void converting (JTextField weight, JTextField height, JLabel results){
             String _weight = weight.getText();
             String weight1 = _weight.trim();

             String _height = height.getText();
             String height1 = _height.trim();

             if (weight1.isEmpty() || height1.isEmpty() ){
                JOptionPane.showMessageDialog(null, "Pls input a number" );
            }else{
                double weight2 = Double.parseDouble(weight1);
                double height2 = Double.parseDouble(height1);

                double bmi = weight2 / (height2 * height2) ;

                if(bmi < 18.4){
                    results.setText("BMI Results = " + bmi + " Status: Underweight");
                }
                else if (bmi > 18.5 && bmi < 24.9){
                    results.setText("BMI Results = " + bmi + " Status: Normal");
                }   
                else if (bmi > 25.0 && bmi < 39.9){
                    results.setText("BMI Results = " + bmi + " Status: Overweight");
                
                }else if (bmi > 40.0){
                    results.setText("BMI Results = " + bmi + " Status: Obese");
                }else {
                    results.setText("ERROR");
                }
            }

        }

        public static void clearing(JTextField weight, JTextField height, JLabel results){
            weight.setText(" ");
            height.setText(" ");
            results.setText("BMI Results = 0 (Status)");
            
        }



// HEIGHT || WEIGHT CONVERTER 

        public static void lbs_kg(JLabel results2){

            String lbs = JOptionPane.showInputDialog("Enter Lbs:  ");
            double _lbs = Double.parseDouble(lbs);

            double kg = _lbs * 0.45359237;

            JOptionPane.showMessageDialog(null,  _lbs + " Lbs to Kg is = " + kg +" Kg ");
            results2.setText(_lbs + " Lbs to Kg is = " + kg +" Kg" );
        }

        public static void inch_met(JLabel results2){
            String inch = JOptionPane.showInputDialog("Enter Inch:  ");
            double _inch = Double.parseDouble(inch);

            double meters = _inch *  0.0254;
            JOptionPane.showMessageDialog(null,  _inch + " Inch to Meters is = " + meters + " Meters ");
            results2.setText( _inch + " Inch to Meters is = " + meters + " Meters ");

        }

        public static void ft_met(JLabel results2){
            String Feet = JOptionPane.showInputDialog("Enter Feet:  ");
            double _ft = Double.parseDouble(Feet);
   
            double meters = _ft *  0.3048;
            JOptionPane.showMessageDialog(null,  _ft + " Feet to Meters is = " + meters + " Meters ");
            results2.setText(_ft + " Feet to Meters is = " + meters + " Meters ");
        }
        public static void cm_met(JLabel results2){
            String cm = JOptionPane.showInputDialog("Enter CM:  ");
            double _cm = Double.parseDouble(cm);
   
            double meters = _cm *  0.01;
            JOptionPane.showMessageDialog(null,  _cm + " Centimeters to Meters is = " + meters + " Meters ");
            results2.setText(_cm + " Centimeters to Meters is = " + meters + " Meters ");
           }
   

        public void actionPerformed(ActionEvent e){

        }
}




