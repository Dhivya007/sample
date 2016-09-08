package com.guvi.hunter;
import java.util.Scanner;
public class IndexEqual
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int temp=0;
		int []arr=new int[limit];
		System.out.println("enter the numbers");
		for (int i = 0; i <limit; i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < limit; i++)
		{
			if(arr[i]==i)
			{
				temp=arr[i];
			}
		}
		System.out.println(temp);
		sc.close();
	}
}
