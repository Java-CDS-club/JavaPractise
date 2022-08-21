package com.array;

import java.util.Scanner;

public class SumEnLoop {
	int sum = 0;
	public void sumArrayEle(int a[])
	{		
		for(int i:a)
		{
			sum = sum+i;
		}
	}
	
	public void dispSum()
	{
		System.out.println("The Addition of array element is : "+sum);
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
		
		SumEnLoop o = new SumEnLoop();
		o.sumArrayEle(a);
		o.dispSum();
		sc.close();

	}

}
