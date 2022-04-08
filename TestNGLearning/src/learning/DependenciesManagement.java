package learning;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	@Test(enabled=true)
	public void HighSchool() {
		System.out.println("High School Completed");
		
	}
	
	@Test(dependsOnMethods="HighSchool")
	public void HigherSecondary() {
		System.out.println("High Secondary or Junior College Completed");
		
	}
	
	@Test(dependsOnMethods="HigherSecondary")
	public void engineering() {
		System.out.println("Engineer College admitted");
		
	}

}
