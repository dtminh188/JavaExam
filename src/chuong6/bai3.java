/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.util.Scanner;

/**
 *
 * @author Ta Quang Hoang
 */
public class bai3 {
 
    public static void in(String input) {
        String output = "";
        String[] mang = input.split(" ");
        for (int i = 0; i < mang.length; i++) {
            if (!mang[i].equals("")) {
                System.out.println(mang[i]);
            }
        }
    }

    public static void dem(String input){
        int cout = 0;
        String[] mang = input.split(" ");
        for (int i = 0; i < mang.length; i++) {
            if (!mang[i].equals("")) {
                cout++;
            }
        }
        System.out.println(cout);
    }
    public static void main(String[] args) {
        String s = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        s = scan.nextLine();
        in(s);
        dem(s);
        
    }
}
