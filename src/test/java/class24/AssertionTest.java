package class24;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	//@Test
	public void testHardAssert() {
		String str1 = "Hello";
		
		Assert.assertEquals(str1, "Hell", "Message for indication method = testHardAssert()");
		
		boolean chekedValue = true;
		Assert.assertTrue(chekedValue, "Cheking boolean");
		
		boolean chekedValue2 = false;
		Assert.assertFalse(chekedValue2, "asserFalse example");
		

	}
	@Test
	public void testSoftAssert() {
		SoftAssert softAssert = new SoftAssert();
		

		//1
		String str2 = "hell";
		
		softAssert.assertEquals(str2, "Hello", "Message for indication method = testSoftAssert()");
		//2
		boolean chekedValue =true;
		softAssert.assertTrue(chekedValue, "Cheking boolean");

		//3 
		boolean chekedValueFalse = false;
		softAssert.assertFalse(chekedValueFalse, "assertFalse example");
		
		softAssert.assertFalse(5>3, "5>3 example");
	
		//get the result
		softAssert.assertAll();
	
	}
	
	
	

}
