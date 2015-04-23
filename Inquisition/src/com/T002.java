package com;

import java.util.HashSet;

/*
 * TO check if two unsorted arrays are permutation of each other..
 * 
 *  it is assumed that two arrays will always contain same no of element for test of permutability
 *  and no 2 elements in a array are same.
 *  
 *  Runtime=O(2n)
 *  
 *  
 *  Trick for method 2:
 *   8 XOR 3=11
 *   
 	11 XOR 8= 3;
 	3 XOR 3 =0;
 	
 	if the elements are same and permutable then the XOR over all the elements will result into 0 as: A XOR A=0  
 *   
*/
public class T002 {
		
		public static void main(String args[])
		{	
			int a[]= {3,2,5,1,6,7,8};
			int b[]= {8,7,1,5,2,6,3};
			
			method1(a,b);
			//method2(a, b);
			
		}
		public static void method1(int a[], int b[])
		{
			
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
		
		public static void method2(int a[], int b[])
		{
				
			
			int n=a.length;//no of element 
			 
			int p=a[0];
			 
			for(int i=1;i<n;i++)
			{p=p^a[i];
			System.out.println(p);
			}
			 
			System.out.println("for b");
			for(int i=0;i<n;i++)
			{p=p^b[i];
				System.out.println(p);
			}
			 
			if(p==0)
			System.out.println("BOTH ARE PERMUTATION OF EACH OTHER");
			else
			System.out.println(" BOTH ARE NOT PERMUTATION OF EACH OTHER");
		}
		
		
}
