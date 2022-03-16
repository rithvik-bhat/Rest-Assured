package RestTesting;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class TestNG {
//This is called as a method
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("This is going to execute first");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("This one will execute after BeforeSuite");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("This one will execute before the class gets executed");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("This will execute before every test method");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is the first test method");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("This is the second test method");
	}
	
	@AfterTest
	public void AM()
	{
		System.out.println("After executing each test method");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("This will excute after the class");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("This will excute after all the test is executed");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("This will execute after evertything at the end");
	}


}
