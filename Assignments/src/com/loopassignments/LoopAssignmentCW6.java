//WAp to count number between 1 to 50 which are divisible by 5

package com.loopassignments;

public class LoopAssignmentCW6 {

	public static void main(String[] args) {
		int cnt=0;
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
			{
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
