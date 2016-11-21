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
public class bai2 {

    public static String daonguoc(String s) {
        String d = "";

        //char a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char a = s.charAt(i);
            d += a;
        }
        return d;
    }

    public static String doichuhoa(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= 'a' && a <= 'z') {
                output += (char) (a - 32);
            } else {
                output += a;
            }
        }
        return output;
    }

    public static String doichuthuong(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= 'A' && a <= 'Z') {
                output += (char) (a + 32);
            } else {
                output += a;
            }
        }
        return output;
    }

    public static String doichu(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= 'A' && a <= 'Z') {
                output += (char) (a + 32);
            } else {
                if (a >= 'a' && a <= 'z') {
                    output += (char) (a - 32);
                } else {
                    output += a;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        s = scan.nextLine();
        System.out.print("chuỗi đảo ngược: ");
        System.out.println(daonguoc(s));
        System.out.print("Đổi chữ hoa: ");
        System.out.println(doichuhoa(s));
        System.out.print("Đổi chữ thường: ");
        System.out.println(doichuthuong(s));
        System.out.print("Biến đổi: ");
        System.out.println(doichu(s));
    }
}
