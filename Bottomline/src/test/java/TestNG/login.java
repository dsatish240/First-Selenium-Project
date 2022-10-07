package TestNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class login {
  	
    WebDriver driver;
    @Test(priority = 1)
    public void valid() {
  	  
  	  
  	     driver.findElement(By.className("register-btn")).click();
  		 driver.findElement(By.id("email")).sendKeys("dsatish240@gmail.com");
  		 driver.findElement(By.id("password")).sendKeys("9886529299");
  		
  		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
    
    }
    
    @Test
    public void invalid() {
    	  
    	  
 	     driver.findElement(By.className("register-btn")).click();
 		 driver.findElement(By.id("email")).sendKeys("dsatish2403@gmail.com");
 		 driver.findElement(By.id("password")).sendKeys("9886529299");
 		
 		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
   
   }
    
    
    @Test
    public void VerifyHomePageTitle() {
  	  
  	  
  	      String ExpectedTitle = "Rahul Shetty Academy";
  	      
  	      String ActualTitle = driver.getTitle();
  	      
  	      try {
  	    	  
  	    	  org.testng.Assert.assertEquals(ActualTitle, ExpectedTitle);
  	    	  
  	    	  System.out.println("test case passed");
  			
  		} catch (Exception e) {
  			
  			System.out.println("test case failed");
  			
  		}
    
    }
    
    
    
    
    @BeforeMethod
    public void beforeMethod() {
  	  
  	  System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
  		driver=new EdgeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.rahulshettyacademy.com/");
  	  
    }

    @AfterMethod
    public void afterMethod() {
  	  
  	  driver.close();
  	 
    }



}
