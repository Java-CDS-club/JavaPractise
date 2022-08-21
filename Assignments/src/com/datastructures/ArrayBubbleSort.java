package com.datastructures;

import java.util.Arrays;

public class ArrayBubbleSort {
	public void bubbleSort(int a[])
	{
		System.out.println("Array size is "+a.length);
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println("Pass "+(i+1));
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
			System.out.println();
			System.out.println("------------------------");
		}
		
	}

	public static void main(String[] args) {
		int a[] = {6,1,6,3,8};
		ArrayBubbleSort o = new ArrayBubbleSort();
		System.out.println("Before sorting array is : ");
		System.out.println(Arrays.toString(a));
		o.bubbleSort(a);
		System.out.println("After Sorting Array is : ");
		System.out.println(Arrays.toString(a));		
	}

}
