
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class Index{
    
    public static void main(String args[]){    
        JFrame window = new JFrame(); 
        window.setVisible(true);
        window.setVisible(true);
        window.setSize(700, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setTitle("Mercado_activity1");
        window.setResizable(true);
        
        window.getContentPane().setBackground(Color.gray);

        ImageIcon icon = new ImageIcon("Face.jpg");
        window.setIconImage(icon.getImage());

        String description = "lorem ipsum";
        JLabel text = new JLabel("All the things you need to know about me");
        text.setForeground(Color.decode("#FFFFFF"));
        text.setFont(new Font ("arial", Font.ITALIC, 30));
        text.setVerticalAlignment(JLabel.TOP);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBackground(Color.decode("#FA5F55"));
        window.add(text);
        
        Border border = BorderFactory.createLineBorder(Color.decode("#000000"), 7, true);
        text.setBorder(border);
        window.setLayout(null);
        text.setBounds(15,20,600,850);
        window.add(text);
        
        ImageIcon image = new ImageIcon("Face.jpg");
        JLabel subTitle = new JLabel();
        subTitle.setText("Ako si Maxximus Mercado");        
        subTitle.setFont(new Font("Arial", Font.BOLD, 20));
        subTitle.setBounds(100, -100, 600, 600); 
        subTitle.setIcon(image);
        window.add(subTitle);

      
        
        ImageIcon aboutme = new ImageIcon("About me.png");
        JLabel about = new JLabel();
        about.setText("");        
        about.setFont(new Font("Arial", Font.BOLD, 20));
        about.setBounds(100,320, 500, 500); 
        about.setIcon(aboutme);
        window.add(about);
    
 }
}