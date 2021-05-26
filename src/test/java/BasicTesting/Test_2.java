package BasicTesting;

import org.testng.annotations.*;

public class Test_2 {
	
	@BeforeTest
	public void preSetup() {
		System.out.println("I m in PreSet");
	}
	
	@Test
	public void currTest() {
		System.out.println("I m in CurrTest");
	}
	
	@AfterTest
	public void postTest() {
		System.out.println("I m in PostTest");
	}

}
