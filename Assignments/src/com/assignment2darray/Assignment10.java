/*	WAJP2 check Symmetric matrix (ie the matrix must be equal to its transpose)
*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment10 {
	
	public void transpose(int a[][])
	{
		int b[][] = new int [a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j] = a[j][i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}		
		checkSymmetric(a,b);
	}
	
	public void checkSymmetric(int a[][],int b[][])
	{
		int cnt = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==b[i][j])
				{
					cnt = 1;
				}
			}
		}
		if(cnt == 1)
			System.out.println("Its Symmetric Matrix");
		else
			System.out.println("Not Symmetric Matrix");
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
			Assignment10 o = new Assignment10();
			o.transpose(a);
		}
		else
			System.out.println("Enter Rows and Columns size same ");
				
		sc.close();
	}

}
