package com.array;

import java.util.Scanner;

public class ArrayEleSum {
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int a[]= new int[size];
	
	public void acceptArray()
	{
		System.out.println("Enter Array elements: ");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum = sum+a[i];
		}
	}
	 public void displaySumArray()
	 {
		 System.out.println("The additon of array elements are : "+sum);
	 }


	public static void main(String[] args) {
		System.out.println("Enter array size : ");
		
		ArrayEleSum o = new ArrayEleSum();
		o.acceptArray();
		o.displaySumArray();
		
	}
}
