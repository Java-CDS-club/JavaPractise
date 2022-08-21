package com.collection.arraylist;

import java.util.Arrays;

public class SwapZero {

	public static void main(String[] args) {
		int arr[] = {1,2,0,0,0,3,5};
		System.out.println(Arrays.toString(arr));
		int count =0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(count ==0)
				count = i;
			if(arr[i]!=0)
				arr[count--]=arr[i];
		}
		
		while(count>=0)
		{
			arr[count--] =0;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
