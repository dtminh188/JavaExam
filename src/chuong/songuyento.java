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
public class songuyento extends JFrame implements ActionListener{
    private Container cont;
    private JTextField tf,rs;
    private JButton btTim,btReset,btExit;
    private Panel pn1,pn2,pn3;
    public songuyento(String s){
        super(s);
        initComponents();
    }
    
    private void initComponents() {
        cont = this.getContentPane();
        cont.setLayout(new GridLayout(3, 1));
        
        pn1 = new Panel();
        pn1.setLayout(new FlowLayout(10));
        JLabel lbTitle = new JLabel("Cac so nguyen to <=n");
        pn1.add(lbTitle);
        
        JLabel lbn = new JLabel("Nhap n: ");
        JLabel lbkq = new JLabel("Ket qua: ");
        tf = new JTextField();
        rs = new JTextField();
        pn2 = new Panel(new GridLayout(2, 2));
        pn2.add(lbn);
        pn2.add(tf);
        pn2.add(lbkq);
        pn2.add(rs);
        
        btTim = new JButton("Tim");
        btReset = new JButton("Reset");
        btExit = new JButton("Exit");
        pn3 = new Panel(new FlowLayout());
        pn3.add(btTim);
        pn3.add(btReset);
        pn3.add(btExit);
        btTim.addActionListener(this);
        btReset.addActionListener(this);
        btExit.addActionListener(this);
        
        cont.add(pn1);
        cont.add(pn2);
        cont.add(pn3);
        this.pack();
        this.setVisible(true);   
    }
    public boolean snt(int n){
        if(n==1||n==0){
            return false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public void tim(){
        int n = Integer.parseInt(tf.getText());
        String st = new String();
        //songuyento s = new songuyento();
        for(int i=0;i<=n;i++){
            if(snt(i)==true){
                st+=Integer.toString(i)+" ";              
            }
        }
        rs.setText(st);
    }
    public void reset(){
        tf.setText("");
        rs.setText("");
    }
    public void exit(){
        System.exit(0);
    }
    public static void main(String[] args) {
       songuyento snt = new songuyento("Tim So Nguyen To!");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() ==btTim){
        tim();
        }
    if(e.getSource() == btReset){
        reset();
        }
    if(e.getSource() == btExit){
        exit();
        }
    }
}
