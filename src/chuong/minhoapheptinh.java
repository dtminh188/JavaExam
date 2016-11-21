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
public class minhoapheptinh extends JFrame implements ActionListener{
    private Container cont;
    private JButton btAdd,btSub,btMul,btDiv,btReset,btExit;
    private JTextField tf1,tf2,rs;
    private Panel pn1,pn2,pn3;
    
    public minhoapheptinh(String s){
        super(s);
        innitComponents();
    }
    
    private void innitComponents() {
        cont = this.getContentPane();
        cont.setBounds(0, 0, 400, 400);
        cont.setLayout(new GridLayout(3, 1));
        
        JLabel mhpt = new JLabel("Minh hoa cac phep toan.");
        JLabel lba = new JLabel("Nhap a: ");
        JLabel lbb = new JLabel("Nhap b: ");
        JLabel lbkq = new JLabel("Ket qua: ");
        tf1 = new JTextField();
        tf2 = new JTextField();
        rs = new JTextField();
        rs.setEditable(false);
        pn1 = new Panel();
        pn1.setBounds(0, 0, 200, 200);
        pn1.setLayout(new GridLayout(4, 2));
        pn1.add(mhpt);
        pn1.add(new JLabel(""));
        pn1.add(lba);
        pn1.add(tf1);
        pn1.add(lbb);
        pn1.add(tf2);
        pn1.add(lbkq);
        pn1.add(rs);
        
        btAdd = new JButton("Cong");
        btSub = new JButton("Tru");
        btMul = new JButton("Nhan");
        btDiv = new JButton("Chia");
        pn2 = new Panel();
        pn2.setLayout(new FlowLayout());    
        pn2.add(btAdd);
        pn2.add(btSub);
        pn2.add(btMul);
        pn2.add(btDiv);
        
        btReset = new JButton("Reset");
        btExit = new JButton("Exit");
        pn3 = new Panel();
        pn3.setLayout(new FlowLayout());
        pn3.add(btReset);
        pn3.add(btExit);
        
        cont.add(pn1);
        cont.add(pn2);
        cont.add(pn3);
        
        btAdd.addActionListener(this);
        btSub.addActionListener(this);
        btMul.addActionListener(this);
        btDiv.addActionListener(this);
        btReset.addActionListener(this);
        btExit.addActionListener(this);
       
        this.pack();
        this.setVisible(true);           
    }
    public void cong(){
        float a = Float.parseFloat(tf1.getText());
        float b = Float.parseFloat(tf2.getText());
        rs.setText(Float.toString(a+b));
    }
    public void tru(){
        float a = Float.parseFloat(tf1.getText());
        float b = Float.parseFloat(tf2.getText());
        rs.setText(Float.toString(a-b));
    }
    public void nhan(){
        float a = Float.parseFloat(tf1.getText());
        float b = Float.parseFloat(tf2.getText());
        rs.setText(Float.toString(a*b));
    }
    public void chia(){
        float a = Float.parseFloat(tf1.getText());
        float b = Float.parseFloat(tf2.getText());
        rs.setText(Float.toString(a/b));
    }
    public void reset(){
        tf1.setText("");
        tf2.setText("");
        rs.setText("");
    }   
    public void exit(){
        System.exit(0);
    }
    public static void main(String[] args) {
        minhoapheptinh mhpt = new minhoapheptinh("Minh Hoa Phep Tinh.");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btAdd){
            cong();
        }
        if(e.getSource()==btSub){
            tru();
        }
        if(e.getSource()==btMul){
            nhan();
        }
        if(e.getSource()==btDiv){
            chia();
        }
        if(e.getSource()==btReset){
            reset();
        }
        if(e.getSource()==btExit){
            exit();
        }
    }  
}
