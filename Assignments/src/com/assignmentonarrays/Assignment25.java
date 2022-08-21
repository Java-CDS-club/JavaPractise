/*	WAP to print maximum in rows. Means e.g. 
 	arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
*/

package com.assignmentonarrays;

public class Assignment25 {
	
	public void showMaxinRow(int a[][])
	{
		
		for(int i=0;i<a.length;i++)
		{
			int max = a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(max<a[i][j])
				{
					max = a[i][j];
					
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		int a[][] = {{22,31,9},{35,25,166}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		Assignment25 o = new Assignment25();
		o.showMaxinRow(a);
	}
}
