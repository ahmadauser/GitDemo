package MavenDemoGroId.MavenDemoArtId;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Car {
	
	@Test
	public void brezza()
	{
		System.out.println("this is brezza");
	}
	
	@Test
	public void swift()
	{
		System.out.println("this is swift");
	}
	
	@BeforeClass
	public void jeep()
	{
		System.out.println("Before class Car->this is jeep");
	}
	
	@AfterClass
	public void fortuner()
	{
		System.out.println("After class Car->this is fortuner");
	}
	
	@Test
	public void kia()
	{
		System.out.println("this is kia");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void innova()
	{
		System.out.println("Before Test->This is innova");
	}

}
