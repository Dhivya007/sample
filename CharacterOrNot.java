package com.wipro.logical;

import java.util.Scanner;

public class CharacterOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		String  str=sc.next();
		char ch=str.charAt(0);
		if(Character.isAlphabetic(ch))
		{
			System.out.println(" an alphabet");
		}
		else
			System.out.println("not an alphabet");
		sc.close();
		}

}
