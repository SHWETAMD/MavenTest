package Testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testng {
  @Test
  public void Verify_about_us() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("headless","no-sandbox");
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("http://www.edureka.co");
		driver.get("http://192.168.92.103:9943/index.php");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElementByLinkText("About Us").click();
		//String Input = "about";
		String text = driver.findElementById("PID-ab2-pg").getText();
		//System.out.println(text);
		assertEquals(text,"This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		System.out.println("Test Passed");
		//assertTrue("Passed",Input.equals(text))
		
      driver.close();

  }
}
