/*	Create array to store first 5 even numbers.
  	Pass this array to display method to show it.
 */

package com.test;

public class Test3Q1 {
	
	public void showEvenNo(int a[])
	{
		int cnt=0;
		System.out.println("The even number is : ");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				if(cnt==5)
					continue;
				cnt++;
				System.out.print(a[i]+" ");
			}
		}	
	}

	public static void main(String[] args) {
		int a[] = {3,2,7,8,5,10,12,15,18,20};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Test3Q1 o = new Test3Q1();
		o.showEvenNo(a);

	}

}
