package com.array;

import java.util.Arrays;

public class NearestMinMax {
	int min=Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	public void findNearMinMax(int arr[],int no)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
				int lNear[] = new int[i];
				for(int j=0;j<i;j++)
				{
					lNear[j]=no-arr[j];
				}
//				System.out.println(Arrays.toString(lNear));
				for(int k=0;k<lNear.length;k++)
				{
					if(lNear[k]<min)
					{
						min=lNear[k];
					}	
					if(lNear[k]>max)
					{
						max=lNear[k];
					}
				}
//				System.out.println(min+" "+max);
				System.out.println("min no is : "+(no-max)+" "+"\nMax no is :"+(no-min));
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,9,23,45,96,45,67};
		int no = 96;
		System.out.println(Arrays.toString(arr));
		NearestMinMax obj = new NearestMinMax();
		obj.findNearMinMax(arr, no);
	}
}
