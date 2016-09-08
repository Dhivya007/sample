package com.guvi.hunter;

import java.util.Scanner;

public class ArrayRepeat 
{
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int len=sc.nextInt();
		int count=0;
		int []arr=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++)
		{
			count=0;
			for (int j = 0; j <arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(arr[i]);
				break;
			}
    	}
		sc.close();
	}

}
