/*	WAP to display all square number in array. 
	Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] 
	so output is 25, 49, 9.
 */
package com.assignmentonarrays;

public class Assignment21 {
	
	public void showSqEle(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a[i];j++)
			{
				if((a[i]%j==0) && (a[i]==j*j))
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {23,43,25,49,12,9,78,66,39,0};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		Assignment21 o = new Assignment21();
		o.showSqEle(a);
	}
}
