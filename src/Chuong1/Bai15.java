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
public class Bai15 {
    public boolean shh(int a){
        int s=0;
        for(int i=1;i<a;i++){
            if(a%i==0) s+=i;
        }
        if(a==s) return true;
        return false;
    }
    public static void main(String[] args) {
        Bai15 b15 = new Bai15();
        for(int i=1;i<=1000;i++){
            if(b15.shh(i))System.out.print(i+ " ");
        }
    }
}
