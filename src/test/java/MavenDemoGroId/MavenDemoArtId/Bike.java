package MavenDemoGroId.MavenDemoArtId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Bike {
	
	
	@BeforeTest
	@Test
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmada\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
	}
	
	
	@Test(dependsOnMethods= {"honda"})
	public void bullet()
	{
		System.out.println("this is bullet");
	}
	
	@Parameters({"BikeTestURL","BikeNO"})
	@BeforeMethod(timeOut=50)
	public void activa(String url, String no)
	{
		System.out.println("the first parameter is as: "+url);
		System.out.println("the second parameter is as: "+no);
	}
	
	@AfterMethod
	public void suzuki()
	{
		System.out.println("After every method in Bike class-suzuki ");
	}
	
	@Test(groups={"smoke"})
	public void yamaha()
	{
		System.out.println("this is yamaha");
	}
	
	@Test
	public void honda()
	{
		System.out.println("this is honda");
	}

}
