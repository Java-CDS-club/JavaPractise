package com.array;

import java.util.Scanner;

public class EvenEleEnloop {
	
	public int showEvenSum(int a[])
	{
		int sum=0;
		for(int x : a)
		{
			if(x%2==0)
			{
				sum+=x;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		EvenEleEnloop o = new EvenEleEnloop();
		int ans = o.showEvenSum(a);
		System.out.println("Total even element sum is : "+ans);
		sc.close();
	}

}
