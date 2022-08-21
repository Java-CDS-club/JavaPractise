/*	Write a Java program to find the common elements between two arrays (int values)
	Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and
	arr2[] = [39, 25, 15, 23, 55, 91, 66, 22],
	so common between two arrays are 23 and 91
*/

package com.assignmentonarrays;

public class Assignment7 {
	public void commnEle(int[]a,int []b)
	{
		System.out.print("Common Elements are : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {12,23,34,67,78,91,56};
		int b[] = {39,25,15,23,55,91,66,21};
		Assignment7 o = new Assignment7();
		o.commnEle(a,b);

	}

}
