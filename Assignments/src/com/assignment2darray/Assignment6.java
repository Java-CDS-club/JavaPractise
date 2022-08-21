/*	WAJP2 find sum of minor diagonal elements of a matrix.*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment6 {
	
	public void showMinorDiagSum(int a[][])
	{
		int sum=0;
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			sum += a[i][j];
		}
		System.out.println("Addition of Minor diagonal Matrix elements is : "+sum);
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
			Assignment6 o = new Assignment6();
			o.showMinorDiagSum(a);
		}
		else
			System.out.println("Enter Rows and Columns size same ");
				
		sc.close();
	}

}
