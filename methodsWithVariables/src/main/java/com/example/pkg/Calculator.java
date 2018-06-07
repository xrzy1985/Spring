package com.example.pkg;

public class Calculator 
{

	private int n1;
	private int n2;
	
	public Calculator(int num1, int num2)
	{
		this.n1 = num1;
		this.n2 = num2;
	}
	
	public double divide()
	{
		return (double)n1 / (double)n2;
	}
	
	public int multiply()
	{
		return n1 * n2;
	}
	
	public int add()
	{
		return n1 + n2;
	}
	
	public int subtract()
	{
		return n1 - n2;
	}
	
}
