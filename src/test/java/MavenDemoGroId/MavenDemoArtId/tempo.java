package MavenDemoGroId.MavenDemoArtId;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class tempo {
	
	@AfterSuite
	public void haathgaadi()
	{
		System.out.println("After suite->this is haathgaadi");
	}
	
	@Test
	public void Tempovikram()
	{
		System.out.println("this is vikram");
	}
	
	@Test(groups={"smoke"})
	public void Tempotirri()
	{
		System.out.println("this is tirri");
	}
	
	@BeforeSuite
	public void handpulled()
	{
		System.out.println("Before suite->hand pulled rickshaw");
	}
	
	@Test
	public void Rickshaw()
	{
		System.out.println("this is rickshaw");
		Assert.assertTrue(false);
	}

}
