/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai2 {

    public void ptbnhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so ngiem!");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            System.out.println(-b / a);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai2 b2 = new Bai2();
        System.out.println("nhap a: ");
        double a = scan.nextDouble();
        System.out.println("nhap b: ");
        double b = scan.nextDouble();
        System.out.println("nhap c: ");
        double c = scan.nextDouble();
        double delta;
        if (a == 0) {
            b2.ptbnhat(b, c);
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem!");
            } else {
                if (delta == 0) {
                    System.out.println("phuong trinh co 1 nghiem kep: " + -b / 2 * a);
                } else {
                    double x1 = (-b + Math.sqrt(delta) / (2 * a));
                    double x2 = (-b - Math.sqrt(delta) / (2 * a));
                    System.out.println("phuong co 2 nghiem phan biet: ");
                    System.out.println(x1 + "   " + x2);
                }
            }
        }
    }
}
