package com.sampleproject.testingprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void tc1()
	{
		Reporter.log("Test 1",true);
	}

}
