package GroopINTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	@BeforeClass
	public void openbrowser() {
		System.out.println("browser is open");
	}
	@AfterClass	
	public void closebrowser() {
	 System.out.println("bowser is closed");
	 
	}
	@Test(groups="smoke")
	public void test7() {
		System.out.println("tes7 is run");
		
	}
	@Test(groups="functional")
	public void test8() {
		System.out.println("test 8 is run");
	}
	@Test (groups= {"functional","regression"})
	public void test9() {
		System.out.println("test 9 is run");
	
		
		
		
	
		
		
	}

}
