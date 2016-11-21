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
public class Bai1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap so a: ");
        float a = scan.nextFloat();
        System.out.println("nhap so b: ");
        float b = scan.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so ngiem!");
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
        }else{
            System.out.println(-b/a);
        }
    }
}
