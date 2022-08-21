package com.assignmentonarrays;

import java.util.Scanner;

public class Assignment2 {
	int min,sMin;
	
	public void sort(int a[])
	{
		if(a[0]<a[1])
		{
			min = a[0];
			sMin = a[1];
		}
		else
		{
			min = a[1];
			sMin = a[0];
		}
	}
	
	public void calSecndMin(int a[])
	{
		for(int i=2;i<a.length;i++)
		{
			if(a[i]<min)
			{
				sMin = min;
				min = a[i];
			}
			else if(a[i]<sMin)
			{
				sMin = a[i];
			}
		}
	}
	
	public void disp()
	{
		System.out.println("Minimum number in Array is : "+min);
		System.out.println("Second Minimum number in Array is : "+sMin);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		System.out.println("Array elements are: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		Assignment2 o = new Assignment2();
		o.sort(a);
		o.calSecndMin(a);
		o.disp();
	
		sc.close();
	}
}
