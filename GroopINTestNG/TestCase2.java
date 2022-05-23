package GroopINTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeClass
    public void openbrowser() {
    	System.out.println("open berowse successfully");
    }
	@AfterClass
	public void closebrowser() {
		System.out.println("browser is closed");
	}
	@Test (groups="smoke")
	public void test4() {
		System.out.println("test 4 is open");
		
	}
	@Test (groups = "functional")
	public void test5() {
		System.out.println("test 5 open");
		
	}
	@Test (groups= {"functional", "regression"})
	public void test6() {
		System.out.println("test 6 open");
		
	}

}
