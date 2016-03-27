package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.MySet;

public class MySetTest {

	@Test
	public void test() {
		MySet set= new MySet();
		Assert.assertNotNull(set);
		
		int a[]={1,3};
		MySet one= new MySet();
		Assert.assertNotNull(set);
	
		one.add(1);
		Assert.assertFalse(one.isEmpty());
		Assert.assertTrue(one.checkSize()==1);
		
		
		MySet two= new MySet(a);
		Assert.assertFalse(two.isEmpty());
		Assert.assertTrue(two.checkSize()==2);
		
//		one.asList();
		
		
		
		
	}

}
