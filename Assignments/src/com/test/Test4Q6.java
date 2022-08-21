/*	Write a code to add 'ing' at the end of a given string 
	(length should be at least 3). 
	If the given string already ends with 'ing' then add 'ly' instead.
	If the string length of the given string is less than 3, 
	leave it unchanged. 
	Sample String : 'abc'
	Expected Result : 'abcing'
	Sample String : 'string'
	Expected Result : 'stringly'  
 */


package com.test;

import java.util.Scanner;

public class Test4Q6 {
	
	public void addIng(String s)
	{
		int no = s.length();
		
		if(no>=3)
		{
			String s2 = "";
			String s3 = "";
			String s4 = "ly";
			String s5 = "ing";
			
			for(int i=s.length()-1, cnt=1; i>=0; i--, cnt++)
			{
				s2+=s.charAt(i);
				if(cnt==3)
					break;
			}
			for (int i=s2.length()-1; i>=0; i--)
			{
				s3+=s2.charAt(i);
			}

			if(s3.equals(s5))
			{				
				String s6= s + s4;
				System.out.println(s6);				
			}
			else
			{
				String s6= s + s5;
				System.out.println(s6);		

			}
		}
		else
		{
			System.out.println(s);
		}		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		Test4Q6 o = new Test4Q6();
		o.addIng(s);
		sc.close();
	}
}

