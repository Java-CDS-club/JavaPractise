/*	Consider  int type array containing values from range 65 to 90 0r 97 to 122. 
	Ask user to select any 5 values from this array.
	Depending on values he has selected show encoded message to him .
	Example  int a[]= { 65,66,67,97,98,120,99,75}
	If User has selected  66 , 97, 65 then 
	message  shold be display like ‘ Yout code is  B_a_A’      
*/

package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test3Q7 {
	
	public void displayMsg(int b[])
	{
		System.out.println("Your Code is : ");
		for(int i=0;i<b.length;i++)
		{
			if((b[i]>=65 && b[i]<=90) || (b[i]>=97 && b[i]<=122))
				System.out.print((char)b[i]+"_");
		}
	}

	public static void main(String[] args) {

		int a[] = new int[58];
		int b[]= new int[5];
		int no=65;
		for(int i=0;i<a.length;i++,no++)
		{
			a[i] = no;
		}
		System.out.println(Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values from 65 to 90 and 97 to 122: ");
		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
				
		System.out.println(Arrays.toString(b));
		Test3Q7 o = new Test3Q7();
		o.displayMsg(b);
		sc.close();

	}

}
