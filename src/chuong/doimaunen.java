/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Ta Quang Hoang
 */
public class doimaunen extends JFrame implements ActionListener{
    private JButton btGreen,btBlue,btRed,btExit;
    private Container cont;
    private Panel pn;
    public doimaunen(String s){
        super(s);
        initComponents();
    }

    private void initComponents() {
        cont = this.getContentPane();
        btGreen = new JButton("Green");
        btBlue = new JButton("Blue");
        btRed = new JButton("Red");
        btExit = new JButton("Exit");
        
        btGreen.addActionListener(this);
        btBlue.addActionListener(this);
        btRed.addActionListener(this);
        btExit.addActionListener(this);
        
        pn = new Panel(new FlowLayout());
        pn.add(btGreen);
        pn.add(btBlue);
        pn.add(btRed);
        pn.add(btExit);
        
        cont.add(pn);
        this.setSize(300, 200);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new doimaunen("Doi mau nen");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btGreen){
            pn.setBackground(Color.GREEN);
        }
        if(e.getSource()==btBlue){
            pn.setBackground(Color.blue);
        }
        if(e.getSource()==btRed){
            pn.setBackground(Color.red);
        }
        if(e.getSource()==btExit){
            System.exit(0);
        }
    }
}
