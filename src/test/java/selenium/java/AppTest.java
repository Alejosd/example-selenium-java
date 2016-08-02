package selenium.java;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


    public void testApp(){
    	
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 5");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new ChromeDriver(capabilities);

        driver.get("http://www.google.com");
        
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Guns And Roses");

        element.submit();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    	
        assertTrue( true );
    }
}
