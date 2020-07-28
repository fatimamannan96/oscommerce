package com.hustlershack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OSHomePage {

	WebDriver driver;
	
	public OSHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Hardware->")
	WebElement linkText;
	
	public void clickhardware() {
		linkText.click();
	}
	
	@FindBy(xpath="//span[@class[")
	
	
	
	
}
