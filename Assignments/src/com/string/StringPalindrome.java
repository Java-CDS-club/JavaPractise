package com.string;

import java.util.Scanner;

public class StringPalindrome {
	
	public void checkPalindrome(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		StringPalindrome obj = new StringPalindrome();
		obj.checkPalindrome(s);
		sc.close();
	}

}
