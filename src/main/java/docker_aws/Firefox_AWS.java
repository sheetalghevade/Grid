package docker_aws;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Firefox_AWS {
	
	@Test
	public static void test1() throws Exception {
		
		DesiredCapabilities co = new DesiredCapabilities();
		co.setBrowserName("firefox");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://54.153.97.192:4444"), co);
		driver.get("https://www.xe.com/");
			Thread.sleep(4000);
		driver.quit();		
	}

	@Test
	public static void test2() throws Exception {
		
		System.out.println("Test2 on Firefox");
		DesiredCapabilities co = new DesiredCapabilities();
		co.setBrowserName("firefox");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://54.153.97.192:4444"), co);
		driver.get("https://www.google.com/");
			Thread.sleep(4000);
		driver.quit();	
	}
	
	@Test

	public static void test3() throws Exception {
		System.out.println("Test3 on firefox");
		DesiredCapabilities co = new DesiredCapabilities();
		co.setBrowserName("firefox");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://54.153.97.192:4444"), co);
		driver.get("https://www.youtube.com/");
			Thread.sleep(4000);
		driver.quit();	
	}
	
	
	@Test
	public static void test4() throws Exception {
		System.out.println("Test4 for firefox");
		DesiredCapabilities co = new DesiredCapabilities();
		co.setBrowserName("firefox");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://54.153.97.192:4444"), co);
		driver.get("https://www.youtube.com/");
			Thread.sleep(4000);
		driver.quit();	
	}
	


}


