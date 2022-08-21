/*	Write a Java program to find a missing number in an array. 
	Means e.g. array has 1 to n element in sequence(n can be 50 or 100) 
	arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5
*/


package com.assignmentonarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment10 {
	
	public int findNo(int a[],int n)
	{
		int sum = (n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
			sum = sum-a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elememnt: ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		Assignment10 o = new Assignment10();
		int res = o.findNo(a,n);
		System.out.println("Missing number is : "+res);
		
		sc.close();

	}

}
