package com.array;

import java.util.Scanner;

public class ForEnh2DArray {
	
	public void showArray(int a[][])
	{
		for(int arr[] : a)
		{
			for(int x : arr)
			{
				System.out.print(x+" ");
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
		
		TwoDArray o = new TwoDArray();
		o.showArray(a);
		sc.close();

	}

}
