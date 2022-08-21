package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
	
	public void addEle(ArrayList<Integer> i)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		for(int j=0;j<i.size();j++)
		{
			int num = sc.nextInt();
			if(num%2 == 0)
				i.add(num);
		}
//		System.out.println(i);
		sc.close();
	}

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<>();
		ArrayListEx2 obj = new ArrayListEx2();
		obj.addEle(i);

	}

}
