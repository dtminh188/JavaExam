/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ta Quang Hoang
 */
public class SwingLayoutDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;

   public SwingLayoutDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      SwingLayoutDemo swingLayoutDemo = new SwingLayoutDemo();  
      swingLayoutDemo.showFlowLayoutDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new JFrame("Vi du Java Swing");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(350,100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showFlowLayoutDemo(){
      headerLabel.setText("Layout in action: FlowLayout");      

      JPanel panel = new JPanel();
      panel.setBackground(Color.darkGray);
      panel.setSize(200,200);
      FlowLayout layout = new FlowLayout();
      layout.setHgap(10);              
      layout.setVgap(10);
      panel.setLayout(layout);        
      panel.add(new JButton("OK"));
      panel.add(new JButton("Cancel"));       

      controlPanel.add(panel);

      mainFrame.setVisible(true);  
   }
}
