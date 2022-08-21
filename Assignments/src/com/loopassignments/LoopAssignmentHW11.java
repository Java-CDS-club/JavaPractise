//Find all prime number between 400 to 300;

package com.loopassignments;

public class LoopAssignmentHW11 {

	public static void main(String[] args) {
		int i, cnt;
		for(int j = 400;j>=300;j--)
		{
			cnt = 0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
				System.out.println(j+" ");
		}
	}
}
