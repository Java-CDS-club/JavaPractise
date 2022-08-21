package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class OccurenceOfWord {
	public void sepString(String str)
	{
		String s1[] = str.split(" ");
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]=="0")
				continue;
			int cnt=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					cnt++;
					s1[j] = "0";
				}
			}
			System.out.println(s1[i]+" occurs "+cnt+" times");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		OccurenceOfWord o = new OccurenceOfWord();
		o.sepString(s);
				
		sc.close();
	}

}
