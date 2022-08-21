/*	WAJP2 subtract two matrices.
*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment3 {
	
	public void showSub(int a[][],int b[][])
	{
		int temp[][]= new int[a.length][a.length];
		System.out.println("Array after substraction is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				temp[i][j] = a[i][j]-b[i][j];
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
		int b[][] = new int[row][col];
		System.out.println("Enter elements for first array : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements for second array : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		Assignment3 o = new Assignment3();
		o.showSub(a,b);
		
		sc.close();
	}

}
