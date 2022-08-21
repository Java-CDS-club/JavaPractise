//india is my country is india

package com.string;

//import java.util.Arrays;
import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String word[] = s.toLowerCase().split(" ");
		s="";
		for(int i=0;i<word.length;i++)
		{
			int cnt=1;
			if(word[i].equals("0"))
				continue;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					cnt++;
					word[j]="0";
				}				
			}
			if(cnt>1)
				s+=word[i]+"\n";
				
		}
		System.out.println(s);		
		sc.close();
	}

}
