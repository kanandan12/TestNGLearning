package learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	String name = "Harry";
	
	@Test
	public void checkEqual() {
		/*
		 * if(name.equals("Harry")) { System.out.println("Name is equal"); } else {
		 * System.out.println("Name is not equal"); }
		 */
		
		Assert.assertEquals(name, "Harry");
		
		
		
	}
	

}
