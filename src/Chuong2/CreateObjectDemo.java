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
class rectangle {
    public double width=0;
    public double length = 0;
    public point origin;

    public rectangle() {
        origin = new point(0, 0);
    }

    public rectangle(point origin) {
        this.origin = origin;
    }
    public rectangle(double w,double l,point p){
        this.width = w;
        this.length = l;
        this.origin = p;
    }
    public rectangle(double w,double l){
        this.width = w;
        this.length = l;
    }
    public void move(double x, double y) {
	origin.setX(x);
	origin.setY(y);
    }
    // a method for computing the area of the rectangle
    public double area() {
	return width * length;
    }

    
    
}

public class CreateObjectDemo {
    public static void main(String[] args) {
        // create a point object and two rectangle objects
        point origin_one = new point(23, 94);
        rectangle rect_one = new rectangle(100, 200,origin_one);
        rectangle rect_two = new rectangle(50, 100);
        // display rect_one's width, height, and area
        System.out.println("Width of rect_one: " + rect_one.width);
        System.out.println("Height of rect_one: " + rect_one.length);
        System.out.println("Area of rect_one: " + rect_one.area());
        // set rect_two's position
        rect_two.origin = origin_one;

        // display rect_two's position
        System.out.println("X Position of rect_two: " + rect_two.origin.getX());
        System.out.println("Y Position of rect_two: " + rect_two.origin.getY());
        // move rect_two and display its new position
        rect_two.move(40, 72);
        System.out.println("X Position of rect_two: " + rect_two.origin.getX());
        System.out.println("Y Position of rect_two: " + rect_two.origin.getY());
    }

}
