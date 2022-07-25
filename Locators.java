package com.seleniumlocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Locators {
 public static void main(String[] args) throws Exception {
		 
	WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
			 driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
			   Thread.sleep(3000);
			      driver.findElement(By.id("firstName")).sendKeys("Duvuru");
			        Thread.sleep(3000);
			           driver.findElement(By.name("lName")).sendKeys("Sai Mahesh");
			            Thread.sleep(3000);
			              driver.findElement(By.id("englishchbx")).click();
			               Thread.sleep(3000);
          		          driver.findElement(By.id("hindichbx")).click();
			              Thread.sleep(3000);
			            driver.findElement(By.name("email")).sendKeys("maheshmiller10@gmail.com");
			           Thread.sleep(3000);
			         driver.findElement(By.name("psw")).sendKeys("maheshmahe");
			       Thread.sleep(3000);			                   
			     driver.findElement(By.id("registerbtn")).click();
			    Thread.sleep(3000);
			   driver.findElement(By.xpath("//button[@onclick='clearFeilds()']")).click();
	          Thread.sleep(3000);
		    driver.findElement(By.partialLinkText("Click here to navigate ")).click();
	       Thread.sleep(3000);			                      
	     driver.quit();
			                       
	   System.out.println("Code Sucessfully Executed");
			                    
		}

	}



