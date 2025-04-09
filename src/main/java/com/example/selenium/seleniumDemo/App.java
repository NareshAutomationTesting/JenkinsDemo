package com.example.selenium.seleniumDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
  public void launchBrowser() throws InterruptedException {
    System.out.println("Hello World!");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    System.out.println("Title: " + driver.getTitle());
    Thread.sleep(3000);
    driver.quit();
  }
}
