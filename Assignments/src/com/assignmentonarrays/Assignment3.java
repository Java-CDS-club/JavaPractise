/*	WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] 
	so your output must be 78, 37, 29, 45, 90, 3
*/

package com.assignmentonarrays;

import java.util.Scanner;

public class Assignment3 {
	
	public void dispRevArray(int a[])
	{
		System.out.println("Reverse Array is : ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Elements of Array are : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		Assignment3 o = new Assignment3();
		o.dispRevArray(a);
		
		sc.close();
	}
}
