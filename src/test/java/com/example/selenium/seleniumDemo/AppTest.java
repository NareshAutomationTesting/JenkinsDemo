package com.example.selenium.seleniumDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
  @Test
  public void shouldAnswerWithTrue() throws InterruptedException {
	 App app = new App();
	 app.launchBrowser();
    assertTrue(true);
  }
}
