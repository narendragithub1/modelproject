package mypackage;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Magnitia {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
           WebDriverManager.chromedriver().setup();
          // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Downloads\\Driver\\chromedriver.exe");
           ChromeOptions options = new ChromeOptions();
   		Map<String, Object> prefs = new HashMap<String, Object>();
   		prefs.put("plugins.always_open_pdf_externally", true);
   		options.setExperimentalOption("prefs", prefs);
     	RemoteWebDriver driver = new ChromeDriver(options);
         //   ChromeDriver driver=new ChromeDriver();
          //  WebDriverManager.firefoxdriver().setup();
           
            driver.get("https://www.magnitia.com");
            driver.manage().window().maximize();
    		Thread.sleep(5000);
    		//driver.findElement(By.xpath("//a[text()='Course Content']")).click();
    		Thread.sleep(5000);
    	
    		driver.findElement(By.xpath("//i[@class='fa fa-window-close']")).click();
    		Thread.sleep(5000);
    		try
    		{
    		driver.findElement(By.xpath("//small[text()='ESC']")).click();
    		Thread.sleep(5000);
    		}
    		catch(Exception e1)
    		{
    			
    		}
         	driver.findElement(By.xpath("(//a[@class='nav-link'])[4]")).click();
    		Thread.sleep(5000);
    		
    		driver.navigate().back();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//i[@class='fa fa-window-close']")).click();
    		Thread.sleep(6000);
    		try
    		{
    		driver.findElement(By.xpath("//small[text()='ESC']")).click();
    		Thread.sleep(5000);
    		}
    		catch(Exception e1)
    		{
    			
    		}
    		
    		/*driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
    		Thread.sleep(5000);
    		
    		driver.findElement(By.xpath("(//small[text()='ESC'])[2]")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("(//small[text()='ESC'])[1]")).click();
    		Thread.sleep(5000);
    		
    		
    		driver.findElement(By.xpath("(//a[text()='UPCOMING BATCHES'])")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//a[text()='Online Training']")).click();
    		Thread.sleep(5000);
    	/*	driver.findElement(By.xpath("//li[@class='wtapp']")).click();
    		Thread.sleep(5000);
    		Set<String> s=driver.getWindowHandles();
    		ArrayList<String> l=new ArrayList<String>(s);
    		driver.switchTo().window(l.get(1));
    		Thread.sleep(5000);
    		driver.close();
    		driver.switchTo().window(l.get(0));
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//a[text()=' Contact Us ']")).click();
    		Thread.sleep(5000);
    		try
    		{
    		driver.findElement(By.xpath("//small[text()='ESC']")).click();
    		Thread.sleep(5000);
    		}
    		catch(Exception e1)
    		{
    			
    		}*/
    		driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("(//small[text()='ESC'])[2]")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("(//small[text()='ESC'])[1]")).click();
    		Thread.sleep(5000);
    		
    		driver.findElement(By.xpath("//a[text()='What is Selenium training?']")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//a[text()='Course Content']")).click();
    		Thread.sleep(5000);
    		Set<String> s1=driver.getWindowHandles();
    		 List<String> l2=new ArrayList(s1);   
              driver.switchTo().window(l2.get(1));
             Thread.sleep(5000);
             System.out.println(l2.size());
    		driver.findElement(By.xpath("//pdf-viewer[@id='viewer']")).getShadowRoot().
    		        findElement(By.xpath("//viewer-toolbar[@id='toolbar']")).getShadowRoot().
    		        findElement(By.xpath("//viewer-download-controls[@id='downloads']")).getShadowRoot().
    		        findElement(By.xpath("//cr-icon-button[@aria-label='Download']")).getShadowRoot().
    		        findElement(By.tagName("iron-icon")).click();
    		  
    		
    		
	}

}
