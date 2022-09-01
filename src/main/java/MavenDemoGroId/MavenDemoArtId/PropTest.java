package MavenDemoGroId.MavenDemoArtId;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {
	public static void main(String[] args) throws IOException {
		
	
	FileInputStream fis=new FileInputStream("C:\\Users\\ahmada\\eclipse-workspace\\MavenDemoArtId\\TestProperty.properties");
	Properties prop=new Properties();
	prop.load(fis);
	
	System.out.println(prop.getProperty("Browser"));
	System.out.println(prop.getProperty("URL"));
	
	prop.setProperty("URL", "manaal.com");
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\ahmada\\eclipse-workspace\\MavenDemoArtId\\TestProperty.properties");
	prop.store(fos, null);
	
	System.out.println(prop.getProperty("URL"));
	}
}
