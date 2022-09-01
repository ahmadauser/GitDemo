package MavenDemoGroId.MavenDemoArtId;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RacingBikes {
	
	@Test(groups={"smoke"})
	public void FZ()
	{
		System.out.println("This is FZ");
	}
	
	@AfterTest
	public void Ninja()
	{
		System.out.println("Afer Test->This is Ninja");
	}

}
