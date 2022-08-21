/*	Accept a number from user. Store each digit from that number into array.
 	If array contains that digit already then it should not be stored again.
	Eg. Number is 784867, then array should contain values like  7,8,4,6 
*/

package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test3Q3 {
	int cnt=0;
	int a[];
	public void countDigit(int no)
	{
		while(no%10!=0)
		{
			cnt++;
			no = no/10;
		}
	}

	public void arrayNum(int no)
	{
		a = new int[cnt];
		for(int i=0;i<a.length;i++)
		{
			int digit = no%10;
			a[i] = digit;
			no = no/10;
		}
		System.out.println(Arrays.toString(a));
		dispNum(a);
	}
	
	public void dispNum(int a[])
	{
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int cnt1=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt1==1)
			{
				System.out.println(a[i]);
				b[i] = a[i];
			}
		}
		show(b);
	}
	
	public void show(int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
				System.out.print(b[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no = sc.nextInt();
		
		Test3Q3 o = new Test3Q3();
		o.countDigit(no);
		o.arrayNum(no);
		sc.close();
	}

}
