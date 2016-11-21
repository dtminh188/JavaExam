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
public class Bai12 {
    public boolean scp(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(i==Math.sqrt(a)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai12 b12 =new Bai12();
        System.out.println("Nhap p: ");
        int p = Integer.parseInt(scan.nextLine());
        if(b12.scp(p)==true){
            System.out.println(p+ " la so chinh phuong!");
        }else{
            System.out.println(p+ " khong phai la so chinh phuong!");
        }
    }
}
