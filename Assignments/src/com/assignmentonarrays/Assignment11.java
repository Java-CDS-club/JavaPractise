/*	WAP to calculate average of all elements in an Array 
 	except max and min element (Means don’t include the highest 
 	and lowest number of your array in your average).
*/

package com.assignmentonarrays;

import java.util.Scanner;

public class Assignment11 {
	int min,max;
	
	public void showMin(int a[])
	{
		min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
		}
	}
	
	public void showMax(int a[])
	{
		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
	}
	
	public void calAvg(int a[])
	{
		int avg,cnt=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=min || a[i]!=max)
			{
				sum+=a[i];
				cnt++;
			}
		}
		avg=sum/cnt;
		System.out.println("The average of except min and max array is : "+avg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		Assignment11 o = new Assignment11();
		o.showMin(a);
		o.showMax(a);
		o.calAvg(a);
		
		
		sc.close();
	}
}
