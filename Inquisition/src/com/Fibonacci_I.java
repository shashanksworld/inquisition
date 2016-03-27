package com;

import java.math.BigDecimal;
import java.math.BigInteger;
	
public class Fibonacci_I {
		static int count=2; 
		public static void main(String args[])
		{
				BigInteger a=new BigInteger("0");
				BigInteger b=new BigInteger("1");
				double n=6;
				System.out.print(a+" "+b);
				compute(a,b,n);
		}
		static int compute(BigInteger a, BigInteger b, double n)
		{	count++;
			
		
			while(count!=n)
			{	
				return compute(b, a.add(b.pow(2)),n);
				
			}
			System.out.print(
					" "+a.add(b.pow(2))
					);
			
			return 0;
		}
		
}
