package Package2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Cycle {
	
	
	@Test(dataProvider = "getCreds")
	public void BSA(String uname, String pwd)
	{
		System.out.println("this is BSA");
		System.out.println("The user name is as"+uname);
		System.out.println("The password is as"+pwd);
	}


@Test(groups={"smoke"})
public void Hercules()
{
	System.out.println("this is hercules");
	Assert.assertTrue(false);
	System.out.println("this is the update");
}


@DataProvider
public Object[][] getCreds()
{
	Object[][] obj= new Object[3][2];
	obj[0][0]="ahmad";
	obj[0][1]="ali";
	
	obj[1][0]="rabiya";
	obj[1][1]="nadeem";
	
	obj[2][0]="manaal";
	obj[2][1]="faatma";
	
	return obj;
			
	
}
}
