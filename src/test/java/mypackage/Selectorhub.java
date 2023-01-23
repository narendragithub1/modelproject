package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectorhub {

	public static void main(String[] args) throws Exception 
	{
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);/*	driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Narendra");
		driver.findElement(By.name("Password")).sendKeys("Password");
		driver.findElement(By.name("company")).sendKeys("xyz");
		driver.findElement(By.name("mobile number")).sendKeys("9000");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Crush']")).sendKeys("xyz");
		driver.findElement(By.xpath("(//*[name()='svg'])[10]")).click();
		System.out.println(" check box elment clicked");
		driver.findElement(By.xpath("//button[text()='Checkout here']")).click();
		driver.findElement(By.xpath("//a[text()='Join Training']")).click();
		Thread.sleep(5000);
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		//driver.findElement(By.linkText("https://i.ytimg.com/vi/Ts4pht39oQI/sddefault.jpg")).click();
		//driver.findElement(By.xpath("//iframe[@id='widget2']")).click();
		driver.close();
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.findElement(By.name("cars")).click();
		driver.findElement(By.xpath("//option[text()='Audi']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='First Enter name']")).sendKeys("narendra");
	//	driver.findElement(By.xpath("//input[@placeholder='Enter Last name']")).sendKeys("kumar");
		driver.findElement(By.id("datepicker")).clear();
		driver.findElement(By.id("datepicker")).sendKeys("Enter Today Date");
		driver.findElement(By.name("the_date")).click();
		driver.findElement(By.xpath("//a[text()='Garry.White']")).click();
		Set<String> s3=driver.getWindowHandles();
		ArrayList<String> l3=new ArrayList<String>(s3);
		driver.switchTo().window(l3.get(1));
		Thread.sleep(6000);
		driver.close();
		driver.switchTo().window(l3.get(0));
	   List< WebElement> l1=driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		System.out.println("total no of rows in table 1 are "+l1.size());
		for(int i=1;i<=l1.size();i++) 
		{
			driver.findElement(By.xpath("(//table)[1]/tbody/tr["+i+"]/td[2]")).click();
			//System.out.println("new window opened for "+i+" row");
			try
			{
			Set<String> s1=driver.getWindowHandles();
			ArrayList<String> l2=new ArrayList<String>(s1);
			driver.switchTo().window(l2.get(1));
			Thread.sleep(5000);
			driver.close();
			driver.switchTo().window(l.get(0));
			System.out.println("new window opened for "+i+" row");
			}
			catch(Exception e1)
			{
				
			}
			System.out.println(" checked for "+i+ "row ");
			Thread.sleep(5000);
			
		}
		
		System.out.println("all row completed");
	driver.findElement(By.xpath("//iframe[@src='https://selectorshub.com/input-box/']"));
		driver.findElement(By.xpath("//input[@placeholder='Current Crush Name']")).sendKeys("abcd");;
		//driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		/*driver.findElement(By.xpath("//div[@id='userName']")).getShadowRoot().
               findElement(By.xpath("//a[@class='learningHub']")).click();
		driver.findElement(By.xpath("//div[@id='snacktime']")).getShadowRoot().
        findElement(By.xpath("//a[text()='Testers Food']")).click();*/
		driver.findElement(By.xpath("//select[@name='tablepress-1_length']")).click();
		driver.findElement(By.xpath("//option[text()='100']")).click();
		List< WebElement> l2=driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		System.out.println("total no of rows in table 2 are "+l2.size());
		int count=1;
		for(int i=1;i<l2.size();i++) 
		{
		String name=driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[5]")).getText();
		System.out.println(name);
			if(name.equalsIgnoreCase("india"))
			{
				String name1=driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[2]")).getText();
				if(name1.equalsIgnoreCase("windows"))
				driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).click();
			    count++;
			}
			
			
			//System.out.println("new window opened for "+i+" row");
			
			System.out.println(" checked for "+i+ "row ");
			Thread.sleep(5000);
			
		}
		System.out.println(" total no  of india= "+count);
		System.out.println(" total no  of india= "+count);
	}

}
