/*
  	i/p = abc 
  	o/p = def
 */
package com.string;

import java.util.Scanner;

public class StringEx {
	
	public void displayStr(String str)
	{
//		char ch[] = str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.print((char)(int)(ch[i]+3));
//		}
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print((char)(str.charAt(i)+3));
		}
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		StringEx obj = new StringEx();
		obj.displayStr(s);
		sc.close();
	}

}
