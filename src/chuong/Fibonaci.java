/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Ta Quang Hoang
 */
public class Fibonaci extends JFrame implements ActionListener{
    private JTextField tfa,tfkq;
    private JButton btok,btreset,btexit;
    private Panel pn1,pn2,pn3;
    private Container cont;
    public Fibonaci(String s){
        super(s);
        initComponents();
    }
    private void initComponents() {
        cont = this.getContentPane();
        
        JLabel lb = new JLabel("Kiem tra a co thuoc day Fibonaci");
        pn1 = new Panel(new FlowLayout());
        pn1.add(lb);
        JLabel lb1 = new JLabel("Nhap a:");
        JLabel lb2 = new JLabel("Ket qua:");
        tfa = new JTextField();
        tfkq = new JTextField();
        pn2 = new Panel(new GridLayout(2, 2));
        pn2.add(lb1);
        pn2.add(tfa);
        pn2.add(lb2);
        pn2.add(tfkq);
        
        btok = new JButton("OK");
        btreset = new JButton("Reset");
        btexit = new JButton("Exit");
        pn3 = new Panel(new FlowLayout());
        pn3.add(btok);
        pn3.add(btreset);
        pn3.add(btexit);
        
        cont.setLayout(new GridLayout(3, 1));
        cont.add(pn1);
        cont.add(pn2);
        cont.add(pn3);
        
        btok.addActionListener(this);
        btreset.addActionListener(this);
        btexit.addActionListener(this);
        this.pack();
        this.setVisible(true);
        
    }
    public boolean fibonaci(int a){
        if(a==0||a==1){
            return true;
        }
        int n1=0,n2=1;
        int n3=0;
        while(n3<a){
            n3=n1+n2;
            if(n3==a) return true;
            n1=n2;
            n2=n3;
        }
        return false;
    }
    public static void main(String[] args) {
        new Fibonaci("Fibonaci");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btok){
            if(fibonaci(Integer.parseInt(tfa.getText()))==true){
                tfkq.setText(tfa.getText()+" thuoc day Fibonaci");
            }else{
                tfkq.setText(tfa.getText()+" khong thuoc day Fibonaci");
            }        
        }
        if(e.getSource() == btreset){
            tfa.setText("");
            tfkq.setText("");
        }
        if(e.getSource() == btexit){
            System.exit(0);
        }
    }    
}
