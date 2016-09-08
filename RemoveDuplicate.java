package com.guvi.hunter;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		Set<Character> s=new TreeSet<Character>();
		for (int i = 0; i < str.length(); i++) 
		{
			s.add(str.charAt(i));
		}
		System.out.println(" "+s.toString().replace("[", "").replace(",", "").replace("]", ""));
		
		sc.close();
	}

}
