package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	// Important: Use of linkText as locator
	// source: at the bottom of the page, first element from Sell column is 'Start Selling'
	// This text is connected to a link
	@Test (enabled = false)
	public void startSellingTest01() throws InterruptedException {
		driver.findElement(By.linkText("Start selling")).click(); 
		Thread.sleep(5000);
	}

	// Important: Use of partialLinkText as locator
	// source: at the bottom of the page, first element from Sell column is 'Start Selling'
	// This partial text also can be used as a locator for connected to a link
	@Test (enabled = false)
	public void startSellingTest02() throws InterruptedException {
		driver.findElement(By.partialLinkText("Start s")).click();    // Learn from here , use of class attribute
		Thread.sleep(5000);
	}
	
	// Important: Use of cssSelector as locator
	// if the class contain separate words [gh-tb ui-autocomplete-input], they are actually different class, then
	// we have to close the gap between classes by putting dot/period between them
	// cssSelector by class --> htmltag.class name value 
	// remove the space between words in class value, and replace with dot or period
	@Test(enabled = false)
	public void searchFieldTest() {
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).click();
	}
	
	// new
	// search field
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_submit_and_then_clear() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop");
		Thread.sleep(4000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T Shirt");
		Thread.sleep(4000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
				
	}
	
	// new
	// search field
	// enter_key = Enther button in your laptop/desktop
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_enter_key_and_then_clear () throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T Shirt", Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
				
	}
	
	// new
	
	// Re
	
	// drop down, all categories
	// drop down is a commonly asked interview question
	// here - using selectByIndex() method
	// This method is not suggested, or not used much
	// Because, adding a new web element or deleting a new one change the index number
	@Test(enabled=false)
	public void dropdown_selectByIndex_method () throws InterruptedException {
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select1 = new Select(dropElement);
		select1.selectByIndex(6);
		Thread.sleep(5000);		
	}
	
	// new
	// drop down, all categories
	// drop down is a commonly asked interview question
	// Most commonly use method in drop down --> selectByVisibleText()
	@Test(enabled=false)
	public void dropdown_selectByVisisbleText_method () throws InterruptedException {
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select2 = new Select(dropElement);
		select2.selectByVisibleText("DVDs & Movies");
		Thread.sleep(5000);		
	}
	
	// new
	// drop down, all categories
	// drop down is a commonly asked interview question
	// use method --> selectByValue()
	@Test(enabled=true)
	public void dropdown_selectByValue_method () throws InterruptedException {
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select3 = new Select(dropElement);
		select3.selectByValue("58058");		
		Thread.sleep(5000);		
	}
	
	
	
	
		
	
	
	
}
