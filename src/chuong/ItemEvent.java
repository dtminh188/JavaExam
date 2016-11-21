/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javafx.scene.control.CheckBox;
import javax.swing.*;
/**
 *
 * @author Ta Quang Hoang
 */
public class ItemEvent extends JFrame implements ActionListener,ItemListener{
    private Container cont;
    private JButton btExit;
    private Panel pn;
    private JLabel lb;
    private CheckboxGroup cbg;
    private Checkbox cbm;
    private Checkbox cbfm;
    private List list;
    private Choice ch;
    public ItemEvent(String title){
        super(title);
        initComponents();
    }
    private void initComponents() {
        cont = this.getContentPane();
        cbg = new CheckboxGroup();
        cbm = new Checkbox("Male",cbg,true);
        cbfm = new Checkbox("Female",cbg,false);
        pn = new Panel(new FlowLayout());
        pn.add(cbm);
        pn.add(cbfm);
        cbm.addItemListener(this);
        cbfm.addItemListener(this);
      
        list = new List(2,false);
        list.add("MS DOS");
        list.add("WinDows");
        list.add("LINUX");
        pn.add(list);
        
        list.addItemListener(this);
        
        ch = new Choice();
	ch.addItem("Tiger");
	ch.addItem("Feed");
	ch.addItem("Cat");
        ch.addItem("Pig");
        ch.addItem("Monkey");
        
        ch.addItemListener(this);
        
        pn.add(ch);
        lb = new JLabel("The item display here");
	btExit = new JButton("Exit");
	btExit.addActionListener(this);
        
        pn.add(lb);
        pn.add(btExit);
        cont.add(pn);
        this.setSize(400, 300);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new ItemEvent("Item Event");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btExit){
           System.exit(0);
       }
    }

    @Override
    public void itemStateChanged(java.awt.event.ItemEvent e) {
        if(e.getSource()==cbm){
            lb.setText("The Male display here");
        }
        if(e.getSource()==cbfm){
            lb.setText("The Female display here");
        }
        if(e.getSource()==list){
            int index = list.getSelectedIndex();
            if(index>=0){
                lb.setText("The "+list.getItem(index) +" display here");
            }
        }
        if(e.getSource()==ch){
            int index1 = ch.getSelectedIndex();
            if(index1>=0){
                lb.setText("The "+ch.getItem(index1)+" display here");
            }
        }
    }
}
