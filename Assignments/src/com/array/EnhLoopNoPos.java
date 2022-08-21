package com.array;

import java.util.Scanner;

public class EnhLoopNoPos {
	int cnt = 0,cnt1=0;
	public void checkNumber(int a[],int no)
	{ 
		for(int x : a)
		{
			if(x == no)
			{
				cnt1 = cnt;
				System.out.println(no+" is present on "+cnt1+" position");
				cnt++;
			}
			else
			{
				cnt++;
			}
		}
		if(cnt1==0)
			System.out.println(no+" is not present in array");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of elements of array : ");
		int size = sc.nextInt();
		System.out.println("Enter elements in array : ");
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter numer for check : ");
		int no = sc.nextInt();
		
		EnhLoopNoPos o = new EnhLoopNoPos();
		o.checkNumber(a,no);
		sc.close();
	}
}
