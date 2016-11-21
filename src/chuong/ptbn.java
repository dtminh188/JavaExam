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
public class ptbn extends JFrame implements ActionListener{
    private JButton bt1,bt2,bt3;
    private JTextField tf1,tf2,rs;    
    //Dùng để nhận tầng ContentPane của Jframe
    private Container cont;
    //Dùng để nhóm các thành phần trên giao diện
    private JPanel panel1,panel2;
    public ptbn(String s){
        super(s);
        initComponents();
    }

    private void initComponents() {
       cont = this.getContentPane();
        cont.setBounds(0,0, 400, 300);
        cont.setLayout(new GridLayout(2,1));
        JLabel gpt = new JLabel("CTGPTB1");
        JLabel numa = new JLabel("Nhập a:");
        JLabel numb = new JLabel("Nhập b:");
        JLabel resultslb = new JLabel("Kết quả:");
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        rs = new JTextField();
       //textfield 3 là kết quả không cho phép nhập dữ liệu 
        rs.setEditable(false);
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4,2));
        panel1.add(new Label("CTGPTB1"));
        panel1.add(new Label(""));
        panel1.add(numa);
        panel1.add(tf1);
        panel1.add(numb);
        panel1.add(tf2);
        panel1.add(resultslb);
        panel1.add(rs);
        
        bt1 = new JButton("Tính");
        bt1.setBounds(0, 0, 100, 100);
        bt2 = new JButton("Reset");
        bt2.setBounds(100, 0, 100, 100);
        bt3 = new JButton("Thoát");
        bt3.setBounds(200, 0, 100, 100);
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        //đặt panel1 vào vùng Center của ContentPane
        cont.add(panel1);
        //đặt panel2 vào cùng dưới cùng (South) của ContentPane
        cont.add(panel2);
        
        //Đặt ống nghe cho các nút
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        
        this.pack();
        this.setVisible(true);
    }
    public void tinh(){
        float a = Float.parseFloat(tf1.getText());
        float b = Float.parseFloat(tf2.getText());
        if(a==0){
            if(b==0){
                rs.setText("Phuong trinh vo so ngiem!");
            }else{
                rs.setText("phuong trinh vo nghiem");
            }
        }else{
            rs.setText(Float.toString(-b/a));
        }
    }
    
    public void reset(){
        tf1.setText("");
        tf2.setText("");
       // tf3.setEditable(true);
        rs.setText("");
    }
    
    public void thoat(){
        System.exit(0);
    }
    public static void main(String[] args) {
         ptbn ptbn = new ptbn("Giai Phuong Trinh Bac Nhat.");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==bt1){
            tinh();
        }
    if(e.getSource() == bt2){
        reset();
        }
    if(e.getSource() == bt3){
        thoat();
        }
    }
}
