package Test;
import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ta Quang Hoang
 */
public class bai41 extends Frame{
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("Hello");
        f.setBounds(300, 200, 200, 200);
        f.setLayout(new FlowLayout());
        f.add(new Button("OK"));
        f.add(new Button("Cancel"));
        f.setVisible(true);
    }
}
