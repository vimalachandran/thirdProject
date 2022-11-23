package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launching {

	public static void main(String[] args) {
		// 1.Set the driver name and driver location

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-6 PM\\Selenium_Programs\\Driver\\chromedriver.exe");
        // 2.Browser launch
		
		WebDriver driver = new ChromeDriver();    //upcasting
		
		//3.url Launch
		
		driver.get("");
		
		
		
	}

}
