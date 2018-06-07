package com.example.pkg;

public class Point {
	
	private int a;
	private int b;
	
	// Default constructor
	public Point()
    {
      System.out.println("Point Default Constructor Called");
    }
	
	// Remember to actually program a default constructor for all methods here
	// The classes here will be automatically loaded and executed
	// So, if java is expecting an argument, one isn't given, and the default 
	// constructors provided by Java will be overidden if you don't provide them.
	
	//			(index 0, index 1, ... index n)
	public Point(float x, double y)
    {
      System.out.println(x + " , " + y);
    }
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}	

}
