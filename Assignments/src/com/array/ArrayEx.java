package com.array;

import java.util.Scanner;

public class ArrayEx {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int a[]= new int[size];
	
	public void acceptArray()
	{
		System.out.println("Enter Array elements: ");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public void displayArray()
	{
		System.out.println("Reverse Array element is: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter array size : ");
				
		ArrayEx o = new ArrayEx();
		o.acceptArray();
		o.displayArray();
	}
}
