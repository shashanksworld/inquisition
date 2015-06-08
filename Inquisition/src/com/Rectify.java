package com;
/*
Given an array of random numbers, Push all the zero’s of a given array
to the end of the array. For example, if the given arrays is 
{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed 
to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. 
The order of all other elements should be same. 
Expected time complexity is O(n) and extra space is O(1).
*/
public class Rectify {
	
	
	public static void main(String arg[])
	{
		System.out.println("printing data");
			
			int a[]={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
			
			//push zeros to left of the array
			for(int i=0,j=a.length-1;i<j;)
			{
				int temp=0;
					if(a[j]==0 && a[i]!=0)
					{	temp=a[j];
						a[j]=a[i];
						a[i]=temp;
						i++;
						j--;
					}
					else
						j--;
						
			}
			
			for(int i=0;i<a.length-1;i++)
			{
				System.out.print(a[i]+" ");
				
			}
	}

}
