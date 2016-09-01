package com.wipro.logical;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int arm = 0;
		int n1=num;
		int temp=0;
		while(num!=0)
		{
			 temp=num%10;
			arm=arm+(temp*temp*temp);
			num=num/10;
		}
		if(arm==n1)
		{
			System.out.println(n1+" is a armstring number");
		}
		else
			System.out.println(n1+" is a not armstring number");
		
		sc.close();
	}

}
