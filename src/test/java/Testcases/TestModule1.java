package Testcases;

import org.testng.annotations.Test;

public class TestModule1 {
	
	
	
	
	@Test(priority=2)
	public void Testcase1()
	{ 
		
		System.out.println("testcase 1 got executed");
	}
	
	@Test(priority=3)
	public void Testcase2()
	{
		
		System.out.println("testcase 2 got executed");
	}
	
	@Test(priority=4)
	public void Testcase3()
	{
		
		System.out.println("testcase 3 got executed");
	}
	
	
	

}
