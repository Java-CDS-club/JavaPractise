/* i/p = {8,4,3,5,7,6,9}
 * o/p = 4,6;
 * 
 * */

package com.collection.arraylist;

import java.util.Arrays;

public class LeftNearRightNear {

	public static void main(String[] args) {
		int a[] = {12,23,2,1,18,5,14,16,11,74,10};
		int no=5;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(no == a[i])
			{
				int lNear[]=new int[i];
				int rNear[]=new int[a.length-i-1];
				int min = Integer.MAX_VALUE,min1 = Integer.MAX_VALUE;
				for(int j=0;j<i;j++)
				{	
					lNear[j] = no-a[j];
				}
				for(int k=0;k<a.length-i-1;k++)
				{
					rNear[k] = no+a[i+k+1];
				}
				System.out.println(Arrays.toString(lNear));
				System.out.println(Arrays.toString(rNear));
				for(int j=0;j<lNear.length;j++)
				{
					if((min>lNear[j])&&(lNear[j]>=0))
					{
						min = lNear[j];
					}
				}
				for(int j=0;j<rNear.length;j++)
				{
					if(min1>rNear[j])
					{
						min1 = rNear[j];
					}
				}
				System.out.println(no-min);
				System.out.println(min1-no);
			}
		}

	}

}


/*
 * 		int a[] = {8,4,3,5,7,6,9,10};
		int no=5;
		for(int i=0;i<a.length;i++)
		{
			if(no == a[i])
			{
				int lNear[]=new int[i];
				int rNear[]=new int[a.length-i-1];
				int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
				for(int j=0,k=i+1;j<i||k<a.length-1;j++,k++)
				{	
					lNear[j] = no-a[j];
					
					for(int z=0;z<rNear.length;z++)
					{
						rNear[z] = no+a[k];
					}

				}
				System.out.println(Arrays.toString(lNear));
				System.out.println(Arrays.toString(rNear));
			}
		}

	}*/
 