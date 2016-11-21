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
public class bai1 {

    public static int ucln(int a, int b) {
        int uc = 0;
        if (a == b) {
            uc = a;
        } else {
            if (a > b) {
                uc = ucln(a - b, b);
            } else {
                if (a < b) {
                    uc = ucln(a, b - a);
                }
            }
        }
        return uc;
    }

    public static int bcnn(int a, int b) {
        int bc = 0;
        for (bc = a; bc < a * b; bc++) {
            if (bc % a == 0 && bc % b == 0) {
                break;
            }
        }
        return bc;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = scan.nextInt();
        System.out.println("Nhap so b: ");
        b = scan.nextInt();
        System.out.println("UCLN cua hai so a va b: ");
        System.out.println(ucln(a, b));
        System.out.println("BCNN cua hai so a va b: ");
        System.out.println(bcnn(a, b));
    }
}
