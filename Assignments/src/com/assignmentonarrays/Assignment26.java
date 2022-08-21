/*	WAP to print minimum in rows. Means
	e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 9 and 12.
*/

package com.assignmentonarrays;

public class Assignment26 {

	public void showMininRow(int a[][])
	{
		
		for(int i=0;i<a.length;i++)
		{
			int min = a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(min>a[i][j])
				{
					min = a[i][j];
					
				}
			}
			System.out.println(min);
		}
	}
	
	public static void main(String[] args) {
		int a[][] = {{22,31,9},{12,0,16}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		Assignment26 o = new Assignment26();
		o.showMininRow(a);
	}	

}
