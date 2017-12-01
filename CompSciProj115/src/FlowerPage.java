/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FlowerPage implements ActionListener
{   
    private JFrame frame;
    private JPanel primary;
    private JPanel sub1;
    private JPanel sub2;
    private JPanel sub3;
    private JPanel sub4;
    private JPanel sub5;
    private JLabel welcomeLabel;
    private JButton f1;
    private JButton f2;
    private JButton f3;
    private JButton f4;
    private JButton f5;
    
    
    public FlowerPage()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        primary = new JPanel();
        primary.setBackground(Color.red);
        primary.setPreferredSize(new Dimension (500,300));
        
        //top subpanel: sub1
        sub1 = new JPanel();
        sub1.setBackground(new Color(116,205,255));//turquoise
        sub1.setPreferredSize(new Dimension(500,100));
        welcomeLabel = new JLabel("this is the flower page");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN,40));
        sub1.add(welcomeLabel);
      
        //4 subpanels: sub2, sub3, sub4, sub5
        sub2 = new JPanel();
        sub2.setBackground(new Color(255,238,170));//gold
        sub2.setPreferredSize(new Dimension(150,100));
        f1 = new JButton("Lavender");
        f1.setFont(new Font("Arial", Font.PLAIN,10));
        f1.setPreferredSize(new Dimension(100,100));
        f1.addActionListener(this);
        sub2.add(f1);
        f1.setActionCommand("lavenderButtonClicked");
     
        sub3 = new JPanel();
        sub3.setBackground(new Color(255,238,170));//gold
        sub3.setPreferredSize(new Dimension(150,100));
        f2 = new JButton("Cosmos");
        f2.setFont(new Font("Arial", Font.PLAIN,10));
        f2.setPreferredSize(new Dimension(100,100));
        sub3.add(f2);
        
        sub4 = new JPanel();
        sub4.setBackground(new Color(255,238,170));//gold
        sub4.setPreferredSize(new Dimension(150,100));
        f3 = new JButton("Grasses");
        f3.setFont(new Font("Arial", Font.PLAIN,10));
        f3.setPreferredSize(new Dimension(100,100));
        sub4.add(f3);
        
        sub5 = new JPanel();
        sub5.setBackground(new Color(255,238,178));//gold
        sub4.setPreferredSize(new Dimension(150,100));
        f4 = new JButton("return to Main Menu");
        f4.setFont(new Font("Arial", Font.PLAIN,10));
        f4.setPreferredSize(new Dimension(200,50));
        sub5.add(f4);
        f4.addActionListener(this);
        f4.setActionCommand("mainMenuButtonClicked");
        
        primary.add(sub1);
        primary.add(sub2);
        primary.add(sub3);
        primary.add(sub4);
        primary.add(sub5);
        
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){ 
        if(e.getActionCommand().equals("lavenderButtonClicked"))
        {
            System.out.println("clicked the lavender button");
            //add 1 to count of lavender plants
        }
        if(e.getActionCommand().equals("mainMenuButtonClicked"))
        {
            System.out.println("clicked return to main menu");
            //close window
            FirstPage F = new FirstPage();
        }
    }
}
