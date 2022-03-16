package RestTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class diffJUnitTesting {

	@Before
	public void BT()
	{
		String Name = "Rithvik";
		String SName = "Harshita";
		Assert.assertEquals(SName, Name);
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is my first teestcase1");
	}
	
	@After
	public void AT()
	{
		System.out.println("This is After test");
	}
	
}
