/*	Write a Java program to test the equality of two arrays.
  	Means e.g arr1[] = [12, 22, 32, 42, 52, 62] 
  	and arr2[] = [52, 22, 62, 12, 42, 22]
	Here both arrays are equal
 */

package com.assignmentonarrays;

public class Assignment9 {
	
	public void chkEqual(int a[],int b[])
	{
		if(a.length == b.length)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		}
	}

	public static void main(String[] args) {
		int a[] = {12,22,32,42,52,62};
		int b[] = {52,22,62,12,42,22};
		
		Assignment9 o = new Assignment9();
		o.chkEqual(a,b);
	}

}
