package com.string;

import java.util.Scanner;

public class OddStringReverse {
	
	public void oddReverse(String s)
	{
		String revstr="";
		String str[] = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length() %2 !=0)
			{
				for(int j=str[i].length()-1;j>=0;j--)
				{
					revstr+=str[i].charAt(j);
				}
				revstr+=" ";
			}
			else
			{
				revstr+=str[i]+" ";
			}
				
		}
		System.out.println(revstr);
	}

	public static void main(String[] args) {
		System.out.println("Please enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		OddStringReverse obj = new OddStringReverse();
		obj.oddReverse(s);
		sc.close();
	}

}
