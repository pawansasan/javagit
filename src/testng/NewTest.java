package testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
 
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

}



