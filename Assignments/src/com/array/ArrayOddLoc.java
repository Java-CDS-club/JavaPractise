package com.array;

import java.util.Scanner;

public class ArrayOddLoc {
	public void dispOddLoc(int a[])
	{
		System.out.println("Elements of Odd location in Array are: ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
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
		ArrayOddLoc o = new ArrayOddLoc();
		o.dispOddLoc(a);
	
		sc.close();
	}
}
