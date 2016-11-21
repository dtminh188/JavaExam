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
public class Bai14 {
    public boolean snt(int n){
        if(n==1||n==0){
            return false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai14 b14 = new Bai14();
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        for(int i=0;i<=n;i++){
            if(b14.snt(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
