package com.array;

import java.util.Scanner;


public class TwoDRowEven {
	
	public void showEvenRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2 ==0)
				{
					System.out.print(a[i][j]+" ");
				}
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
		
		TwoDRowEven o = new TwoDRowEven();
		o.showEvenRow(a);
		sc.close();

	}

}
