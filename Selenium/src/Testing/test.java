package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/BharathG/Downloads/chromedriver");
WebDriver driver = new ChromeDriver();
driver.get("https://www.hotwire.com/");
//driver.get("https://www.amazon.com/");
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");

//driver.findElement(By.id("nav-search-submit-text")).click();

//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");

//REGULAR XPATH syntax is driver.findElement(By.xpath("copy paste xpath location from inspect element");

//To Find duplicate attributes for xpath like id or class, we can do it console for class 
//as $x("paste xpath location or //input[@class='class name']"); and for css selector as remove 'x'after $.

//REGULAR CSS SELECTOR syntax is driver.findElement(By.cssSelector("copy paste css selector location from inspect element");
//CUSTOM CSS SELECTOR syntax is driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']");

//REGULAR XPATH syntax is driver.findElement(By.xpath("copy paste xpath location from inspect element");
//CUSTOM XPATH syntax is driver.findElement(By.xpath("//input[@class='class_name']");

//driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']").sendKeys("hello");
driver.findElement(By.xpath("//div[@class='farefinder-option active']"));

driver.findElement(By.xpath("//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']")).sendKeys("car");
driver.findElement(By.xpath("//div[@class=\"form-group floating-label not-empty has-icon has-feedback\"]")).click();

driver.findElement(By.xpath("//button[@class=\"navbar-toggle collapsed\"]")).submit();

	
	}

}
