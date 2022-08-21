package com.array;

import java.util.Scanner;

public class EnhLoopNoOcc {
	public void checkNumber(int a[])
	{ 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==-999)
				continue;
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=-999;
				}
			}
			System.out.println(a[i]+" occurs "+cnt+" times");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of elements of array : ");
		int size = sc.nextInt();
		System.out.println("Enter elements in array : ");
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		EnhLoopNoOcc o = new EnhLoopNoOcc();
		o.checkNumber(a);
		sc.close();
	}	
}
