package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		// Setting webdriver.gecko.driver property
		System.setProperty("webdriver.gecko.driver",
				"C:\\hi-skillit\\HiSkillSelenium\\newLibrary\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select countryDropDown = new Select(dropDownElement);
		
		countryDropDown.selectByVisibleText("INDIA");
		//countryDropDown.selectByValue("68");
		//countryDropDown.selectByIndex(10);

	}

}
