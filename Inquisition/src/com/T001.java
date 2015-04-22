package com;

import java.util.Arrays;


/*Problem 1: Given an increasingly sorted array and a number s, please find two numbers whose sum is s.
 *  If there are multiple pairs with sum s, just output any one of them.
	For example, if the inputs are an array {1, 2, 4, 7, 11, 15} and a number 15,
	please out two numbers 4 and 11 since 4+11=15.	
 * 
 * */
public class T001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//findNumberSum();//    Runtime O(n^2)
		findNumberSumOptimal();  //Runtime O(n);
		
	}
	
	public static void findNumberSum()
	{
		int a[]={1,2,4,5,7,11,15};
		int s=15;
		
		for(int i=0;i<a.length;i++)
		{
			int temp=s-a[i];
			for(int j=0;j<a.length;j++)
			{
				if(temp==a[j])
					System.out.println(a[i]+","+a[j]);
			}
		}
		
	}
	
	public static void findNumberSumOptimal()
	{
		int a[]={1,2,4,5,7,11,15};
		int s=15;
		int j=a.length-1;
		int i=0;
		
		while(i<j)
		{
			int sum=a[i]+a[j];
			if(s==sum)
			{
				System.out.println("found numbers "+a[i]+","+a[j]);
				break;
			}
			else if(s>sum)
			{
				i++;
			}
			else
				j--;
		}
	}
	
	public static void checkZeroSum()
	{
		int a[]={-3,-4,-9,1,2,4,5,7,11,15};
		Arrays.sort(a);
	}

}
