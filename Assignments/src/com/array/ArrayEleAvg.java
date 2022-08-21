package com.array;

import java.util.Scanner;

public class ArrayEleAvg {
	int sum = 0;
	double avg;
	public void calAvg(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		avg = sum/a.length;
	}
	public void dispAvg()
	{
		System.out.println("The average of array elements are: "+avg);
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
		ArrayEleAvg o = new ArrayEleAvg();
		o.calAvg(a);
		o.dispAvg();		
		sc.close();
	}
}
