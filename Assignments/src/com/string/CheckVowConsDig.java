package com.string;

import java.util.Scanner;

public class CheckVowConsDig {
	public void checkAll(String str)
	{
		int vow=0,cons=0,dig=0,space=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||
					str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O')
			{
				vow++;
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				dig++;
			}
			else if(str.charAt(i)==' ')
			{
				space++;
			}
			else
			{
				cons++;
			}			
		}
		System.out.println("Vowels : "+vow+"\nConsonants : "+cons+"\nDigit : "+dig+
				"\nWhite Space : "+space);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		CheckVowConsDig o = new CheckVowConsDig();
		o.checkAll(s);
		sc.close();
	}
}
