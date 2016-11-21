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
public class Bai9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(scan.nextLine());
        int tich = 1;
        if(n%2==0){
            for(int i =2;i<=n;i++){
                tich*=i;
                i++;
            }
            System.out.println("n!!: "+tich);
        }else{
            for(int i = 1;i<=n;i++){
                tich*=(2*i-1);
            }
            System.out.println("n!!: "+tich);
        }
    }
}
