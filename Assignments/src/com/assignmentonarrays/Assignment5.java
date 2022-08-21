/*	WAP to reverse the array itself, don’t print array in reverse – 
 	I want current array reverse.
   	Means e.g. arr[] = [3, 90, 45, 29, 37, 78] 
  	so your same array must be [78, 37, 29, 45, 90, 3] without using temporary array.
 */

package com.assignmentonarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {
	public void revArray(int a[],int n)
	{
		for(int i=0;i<n/2;i++)
		{
			int temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp; 
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		Assignment5 o = new Assignment5();
		o.revArray(a,size);
		sc.close();
	}
}
