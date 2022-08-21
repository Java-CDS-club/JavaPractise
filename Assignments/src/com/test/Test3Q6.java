/*	Create 3*3 Array to store int type values .accept values from user side. 			[3]
a.	Show sum  of all even numbers from array
b.	Show smallest even number from array
c.	Show transpose of array
*/

package com.test;

import java.util.Scanner;

public class Test3Q6 {
	
	public void showEvenSum(int a[][])
	{
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public void getEvenEle(int a[][])
	{
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					min = a[i][j];
					break;
				}
			}
		}
		showSmallEven(a,min);
	}		
	
	public void showSmallEven(int a[][],int min)
	{
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					if(min>a[i][j])
					{
						min = a[i][j];
					}
				}
			}
		}
		System.out.println("Min is "+min);
	}

	public void showTranspose(int a[][])
	{
		System.out.println();
		int b[][] = new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j] = a[j][i];
			}
		}
		System.out.println("Transpose Matrix is : ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns you want : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int [row][col];
		System.out.println("Enter array elements : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		Test3Q6 o = new Test3Q6();
		o.showEvenSum(a);
		o.getEvenEle(a);
		o.showTranspose(a);
			
		sc.close();
	}
}
