/*	WAJP2 check if a matrix is a Sparse matrix 
 	(in which most of the elements are 0).
  	Print “Sparse” if it is Sparse else print “Not sparse”
 */

package com.assignment2darray;

import java.util.Scanner;

public class Assignment1 {
	
	public void checkEle(int a[][])
	{
		int cnt=0,l=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				l++;
				if(a[i][j] ==0)
				{
					cnt++;
				}
			}
		}
	//	System.out.println(cnt+" "+l);
		checkSparse(a,cnt,l);
	}
	
	public void checkSparse(int a[][],int no,int l)
	{
		if(no>l/2)
			System.out.println("Sparse");
		else
			System.out.println("Not Sparse");
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
		
		Assignment1 o = new Assignment1();
		o.checkEle(a);
		sc.close();
	}
}
