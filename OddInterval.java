package com.wipro.logical;

import java.util.Scanner;

public class OddInterval
{
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting limit");
		int start=sc.nextInt();
		System.out.println("enter the ending limit");
		int end=sc.nextInt();
		for (int i = start; i <= end; i++)
		{
			if((i%2)!=0)
			{
				System.out.println(i);
			}
			
		}
		sc.close();
	}

}
