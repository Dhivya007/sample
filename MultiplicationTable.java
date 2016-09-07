package com.wipro.logical;

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the table number");
		int tab=sc.nextInt();
		for (int i = 1; i < 20; i++)
		{
			System.out.println("table: "+i+" *"+" "+tab+" = "+i*tab);
		}
		sc.close();
	}

}
