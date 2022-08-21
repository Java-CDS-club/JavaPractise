/*	WAP to replace all the 0’s with 1’s in your array.
 	Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34]
 */

package com.assignmentonarrays;

import java.util.Scanner;

public class Assignment12 {
	
	public void replZero(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				a[i]=1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		Assignment12 o = new Assignment12();
		o.replZero(a);
		
		sc.close();
	}
}
