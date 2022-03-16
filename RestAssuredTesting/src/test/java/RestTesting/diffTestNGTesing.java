package RestTesting;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class diffTestNGTesing {

	@BeforeClass
	public void BT()
	{
		String Name = "Rithvik";
		String SName ="Harshita";
		
		Assert.assertEquals(SName,Name);
		System.out.println("Both the names are same");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is the first method");
	}
	
	@AfterClass
	public void AT()
	{
		System.out.println("This is after method");
	}

}
