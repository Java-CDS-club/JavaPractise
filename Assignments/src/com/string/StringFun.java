package com.string;

import java.util.Scanner;

public class StringFun {
	
	public void revsStrng(String str)
	{
		System.out.println("The reverse string is :");
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i)+" ");
	}
	
	public void checkChar(String str,char ch)
	{
		boolean flag=false;
		int cnt=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				cnt++;
				flag = true;
				System.out.println(str.charAt(i)+" Charatcter present at "+i+" location");
			}				
		}
		if(flag == true)
			System.out.println(ch+" Character present "+cnt+" times");
		else
			System.out.println(ch+" Character not present");
	}

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s);
		
		StringFun o = new StringFun();
		o.revsStrng(s);
		
		System.out.println();
		System.out.println("Enter character for search: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		o.checkChar(s,ch);
			
		sc.close();
	}

}
