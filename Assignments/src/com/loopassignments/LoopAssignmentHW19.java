/*WAP to find given number is Harshad/Niven number or not 
  An harshad number is an integer number divisible by sum of its digit 
   Eg 18 sum=9  and 18 is divisible by 9

*/
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW19 {

	public static void main(String[] args) {
		int num,sum =0,digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		int temp = num;
		while(num!=0)
		{
			digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		if(temp%sum ==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a harshad number");
		sc.close();
	}

}
