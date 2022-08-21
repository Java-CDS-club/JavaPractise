package com.test;

import java.util.Scanner;

public class Test4Q7 {
	
	public void removeInd(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i=i+2)
		{
			s1+=s.charAt(i);
		}
		System.out.println("After Removing Index : ");
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		System.out.println(s);
		Test4Q7 o = new Test4Q7();
		o.removeInd(s);
		sc.close();
	}

}
