package com.wipro.logical;

import java.util.Scanner;

public class SumOfN
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a limit");
		int limit=sc.nextInt();
		int sum=0;
		for (int i = 0; i <= limit; i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of "+limit+" is "+sum);
		sc.close();
	}

}
