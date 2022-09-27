package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	// new
	// Important: Use of linkText as locator
	// source: at the bottom of the page, first element from Sell column is 'Start Selling'
	// This text is connected to a link
	@Test (enabled = true)
	public void startSellingTest01() throws InterruptedException {
		driver.findElement(By.linkText("Start selling")).click(); 
		Thread.sleep(5000); //
	}
	
	// new
	// Important: Use of partialLinkText as locator
	// source: at the bottom of the page, first element from Sell column is 'Start Selling'
	// This partial text also can be used as a locator for connected to a link
	@Test (enabled = true)
	public void startSellingTest02() throws InterruptedException {
		driver.findElement(By.partialLinkText("Start s")).click();    // Learn from here , use of class attribute
		Thread.sleep(5000);
	}
	
	// new
	// Important: Use of cssSelector as locator
	// if the class contain separate words [gh-tb ui-autocomplete-input], they are actually different class, then
	// we have to close the gap between classes by putting dot/period between them
	// cssSelector by class --> htmltag.class name value 
	// remove the space between words in class value, and replace with dot or period
	@Test(enabled = true)
	public void searchFieldTest() {
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).click();
	}
	
	
}
