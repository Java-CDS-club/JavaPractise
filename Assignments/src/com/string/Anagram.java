package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public void checkAnagram(String str,String str1)
	{
		char ch[] = str.toCharArray();
		char ch1[] = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		
		if(Arrays.equals(ch, ch1))
			System.out.println("anagram");
		else
			System.out.println("not anagram");
		
/*		if(str.length() == str1.length())
		{
			for(int i=0;i<ch.length-1;i++)
			{
				for(int j=0;j<ch.length-i-1;j++)
				{
					if(ch[j]>ch[j+1])
					{
						char temp = ch[j+1];
						ch[j+1] = ch[j];
						ch[j] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(ch));
			for(int i=0;i<ch1.length-1;i++)
			{
				for(int j=0;j<ch1.length-i-1;j++)
				{
					if(ch1[j]>ch1[j+1])
					{
						char temp = ch1[j+1];
						ch1[j+1] = ch1[j];
						ch1[j] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(ch1));
			int count=0;
			for(int i=0,j=0;i<ch.length&&j<ch.length;i++,j++)
			{
				if(ch[i]!=ch1[j])
					count++;
			}
			if(count==0)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
*/
//			if(Arrays.toString(ch).equals(Arrays.toString(ch1)))
//				System.out.println("Anagram");
//			else
//				System.out.println("Not Anagram");
//		}
//		else
//			System.out.println("Not anagram");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String s = sc.nextLine();
		System.out.println("Enter Second String : ");
		String s1 = sc.nextLine();
		
		s = s.toLowerCase();
		s1 = s1.toLowerCase();
		
		Anagram o = new Anagram();
		o.checkAnagram(s, s1);
		sc.close();
	}
}
