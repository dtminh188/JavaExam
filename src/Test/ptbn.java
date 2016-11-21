/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.awt.Desktop.Action;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Ta Quang Hoang
 */
public class ptbn extends JFrame implements ActionListener {

	private JButton kq, reset, thoat;
	private JTextField txta, txtb, txtkq;
	private JPanel pn, pn1, pn2, pn3;

	public void GUI() {
		pn = new JPanel(new GridLayout(3, 1));

		JLabel lb = new JLabel("Giải phương trình bậc nhất:");
		pn1 = new JPanel(new FlowLayout());
		pn1.add(lb);

		JLabel lb1 = new JLabel("Nhập a: ");
		txta = new JTextField();
		JLabel lb2 = new JLabel("Nhập b: ");
		txtb = new JTextField();
		JLabel lb3 = new JLabel("Kết quả ");
		txtkq = new JTextField();
		pn2 = new JPanel(new GridLayout(3, 2));
		pn2.add(lb1);
		pn2.add(txta);
		pn2.add(lb2);
		pn2.add(txtb);
		pn2.add(lb3);
		pn2.add(txtkq);

		kq = new JButton("Tính");
		reset = new JButton("Reset");
		thoat = new JButton("Thoát");
		// gắn ống nghe cho các nút

		kq.addActionListener(this);
		reset.addActionListener(this);
		thoat.addActionListener(this);
		pn3 = new JPanel(new GridLayout(1, 3));
		pn3.add(kq);
		pn3.add(reset);
		pn3.add(thoat);

		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		// setSize(400,300); // thiết lập kích cỡ
		pack(); // phương thức pack giúp frame có kích thước vừa đủ với nội dung
				// của frame ngay cả khi chúng ta đặt kích thước frame lớn hơn.
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == kq) {
			int a = Integer.parseInt(txta.getText());
			int b = Integer.parseInt(txtb.getText());
			if (a != 0) {
				txtkq.setText(Float.toString((float) -b / a));
			} else {

				if (b == 0) {
					txtkq.setText("Phuong trinh vo so nghiem");
				} else {
					txtkq.setText("phuong trinh vo nghiem");
				}
			}
		}
		if (e.getSource() == reset) {
			txta.setText("");
			txtb.setText("");
			txtkq.setText("");
		}
		if (e.getSource() == thoat) {
			System.exit(0);
		}
            }            
	public ptbn(String st) {
		super(st);
		GUI();
	}
	public static void main(String[] args) {
		new ptbn("Giai phuong trinh bac 1");
	}
}

