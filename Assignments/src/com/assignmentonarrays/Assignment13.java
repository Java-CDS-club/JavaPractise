/*	WAP to replace all negative value with its immediate left 
 	elements square. Means arr[]= [12, 3, -19, 29, 5, -61, 44, 7, -9]
	Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].
*/

package com.assignmentonarrays;

import java.util.Arrays;

public class Assignment13 {
	
	public void changeEle(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i] = a[i-1];
				a[i] = a[i]*a[i];
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int arr[] = {12, 3, -19, 29, 5, -61, 44, 7, -9};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		Assignment13 o = new Assignment13();
		o.changeEle(arr);
	}

}
