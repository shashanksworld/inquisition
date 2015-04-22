package com;

import java.util.HashSet;

/*
 * TO check if two unsorted arrays are permutation of each other..
 * 
 *  it is assumed that two arrays will always contain same no of element for test of permutability.
*/
public class T002 {
		
		public static void main(String args[])
		{
			
			int a[]= {3,2,5,1,6,7,8};
			int b[]= {1,2,3,4,5,6,7};
			HashSet<Integer> hs= new HashSet<Integer>();
			for(int i=0;i<a.length;i++)
			{
					hs.add(a[i]);
					hs.add(b[i]);
					
			}	
			if(hs.size()>a.length || hs.size()>b.length)
			{
				
				System.out.println(" Not Permutable");
			}
			else
			{
				System.out.println("Permutable");
			}
			
			
		}
}
