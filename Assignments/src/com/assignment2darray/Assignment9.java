/*	WAJP2 find sum of lower triangular matrix.*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment9 {
	
	public int showLowerEleSum(int a[][])
	{
		int sum=0;
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i!=j)&&(i>=j))
					sum += a[i][j];
			}
		}
		return sum;
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
			Assignment9 o = new Assignment9();
			int ans = o.showLowerEleSum(a);
			System.out.println("Addition of lower triangle element is : "+ans);
		}
		else
			System.out.println("Enter Rows and Columns size same ");
				
		sc.close();		

	}

}
