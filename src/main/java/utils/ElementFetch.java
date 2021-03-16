package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFetch {
	public static WebDriver driver;
	
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch(identifierType) {
		case "ID":
			return driver.findElement(By.id(identifierValue));
		case "CSS":
			return driver.findElement(By.cssSelector(identifierValue));
		case "TAGNAME":
			return driver.findElement(By.tagName(identifierValue));
		case "XPATH":
			return driver.findElement(By.xpath(identifierValue));
			default:
				return null;
		}
		
	}
	
	public List<WebElement> getWebElements(String identifierType, String identifierValue) {
		switch(identifierType) {
		case "ID":
			return driver.findElements(By.id(identifierValue));
		case "CSS":
			return driver.findElements(By.cssSelector(identifierValue));
		case "TAGNAME":
			return driver.findElements(By.tagName(identifierValue));
		case "XPATH":
			return driver.findElements(By.xpath(identifierValue));
			default:
				return null;
		}
		
	}
	
}
