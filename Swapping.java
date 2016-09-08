package com.wipro.logical;

import java.util.Scanner;

public class Swapping
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		int temp=0;
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter second number");
		num2=sc.nextInt();
		System.out.println("before swapping");
		System.out.println("values are "+num1+" and "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping");
		System.out.println("values are "+num1+" and "+num2);
		sc.close();
	}

}
