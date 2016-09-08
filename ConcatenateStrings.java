package com.wipro.logical;

import java.util.Scanner;

public class ConcatenateStrings 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=sc.nextLine();
		System.out.println("enter the second string");
		String str2=sc.nextLine();
		System.out.println("Concatenated strings are "+str1+str2);
		sc.close();
	}

}
