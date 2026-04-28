package com.javapractice1;

//public class CoreJavaDemo17 {
//	int length;
//	int breadth;
//	int side;
//	
//	CoreJavaDemo17(int length , int breadth,int side){
//		this.side= side;
//		this.length=length;
//		this.breadth=breadth;
//	}
//	public static void main(String[] args) {
//		CoreJavaDemo17 cd = new CoreJavaDemo17(11,10,5);
//		cd.display();
//	
//	}
//	void display() {
//		System.out.println("Area of Square of "+side+ " is : "+side * side);
//		System.out.println("Area of Rectangle of length "+length+" and breadth "+breadth+" is : "+length * breadth);
//	}
//
//}
public class CoreJavaDemo17 {

    int length;
    int breadth;
    int side;

    // Constructor for Square
    CoreJavaDemo17(int side) {
        this.side = side;
    }

    // Constructor for Rectangle
    CoreJavaDemo17(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        if (side != 0) {
            System.out.println("Area of Square of " + side + " is : " + (side * side));
        }
        if (length != 0 && breadth != 0) {
            System.out.println("Area of Rectangle of length " + length +
                    " and breadth " + breadth + " is : " + (length * breadth));
        }
    }

    public static void main(String[] args) {

        // Square object
        CoreJavaDemo17 square = new CoreJavaDemo17(5);
        square.display();

        // Rectangle object
        CoreJavaDemo17 rectangle = new CoreJavaDemo17(11, 10);
        rectangle.display();
    }
}
