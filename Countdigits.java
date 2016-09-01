package com.wipro.logical;

import java.util.Scanner;

public class Countdigits 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int count=0;
		int temp=0;
		while(num!=0)
		{
			temp=num%10;
			num=num/10;
			count++;
		}
		System.out.println("the count is "+count);
	sc.close();
     }

}
