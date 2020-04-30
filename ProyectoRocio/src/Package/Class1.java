package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class1 {
	public String baseUrl = "";
    public String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver;
  @Test
  public void test1() {
	  System.setProperty("webdriver.gecko.driver",driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);


  }
}
