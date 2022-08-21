/*	WAJP2 find sum of main diagonal elements of a matrix.*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment5 {
	
	public void showDiagSum(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					sum += a[i][j];
				}
			}
		}
		System.out.println("The sum of all diagonal matrix is : "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many row and columns you want in Array : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		if(row == col)
		{
			System.out.println("Enter Array elements : ");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
		}
		else
			System.out.println("Enter Rows and Columns size same ");
				
		Assignment5 o = new Assignment5();
		o.showDiagSum(a);
		sc.close();
	}
}
