package com.app.extend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Sample {
	
	static final Logger logger =  LogManager.getLogger(Test_Sample.class);
	
	@Test
    public void test1() {
	  logger.info("Test1");
	  Assert.assertTrue(false);
    }
	@Test
    public void test2() {
		 logger.info("Test2");
		  Assert.assertTrue(true);
    }
	@Test
    public void test3() {
		 logger.info("Test3");
		  Assert.assertTrue(true);
    }
}
