/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ta Quang Hoang
 */
public class MyFlowLayout{  
    JFrame f;  
    MyFlowLayout(){  
    f=new JFrame();
    
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
      
    f.setLayout(new FlowLayout(FlowLayout.CENTER));  
    //thiet lap flow layout la can chinh phai 
  
    f.setSize(250,250);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyFlowLayout();  
}  
}  
