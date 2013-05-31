package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeTestTCAttachNoteScreens {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://107.21.243.158/mobile-builds/2.2/stable/latest/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSeTestTCAttachNoteScreens() throws Exception {
    // SETest-Attachments_Note_Screens
    // Version: 2.2
    // Desc: Confirms that the Attachments feature is functional from Note screens...
    // Required Entities: Note - Colonna, Krista / Sage
    // Condition(s): Test user is logged in.    
    // ==================================================================
    // Step: click Top-Left button to reveal Global Menu...
    driver.findElement(By.xpath(".//*[@id='Mobile_SalesLogix_Views_MainToolbar_0']/button[1]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath(".//*[@id='Mobile_SalesLogix_SpeedSearchWidget_0']/div/div[1]/input"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // Step: navigate to Notes/History list view...
    driver.findElement(By.xpath(".//*[@id='left_drawer']/descendant::*[text() = \"Notes/History\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath(".//*[@id='myactivity_list']/ul/li[1]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // Step: perform search for Notes/History item...
    driver.findElement(By.cssSelector("#Sage_Platform_Mobile_SearchWidget_27 > div.table-layout > div > input[name=\"query\"]")).clear();
    driver.findElement(By.cssSelector("#Sage_Platform_Mobile_SearchWidget_27 > div.table-layout > div > input[name=\"query\"]")).sendKeys("Proposal");
    driver.findElement(By.cssSelector("#Sage_Platform_Mobile_SearchWidget_27 > div.table-layout > div.hasButton > button.subHeaderButton.searchButton")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath(".//*[@id='history_list']/ul/li[1]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // Step: navigate to top Notes/History record...
    driver.findElement(By.cssSelector("span.p-description")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("E-mail".equals(driver.findElement(By.id("pageTitle")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // VP: confirm that Attachments is available under the Related Items section...
    try {
      assertTrue(isElementPresent(By.cssSelector("a > img.icon")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Attachments", driver.findElement(By.cssSelector("a > span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Step: click the Attachments link...
    driver.findElement(By.cssSelector("a > span")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("History Attachments".equals(driver.findElement(By.id("pageTitle")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // Step: click to open an Attachment item...
    // NOTE: Attachment click has been disabled due to a 404 Error...
    try {
      assertTrue(isElementPresent(By.xpath(".//*[@id='history_attachment_related']/ul/li")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Step: click the top Add buton...
    driver.findElement(By.xpath("//div[@id='Mobile_SalesLogix_Views_MainToolbar_0']/button[2]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Add Attachments".equals(driver.findElement(By.id("pageTitle")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // VP: confirm the elements of the Add Attachments screen...
    try {
      assertTrue(isElementPresent(By.cssSelector("input[type=\"file\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("button.button.inline")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='attachment_Add']/div[2]/div/button[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Step: navigate back screen...
    driver.findElement(By.xpath("//div[@id='Mobile_SalesLogix_Views_MainToolbar_0']/button[2]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("History Attachments".equals(driver.findElement(By.id("pageTitle")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='Mobile_SalesLogix_Views_MainToolbar_0']/button[3]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("E-mail".equals(driver.findElement(By.id("pageTitle")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='Mobile_SalesLogix_Views_MainToolbar_0']/button[3]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Notes/History".equals(driver.findElement(By.id("pageTitle")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='Mobile_SalesLogix_Views_MainToolbar_0']/button[3]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("My Activities".equals(driver.findElement(By.id("pageTitle")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // -- END
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alert.getText();
    } finally {
      acceptNextAlert = true;
    }
  }
}