package com;

import java.util.HashMap;
import java.util.TreeMap;

public class Cipher {

	static TreeMap<String,Integer> hm= new TreeMap<String,Integer>();
	public static void main(String arg[])
	{	
		for(int i=97;i<121;i++)
		{
			 hm.put(new String(Character.toChars(i)),i);
		}
		
		
		
		
	}
}
