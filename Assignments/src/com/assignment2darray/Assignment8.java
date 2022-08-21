/*	WAJP2 print upper triangular matrix.*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment8 {
	
	public void showUpperEle(int a[][])
	{
		System.out.println("Upper Diagonal Element is : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i!=j)&&(i<=j))
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
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
			Assignment8 o = new Assignment8();
			o.showUpperEle(a);
		}
		else
			System.out.println("Enter Rows and Columns size same ");
				
		sc.close();		

	}

}
