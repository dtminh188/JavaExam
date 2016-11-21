/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong2;

/**
 *
 * @author PC
 */
class point{
    private double x,y;
    
    point(){}
    point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
}

class Square{
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
}

class Rectangle extends Square{
    private double length;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(width);
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
}
public class Shapes {
    public static void main (String [] args)   {
      Square s = new Square (100);
      System.out.println ("s.width = " + s.getWidth ());
      Rectangle r = new Rectangle (50, 25);
      System.out.println ("r.width = " + r.getWidth ());
      System.out.println ("r.length = " + r.getLength ());
   }
}
