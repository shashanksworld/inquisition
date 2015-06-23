package com;

/*
 String R is the reverse of the string S. The string S is funny if the condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1 to N−1.
*/public class FunnyString {
	
	public static void main(String args[])
	{
		String s1="acxz";
		String s2="pqst";
		
		char s[]=s2.toCharArray();
		boolean flag=true; 
		 for(int i=0,j=s.length-1;i<j;i++,j--)
         {
             int x=(Math.abs((int)s[i]-(int)s[i+1]));
             int y=(Math.abs((int)s[j]-(int)s[j-1]));
             if(x!=y)
             {System.out.println("Not Funny");
              flag=false;
              break;
             }   
         }
         if(flag)
             System.out.println("Funny");
     }
		
		
}


