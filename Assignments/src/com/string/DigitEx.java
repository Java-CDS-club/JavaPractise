package com.string;

import java.util.Scanner;

public class DigitEx {
	public void showDigit(String str)
	{
		char ch[] = str.toCharArray();
		String dig="";
		for(int i=0;i<=ch.length;i++)
		{
			if((ch[i]>='0'||ch[i]<='9')&&(ch[i+1]>='0'||ch[i+1]<='9'))
			{
				System.out.println("hi");
				//dig=String.valueOf(ch[i])+String.valueOf(ch[i+1]);
			}
		}
		System.out.println(dig);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String with Digit : ");
		String s = sc.nextLine();
		
		sc.close();
	}

}
