package com.datastructures;

import java.util.Arrays;

public class ArraySelectionSort {
	
	public void selectionSort(int a[])
	{
		System.out.println("Array size is "+a.length);
		for(int i=0;i<a.length;i++)
		{
			int minIdx = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minIdx])
				{
					minIdx = j;
				}
			}
			int temp = a[minIdx];
			a[minIdx] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		int a[] = {6,1,6,3,8};
		
		ArraySelectionSort o = new ArraySelectionSort();
		
		System.out.println("Before sorting array is : ");
		System.out.println(Arrays.toString(a));
		o.selectionSort(a);
		
		System.out.println("After Sorting Array is : ");
		System.out.println(Arrays.toString(a));		
	}
}
