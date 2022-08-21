package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringConcat {
	
	public void addStr(String s,String s1)
	{
//		String s2 = s.concat(s1);
//		System.out.println(s2);
//		String s3 = s+s1;
//		System.out.println(s3);
		
		String s5="";
		for(int i=0;i<s.length();i++)
		{
			s5 = s5+s.charAt(i);
		}
		for(int i=0;i<s1.length();i++)
		{
			s5 += s1.charAt(i);
		}
		System.out.println(s5);
	}
	
	public void copyStr(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1+=s.charAt(i);
		}
		System.out.println("Copy Stirng is: "+s1);
	}
	
	public void removeEle(String s,char ch)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
			{
				s1+=s.charAt(i);
			}
		}
		System.out.println("After remove Character :"+s1);
	}
	
	public void findOccurence(String s)
	{
		char ch[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='0')
				continue;
			int cnt=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i] == ch[j])
				{
					cnt++;
					ch[j]='0';
				}
			}
			System.out.println(ch[i]+" occurs "+cnt+" times");
		}
	}
	//Display alternate character from String in reverse Order.
	public void reverseEle(String s)
	{
		System.out.println("Current String is : "+s);
		char ch[] = s.toCharArray();
		System.out.println("Reverse Aletrnate character is :");
		for(int i=s.length()-1;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.print(ch[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String s = sc.next();
	//	System.out.println("Enter Second String : ");
	//	String s1 = sc.next();
		
		StringConcat o = new StringConcat();
	//	o.addStr(s,s1);
	//	o.copyStr(s);
		
	//	System.out.println(s);
	//	System.out.println("Enter character for remove");
	//	char ch = sc.next().charAt(0);
	//	o.removeEle(s,ch);
		o.findOccurence(s);
		o.reverseEle(s);
		
		sc.close();
	}

}
