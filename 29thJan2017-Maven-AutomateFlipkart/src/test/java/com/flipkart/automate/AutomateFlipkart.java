package com.flipkart.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateFlipkart {

	@Test
	public void flipkart() {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.13.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("//form/div/input[@class='_2zrpKA']")).sendKeys("chaudharysajal93@gmail.com");
		
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("._2AkmmA._1LctnI._7UHT_c")).click();
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.findElement(By.cssSelector("._1AHrFc._2k0gmP")).getText(),"My Account", "User is not logged in yet");
		driver.findElement(By.className("LM6RPg")).sendKeys("Nexus 6P");
		driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();
        try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//div/div[3]/div[1]/div[1]/div[1]/div/a[2]")).click();
		
		Assert.assertEquals(driver.findElement(By.className("_3eAQiD")).getText(),"Nexus 6P Special Edition (Gold, 64 GB)","heading did not match");
       try {
			Thread.sleep(10*1000);
			
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
     	}
       driver.findElement(By.xpath("//div/div[3]/div/div[1]/div[2]/div/div[2]/div[1])")).click();
       driver.findElement(By.id("pincodeInputId")).sendKeys("411057" + Keys.TAB);
       try {
		Thread.sleep(5*1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       driver.findElement(By.xpath("//div/div[1]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[1]/span")).click();
//		driver.findElement(By.xpath("//span[@data-reactid='134']")).click();
//        driver.findElement(By.id("email")).sendKeys("chaudharysajal93@gmail.com");
//        driver.findElement(By.className(".btn.btn-large.btn-blue.tmargin5.ng-scope")).click();
	}

}
