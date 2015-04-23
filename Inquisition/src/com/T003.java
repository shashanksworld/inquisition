package com;

import java.util.ArrayList;
import java.util.Collections;

/*
			 look for compatible jobs in a given list of jobs with start time aND FINISH TIME.
*/

public class T003 implements Comparable<T003> {

	int st=0;
	int ft=0;
	T003(int st, int ft)
	{
		this.st=st;
		this.ft=ft;
	}
	public String toString()
	{
		return "st:"+this.st+",ft::"+this.ft;
	}
	public static void main(String arg[])
	{
		int job[][]={{1,3},{4,5},{5,7},{8,9}};
		
		
		ArrayList<T003> jobList= new ArrayList<T003>();
		jobList.add(new T003(1,3));
		jobList.add(new T003(4,5));
		jobList.add(new T003(5,7));
		jobList.add(new T003(8,9));
		
		System.out.println(jobList);
		Collections.sort(jobList);
		System.out.println();
		boolean flag =false;
		for(int i=0;i<jobList.size()-2;i++)
		{
				if(jobList.get(i).ft>jobList.get(i+1).st)
				{
					flag=true;
				}
		}
		if(flag)
		{
			System.out.println("Incompatible Jobs");
		}else
			System.out.println("Good Job");
	}
	public int compareTo(T003 a)
	{	
		return this.ft-a.st;
	}
}
