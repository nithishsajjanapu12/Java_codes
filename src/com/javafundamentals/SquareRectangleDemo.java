package com.javafundamentals;
import java.util.Scanner;
public class SquareRectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareRectangleDemo sd = new SquareRectangleDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side of a square : ");
		double side = sc.nextDouble();
		System.out.println("Enter length of rectangle : ");
		double length = sc.nextDouble();
		System.out.println("Enter breadth of rectangle : ");
		double breadth  = sc.nextDouble ();
		System.out.println("Area of Square : "+(sd.ArSq(side)));
		System.out.println("Area of Rectangle : "+(sd.ArRt(length, breadth)));
		sc.close();
	}
	double ArSq(double side){
		double area = side * side;
		return area;
	}
	double ArRt(double length,double breadth) {
		double area = length * breadth;
		return area;
	}
}
