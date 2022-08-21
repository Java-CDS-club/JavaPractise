package com.string;

import java.util.Scanner;

public class Digit {
	
	public void addDigit(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println("Digit addition is : "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string with digit : ");
		String s = sc.next();
		Digit d = new Digit();
		d.addDigit(s);
		sc.close();
	}

}
