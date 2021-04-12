package com.zensar.demo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.zensar.demo.example.FebonaciMain;

public class FebonaciTest {
	
	
		FebonaciMain obj;
	
	    @Before
	    public void setUp() throws Exception {
	    	 obj = new FebonaciMain();
	    }
	    @Test
	    public void testFibbonacciWithOneAsInput() {//write different test cases and test for edge cases, normal cases something like below.
	         Assert.assertNotNull(obj.checkFebonaciSeries(10));
	    }
}
