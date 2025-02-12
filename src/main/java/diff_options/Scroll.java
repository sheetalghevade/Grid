package diff_options;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://practice.expandtesting.com/dropdown");
		
		Thread.sleep(3000);
		 WebElement drpdown = driver.findElement(By.id("dropdown"));
		
//		Using JAVASCRIPT: Use any of the below js to scroll the page
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", drpdown); // scroll till the element
		 
//		 js.executeScript("window.scrollBy(0, 500);");  // Scroll down 500 pixels
//		 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");  //Scroll to the bottom of the page
		 
		 Thread.sleep(3000);
		 
		 Select sel = new Select(drpdown);
		 sel.selectByVisibleText("Option 1");
		 
//		Using Action class
		 
		 Actions actions = new Actions(driver);

		// Scroll down
		 
		actions.scrollByAmount(0, 500).perform();
		
		
		
		
		driver.close();

	}

}
