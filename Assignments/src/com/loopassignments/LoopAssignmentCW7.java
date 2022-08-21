//WAP to find max digit in given number
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentCW7 {

	public static void main(String[] args) {
		int num,digit,fno=0,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		int num1 = num;
		while(num!=0)
		{
			digit = num % 10;
			if(fno<digit)
			{
				temp = digit;
				fno=temp;
			}
			num = num/10;
		}
		System.out.println("The Maximum digit of "+num1+" is: "+temp);
		sc.close();
	}

}
