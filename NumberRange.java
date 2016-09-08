package com.wipro.logical;

import java.util.Scanner;

public class NumberRange 
{
	public static void main(String[] args) 
	{
		int start=1;
		int end=9;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number from the range 0 to 9");
		int num=sc.nextInt();
		System.out.println("the number is "+num);
		if((num<start)||(num>end))
		{
			System.out.println("you entered number is not in range");
		}
		sc.close();
	}
}
