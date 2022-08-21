/*	WAP to swap array like input array is [2, 4, 9, 0],
  	so your output array must be [9, 0, 2, 4]
 */

package com.assignmentonarrays;

import java.util.Arrays;

public class Assignment8 {
	public void swapEle(int a[])
	{
		int n=a.length;
		for(int i=0;i<n/2;i++)
		{
			int temp;
			if(i%2==0)
			{
				temp = a[i];
				a[i] =a[n-i-2];
				a[n-i-2] = temp;
			}
			else
			{
				temp=a[i];
				a[i] = a[n-i];
				a[n-i] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	

		

	public static void main(String[] args) {
		int a[]= {2,4,9,0};
		System.out.println(Arrays.toString(a));
		Assignment8 o = new Assignment8();
		o.swapEle(a);
	}
}
