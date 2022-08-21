/*	Write a Java program to find the duplicate values of an array of integer values. 
 	Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78.*/

package com.assignmentonarrays;

import java.util.Scanner;

public class Assignment6 {

	public void findDupValue(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[j]);
				}
			}
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
		
		Assignment6 o = new Assignment6();
		o.findDupValue(a);
		
		sc.close();
	}
}
