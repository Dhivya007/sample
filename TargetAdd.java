package com.guvi.hunter;
import java.util.Scanner;
public class TargetAdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		System.out.println("ener the numbers");
		int []arr=new int[limit];
		for (int i = 0; i < limit; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target");
		int target=sc.nextInt();
		for (int i = 0; i < limit; i++)
		{
			for (int j = 0; j < limit; j++)
			{
				if((arr[i]+arr[j])==target)
				{
					System.out.println("numbers are "+arr[i]+" and "+arr[j]);
				 }
			}			
		}
		sc.close();
	}
}
