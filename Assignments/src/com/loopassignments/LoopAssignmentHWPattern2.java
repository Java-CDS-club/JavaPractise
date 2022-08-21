/*
  	    *
  	   **
  	  ***
  	 ****
  	*****
  
 */
package com.loopassignments;

public class LoopAssignmentHWPattern2 {

	public static void main(String[] args) {
		int rows = 5;
		/*int rows1 = rows;
		for(int i=1;i<=rows;i++)
		{
			for(int k =1;k<=rows1-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}*/
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=rows;j++)
			{
				if((i<=j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
