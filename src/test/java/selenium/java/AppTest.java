package selenium.java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


    public void testApp(){
    	
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys("96241997");
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys("249510076");
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys("3294");
	    driver.findElement(By.id("entrar")).click();
	    driver.close();
    }
}
