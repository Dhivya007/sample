package com.wipro.logical;

import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a limit");
		int limit=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 0; i < limit; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		sc.close();
	}

}
