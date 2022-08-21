//WAP to find 2nd max value in an array

package com.assignmentonarrays;

import java.util.Scanner;

public class Assignment1 {
	int max,sMax;
	
	public void sort(int a[])
	{
		if(a[0]>a[1])
		{
			max = a[0];
			sMax = a[1];
		}
		else
		{
			max = a[1];
			sMax = a[0];
		}
	}
	
	public void calSecndMax(int a[])
	{
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sMax = max;
				max = a[i];
			}
			else if(a[i]>sMax)
			{
				sMax = a[i];
			}
		}
	}
	
	public void disp()
	{
		System.out.println("Maximum number in Array is : "+max);
		System.out.println("Second Maximum number in Array is : "+sMax);
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
		
		Assignment1 o = new Assignment1();
		o.sort(a);
		o.calSecndMax(a);
		o.disp();
	
		sc.close();
	}
}
