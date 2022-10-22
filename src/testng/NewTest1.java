package testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest1 {
	
	WebDriver driver;
	
  @Test
  public void searchItem() {
	     WebElement searchText = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	  
	  searchText.sendKeys("mobiles Under 30000");
	  
	  WebElement searchButton = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	  searchButton.click();
	  
	  }
  @BeforeClass
  public void launchUrl() {

	  WebDriverManager.chromedriver().setup();
	  
	  driver = (WebDriver) new ChromeDriver();
	 
	  driver.get("https://www.amazon.in/");
	 
	  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
