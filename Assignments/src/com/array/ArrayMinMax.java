package com.array;

import java.util.Scanner;

public class ArrayMinMax {
	
	public void dispMin(int a[])
	{
		System.out.println("Minimum Number is : ");
		int min=a[0];
		for(int i = 0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		System.out.print(min);
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
		
		ArrayMinMax o = new ArrayMinMax();
		o.dispMin(a);
	
		
		sc.close();
	}
}
