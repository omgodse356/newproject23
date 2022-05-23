package GroopINTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void opendb() {
		System.out.println("open db successfully");
		
	}
	@AfterTest
	public void closedb() {
		System.out.println("db is closed");
	}
	@BeforeClass
    public void openbrowser() {
    	System.out.println("open berowse successfully");
    }
	@AfterClass
	public void closebrowser() {
		System.out.println("browser is closed");
	}
	@Test (groups="smoke")
	public void test1() {
		System.out.println("test 1 is open");
		
	}
	@Test(groups="functional")
	public void test2() {
		System.out.println("test 2 open");
		
	}
	@Test (groups= {"functional","regression"})
	public void test3() {
		System.out.println("test 3 open");
		
	}
}
