package com.array;

import java.util.Scanner;


public class ArrayEvenSum {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int a[] = new int[size];
	int sum = 0;
	
	public void acceptArray()
	{
		System.out.println("Enter Array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2 == 0)
			{
				sum = sum+a[i];
			}
		}
	}
	
	
	public void displaySumArrray()
	{
		System.out.println("The addition of even sum elements are : "+sum);
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("Enter array size : ");
		
		ArrayEvenSum a= new ArrayEvenSum();
		a.acceptArray();
		a.displaySumArrray();
	}
}
