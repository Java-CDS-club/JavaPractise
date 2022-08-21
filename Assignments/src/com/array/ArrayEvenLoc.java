package com.array;

import java.util.Scanner;

public class ArrayEvenLoc {
	public void dispEvenLoc(int a[])
	{
		System.out.println("Elements of even location in Array are: ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" = "+a[i]);
			}
		}
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
		ArrayEvenLoc o = new ArrayEvenLoc();
		o.dispEvenLoc(a);
	
		sc.close();
	}
}
