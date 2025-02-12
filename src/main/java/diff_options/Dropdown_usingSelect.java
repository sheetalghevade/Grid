package diff_options;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_usingSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://practice.expandtesting.com/dropdown");
		Thread.sleep(3000);
		 WebElement drpdown = driver.findElement(By.id("dropdown"));
		
//		 Use any of the below js to scroll the page
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", drpdown); // scroll till the element
		 
	 
		 Thread.sleep(3000);
		 
		 Select sel = new Select(drpdown);
		 sel.selectByVisibleText("Option 2");
		 
		 Thread.sleep(3000);
		 sel.selectByValue("1");
		 
//		 sel.selectByIndex(2);
		
		 System.out.println("Done");
		 
		System.out.println("Printing selected option: " +sel.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
