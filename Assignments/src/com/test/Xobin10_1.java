/*	i/p : {300 200 150} {50,40,50}
 	o/p : 300-50 = 250
 */

package com.test;

//import java.util.Arrays; 
import java.util.Scanner;

public class Xobin10_1 {
	public int find_highest_savings(int salary[],int expense[])
	{
		int highest_savings=0;
		int max = Integer.MIN_VALUE;
		int diff[]=new int[3];
		for(int i=0,j=0;i<salary.length && j<expense.length;i++,j++)
		{
			diff[i]=salary[i]-expense[j];
		}
//		System.out.println(Arrays.toString(diff));
		for(int i=0;i<diff.length;i++)
		{
			if(diff[i]>max)
			{
				max = diff[i];
			}
		}
		highest_savings=max;
		return highest_savings;
	}

	public static void main(String[] args) {
		Xobin10_1 s=new Xobin10_1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		int salary[]=new int[3];
		for(int i=0;i<salary.length;i++)
		{
			salary[i]=sc.nextInt();
		}
		System.out.println("enter the expense");
		int expense[]=new int[3];
		for(int j=0;j<expense.length;j++)
		{
			expense[j]=sc.nextInt();
		}
		int saved=s.find_highest_savings(salary, expense);
		System.out.println(saved);
		sc.close();
	}

}
