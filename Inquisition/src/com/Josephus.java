package com;

public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*
	 * 
	 * n= total no of person in arrangement
	 * k = starting point
	 * z= safespot;
	 */	
		int n=5,k=4;
		int z=J(n,k);
		System.out.println("Safe spot ="+z);
	}
	
	public static int  J(int n,int k)
	{System.out.println("n:"+n);
		if(n==1)
			return 0;
		else
			{
			int recur=J(n-1,k);
			System.out.print(recur+",");
			int exp=(recur+k)%(n);
			System.out.println(exp);
			return exp;
			
			}
		
	}

}
