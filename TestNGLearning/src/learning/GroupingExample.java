package learning;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups={"Apple"})
	public void apple1() {
		System.out.println("Apple Phone testing");
		
	}
	
	@Test(groups={"Apple"})
	public void apple2() {
		System.out.println("Apple Phone testing");
		
	}
	
	@Test(groups={"Google"})
	public void nexus1() {
		System.out.println("Google Phone testing");
		
	}
	
	@Test(groups={"Google"})
	public void nexus2() {
		System.out.println("Google Phone testing");
		
	}
	
	@Test(groups={"Moto"})
	public void moto1() {
		System.out.println("Motorola Phone testing");
		
	}
	
	@Test(groups={"Moto"})
	public void moto2() {
		System.out.println("Motorola Phone testing");
		
	}
	
	@Test(groups={"Samsung"})
	public void samsung1() {
		System.out.println("Samsung Phone Testing");
		
	}
	
	@Test(groups={"Samsung"})
	public void samsung2() {
		System.out.println("Samsung Phone Testing");
		
	}

}
