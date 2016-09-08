package com.wipro.logical;

import java.util.Scanner;

public class CountingCharacters
{
	public static void main(String[] args)
	{
		int ch=0;
		int num=0;
		int alphanum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
        	if(Character.isAlphabetic(str.charAt(i)))
        	{
        		alphanum++;
        	}
        	else if(Character.isDigit(str.charAt(i)))
        	{
        		num++;
        	}
        	else
        		ch++;
	     }
        System.out.println("characters-->"+ch);
        System.out.println("numbers-->"+num);
        System.out.println("aplhanumerics-->"+alphanum);
        sc.close();
      }
}