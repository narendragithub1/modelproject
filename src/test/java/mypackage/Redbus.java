package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver(); 
				driver.get("https://www.redbus.in");
				Thread.sleep(5000);
				String x=driver.getCurrentUrl();
				if(x.startsWith("https"))
				{
					System.out.println("site is secured");
				}
				else
				{
					System.out.println("site is not secured");
				}
				driver.manage().window().maximize();
				driver.findElement(By.id("signin-block")).click();
		 		driver.findElement(By.id("signInLink")).click();
		 		Thread.sleep(5000);
		 		WebElement e=driver.findElement(By.xpath("//div[@class='modalFrame']/descendant::iframe"));
		 		driver.switchTo().frame(e);
		 		//driver.findElement(By.id("mobileNoInp")).sendKeys("9000323682",Keys.TAB); 		
		 		
		 	//	driver.findElement(By.xpath("//span[text()='GENERATE OTP']")).click();
		 		WebElement e1=driver.findElement(By.xpath("//div[@class='customGPlusSignIn']/descendant::iframe"));
		 		driver.switchTo().frame(e1);
		 		String x1= driver.getCurrentUrl();
		        System.out.println(x1);
		    	Thread.sleep(5000);
		 		driver.findElement(By.xpath("(//span[text()='Sign in with Google'])[1]")).click();
		 		
		 	     driver.switchTo().defaultContent();
		 		  Set<String> s=driver.getWindowHandles();
		          List<String> l1=new ArrayList(s);
		          System.out.println(l1.size());
		          driver.switchTo().window(l1.get(0));
		          String x3= driver.getCurrentUrl();
		          System.out.println(x3);
		           driver.switchTo().window(l1.get(1));
		          Thread.sleep(5000);
		          String x4= driver.getCurrentUrl();
		          System.out.println(x4);
		 	 	driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("narendrakumarste024@gmail.com");
		 	 	 Thread.sleep(5000);
		 	 	driver.findElement(By.xpath("//span[text()='Next']")) .click(); 
		 	 	Thread.sleep(5000);
		 	 	driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("balabobby");
		 	 	 Thread.sleep(5000);
		 	 	driver.findElement(By.xpath("//span[text()='Next']")) .click(); 
		 	 	 Thread.sleep(5000);
		 	 	driver.switchTo().window(l1.get(0));
		 	 	String x8= driver.getCurrentUrl();
		        System.out.println(x8);
		        Thread.sleep(5000);
		        System.out.println("enter departer ");
		     driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Guntur (Andhra Pradesh)"); 
		     Thread.sleep(5000);
		     driver.findElement(By.xpath("//li[text()='RTC Bus Stand, Guntur (Andhra Pradesh)']//child::i")).click();;
		    
		        driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Hyderabad");
		        System.out.println("eter destination");
		        Thread.sleep(5000);
		 	 	driver.findElement(By.xpath("//label[text()='Date']")) .click(); 
		 	 	Thread.sleep(5000);
		 	 	driver.findElement(By.xpath("//td[@class='current day']")) .click();
		 	 	Thread.sleep(5000);
		 	 	driver.findElement(By.xpath("//button[text()='Search Buses']")) .click(); 
		 	 	Thread.sleep(5000);
		 	 	try
		 	 	{
		 	 		driver.findElement(By.xpath("//span[text()='Ok, got it']")) .click();
		 	 	}
		 	 	catch(Exception ex)
		 	 	{
		 	 		
		 	 	}
		 	 	driver.findElement(By.xpath("(//div[text()='View Seats'])[1]")) .click(); 
		 	 	Thread.sleep(5000);
		 	 	
		        
		         driver.findElement(By.id("sign-in-icon-down")).click();
		 	 	Thread.sleep(5000);
				 driver.findElement(By.xpath("//li[text()='Sign Out']")).click();
	}

}
