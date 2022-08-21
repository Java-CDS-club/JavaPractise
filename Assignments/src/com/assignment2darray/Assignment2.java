/*	WAJP2 create transpose of a matrix
	(transpose is converting rows to columns) and print it.
*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment2 {

	public void transposeMatrix(int a[][])
	{
		int temp[][]=new int[a.length][a.length];
		System.out.println("Transpose Matrix is : ");
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp[i].length;j++)
			{
				temp[i][j] = a[j][i];
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows and columns you want?");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter array elements : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
	
		Assignment2 o = new Assignment2();
		o.transposeMatrix(a);
		sc.close();
	}
}
