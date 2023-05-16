package Mercado_Activity3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Mercado implements ActionListener {
    
    public static void main(String args[]){

    JLabel answer = new JLabel();
    answer.setText("  ");
    answer.setBounds(10, 10, 480, 100 );
    answer.setFont(new Font("arial", Font.BOLD, 60));
    answer.setHorizontalAlignment(JLabel.CENTER);
    answer.setForeground(Color.black);
    answer.setBackground(Color.WHITE);
    answer.setOpaque(true);

    JLabel operator = new JLabel();
    operator.setText(" = ");
    operator.setBounds(0, 65, 500, 150 );
    operator.setFont(new Font("arial", Font.BOLD, 20));
    operator.setHorizontalAlignment(JLabel.CENTER);
    operator.setForeground(Color.white);

    JTextField input1 = new JTextField();
    input1.setBounds(50, 125, 150, 30);
    input1.setBackground(Color.gray);
    input1.setForeground(Color.black);

    JTextField input2 = new JTextField();
    input2.setBounds(300, 125, 150, 30);
    input2.setBackground(Color.gray);
    input2.setForeground(Color.black);

    JButton addition = new JButton(" + ");
    addition.setBounds(10, 200, 75, 50 );
    addition.setBackground(Color.gray);

    JButton subtraction = new JButton(" - ");
    subtraction.setBounds(110, 200, 75, 50 );
    subtraction.setBackground(Color.gray);

    JButton multiplication = new JButton(" * ");
    multiplication.setBounds(210, 200, 75, 50 );
    multiplication.setBackground(Color.gray);

    JButton division = new JButton(" / ");
    division.setBounds(310, 200, 75, 50 );
    division.setBackground(Color.gray);

    JButton modulo = new JButton(" % ");
    modulo.setBounds(410, 200, 75, 50 );
    modulo.setBackground(Color.gray);

    JFrame window = new JFrame();
    window.setTitle("Mercado Activity 3");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setLayout(null);
    window.setSize(520,500);
    window.setResizable(false);
    window.getContentPane().setBackground(Color.black);

    window.add(answer);
    window.add(operator);
    window.add(input1);
    window.add(input2);
    window.add(addition);
    window.add(subtraction);
    window.add(multiplication);
    window.add(division);
    window.add(modulo);

    addition.addActionListener(e -> sum(input1, input2, answer, operator ));

    subtraction.addActionListener(e -> sub(input1, input2, answer, operator ));

    multiplication.addActionListener(e -> mul(input1, input2, answer, operator ));

    division.addActionListener(e -> div(input1, input2, answer, operator ));

    modulo.addActionListener(e -> mod(input1, input2, answer, operator ));

    }

    public static void sum(JTextField input1, JTextField input2, JLabel answer, JLabel operator ){
        String input1data = input1.getText();
        String _input1 = input1data.trim();

        String input2data = input2.getText();
        String _input2 = input2data.trim();

        if(_input1.isEmpty() || _input2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number");
        }else{
            double d_inputdata = Double.parseDouble(_input1);
            double d_inputdata2 = Double.parseDouble(_input2);

            double sum = d_inputdata + d_inputdata2;

            answer.setText(" " + sum);
            operator.setText(" + ");

        }

    }

    public static void sub(JTextField input1, JTextField input2, JLabel answer, JLabel operator ){
        String input1data = input1.getText();
        String _input1 = input1data.trim();

        String input2data = input2.getText();
        String _input2 = input2data.trim();

        if(_input1.isEmpty() || _input2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number");
        }else{
            double d_inputdata = Double.parseDouble(_input1);
            double d_inputdata2 = Double.parseDouble(_input2);

            double sub = d_inputdata - d_inputdata2;

            answer.setText(" " + sub);
            operator.setText(" - ");

        }

    }

    public static void mul(JTextField input1, JTextField input2, JLabel answer, JLabel operator ){
        String input1data = input1.getText();
        String _input1 = input1data.trim();

        String input2data = input2.getText();
        String _input2 = input2data.trim();

        if(_input1.isEmpty() || _input2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number");
        }else{
            double d_inputdata = Double.parseDouble(_input1);
            double d_inputdata2 = Double.parseDouble(_input2);

            double mul = d_inputdata * d_inputdata2;

            answer.setText(" " + mul);
            operator.setText(" * ");

        }

    }

    public static void div(JTextField input1, JTextField input2, JLabel answer, JLabel operator ){
        String input1data = input1.getText();
        String _input1 = input1data.trim();

        String input2data = input2.getText();
        String _input2 = input2data.trim();

        if(_input1.isEmpty() || _input2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number");
        }else{
            double d_inputdata = Double.parseDouble(_input1);
            double d_inputdata2 = Double.parseDouble(_input2);

            double div = d_inputdata / d_inputdata2;

            answer.setText(" " + div);
            operator.setText(" / ");

        }

    }

    public static void mod(JTextField input1, JTextField input2, JLabel answer, JLabel operator ){
        String input1data = input1.getText();
        String _input1 = input1data.trim();

        String input2data = input2.getText();
        String _input2 = input2data.trim();

        if(_input1.isEmpty() || _input2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number");
        }else{
            double d_inputdata = Double.parseDouble(_input1);
            double d_inputdata2 = Double.parseDouble(_input2);

            double mol = d_inputdata % d_inputdata2;

            answer.setText(" " + mol);
            operator.setText(" % ");

        }

    }

    public void actionPerformed(ActionEvent e){
    }

}
