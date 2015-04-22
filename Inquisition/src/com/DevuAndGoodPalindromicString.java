package com;

import java.util.Scanner;

public class DevuAndGoodPalindromicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
		System.out.println(isGoodPalindrome(in.nextLine()));
		
	}
	public static String isGoodPalindrome(String s)
	{	
		int len=2;
		int flag=0;
		for(int k=0;k<=s.length();k++)
		{
			for(int i=0;i<=s.length()-len;i++)
		
			{
				String temp =s.substring(i, i+len);
				
				for(int j=i; j<=s.length()-len;j++)
				{
					StringBuilder temp2=null;
					
					StringBuilder sb=new StringBuilder(s.substring(j,j+len));
					temp2=sb.reverse();
					//System.out.println("temp2"+temp2);
					if(temp.equals(temp2.toString()))
					{
						flag=1;
						//System.out.println("is palindrome");
					}else
					{
						//System.out.println("not palindrome");
					}
				}
			}
			len++;
						
		}
		if(flag==1)
		{
			return "Good";
				}
		else
		return "Not Good";
	}

}
