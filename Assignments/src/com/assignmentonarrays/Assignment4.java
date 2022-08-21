/*	WAP to reverse the array itself, don’t print array in reverse – I want current array reverse.
 	Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be
	[78, 37, 29, 45, 90, 3] by using temporary array.
*/
package com.assignmentonarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {
	
	public void dispRevArray(int a[])
	{
		System.out.println("Reverse Array :");
		int temp[] = new int[a.length];
		for(int i=a.length-1,j=0;i>=0 && j<temp.length;i--,j++)
		{
			temp[j]=a[i];
		}
		for(int i =0;i<temp.length;i++)
		{
			a[i]=temp[i];
		}
		System.out.println(Arrays.toString(a));
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
		
		Assignment4 o = new Assignment4();
		o.dispRevArray(a);
		
		sc.close();
	}
}
