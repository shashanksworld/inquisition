package com;

/*
		As of  now the program is incomplete ... working to fox it..
*/
import java.util.Arrays;
import java.util.Scanner;

public class DevuAndRabbitNumbering {

	/*
	 * 
	 * Definition
Class: DevuAndRabbitNumbering
Method: canRenumber
Parameters: int[]
Returns: String
Method signature: String canRenumber(int[] rabbitIds)
(be sure your method is public)
	 * 
	 * */
	 
	 
	 public static void main(String args[])
	 {
		 int a[]={1,2,3,4,5,4,5,6,3,5,3,4,5,6,5};
		 String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
				 canRenumber(a);	 
		 
	 }
	 public static void canRenumber(int [] rabbitIds)
	 {
		 Arrays.sort(rabbitIds);
		 
		 int temp=0;
		 
		 for(int i=0;i<rabbitIds.length;i++)
		 {
			 System.out.print(rabbitIds[i]);
		 }
		 for(int i=0;i<rabbitIds.length-1;i++)
		 {
			 temp=rabbitIds[i+1];
			 
				 if(rabbitIds[i]==temp)
				 {
					 rabbitIds[i+1]=temp+1;
				 }if(rabbitIds[i]>temp)
				 {
					 rabbitIds[i+1]++;
					 rabbitIds[i]++;
				 }
						  
		 }
		 System.out.println();
		 for(int i=0;i<rabbitIds.length;i++)
		 {
			 System.out.print(rabbitIds[i]);
		 }
		 	
	 }
	 
	
}
