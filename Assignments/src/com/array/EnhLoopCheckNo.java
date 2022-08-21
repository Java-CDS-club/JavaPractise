package com.array;

import java.util.Scanner;

public class EnhLoopCheckNo {
	int cnt =0;
	public void checkNumber(int a[],int no)
	{ 
		for(int x : a)
		{
			if(x == no)
				cnt +=1;
				break;
		}
		dispRes(cnt,no);
	}
	public void dispRes(int cnt,int no)
	{
		if(cnt == 1)
			System.out.println(no+" is present in array");
		else
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
		
		EnhLoopCheckNo o = new EnhLoopCheckNo();
		o.checkNumber(a,no);
		sc.close();
	}
}
