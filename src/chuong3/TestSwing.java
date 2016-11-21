/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

/**
 *
 * @author Ta Quang Hoang
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TestSwing extends JFrame implements ActionListener{
    JButton bt;
    JTextField tf;
    int count = 0;
    public TestSwing(){
        bt = new JButton("increase");
        bt.addActionListener(this);
        tf = new JTextField("0");
        Container cont = this.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(bt);
        cont.add(tf);
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       count++;
       tf.setText(String.valueOf(count));
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        new TestSwing();
    }
    
}
