
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

        
public class FirstPage implements ActionListener{
    
    public FirstPage()
    {
        final double totalCost;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        //top subpanel: sub1
        JPanel sub1 = new JPanel();
        sub1.setBackground(new Color(116,205,255));//turquoise
        sub1.setPreferredSize(new Dimension(500,100));
        JLabel welcomeLabel = new JLabel("Welcome to Omni Systems");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN,40));
        sub1.add(welcomeLabel);
      
        //3 subpanels: sub2, sub3, sub4
        JPanel sub2 = new JPanel();
        sub2.setBackground(new Color(255,238,170));//gold
        sub2.setPreferredSize(new Dimension(150,100));
        JButton flowers = new JButton("Flowers");
        flowers.setFont(new Font("Arial", Font.PLAIN,18));
        flowers.setPreferredSize(new Dimension(100,100));
        flowers.addActionListener(this);
        sub2.add(flowers);
        flowers.setActionCommand("flowerButtonClicked");
        
        JPanel sub3 = new JPanel();
        sub3.setBackground(new Color(255,238,170));//gold
        sub3.setPreferredSize(new Dimension(150,100));
        JButton veg = new JButton("Vegetables");
        veg.setFont(new Font("Arial", Font.PLAIN,18));
        veg.setPreferredSize(new Dimension(100,100));
        sub3.add(veg);
       
        JPanel sub4 = new JPanel();
        sub4.setBackground(new Color(255,238,170));//gold
        sub4.setPreferredSize(new Dimension(150,100));
        JButton grass = new JButton("Grasses");
        grass.setFont(new Font("Arial", Font.PLAIN,18));
        grass.setPreferredSize(new Dimension(100,100));
        sub4.add(grass);
       
        //primary panel that holds 4 subpanels
        JPanel primary = new JPanel();
        primary.setBackground(new Color(120,157,255));//blu-ish
        primary.setPreferredSize(new Dimension (500,300));
       
        primary.add(sub1);
        primary.add(sub2);
        primary.add(sub3);
        primary.add(sub4);
        
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FirstPage firstPage = new FirstPage();  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("flowerButtonClicked"))
        {
            System.out.println("clicked the flower button; flower page will load");
            //close FirstPage
            FlowerPage F = new FlowerPage();
        }
    }
}

