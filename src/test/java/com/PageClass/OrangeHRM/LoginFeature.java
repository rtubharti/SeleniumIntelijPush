package com.PageClass.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginFeature
{

    WebDriver driver;
    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By submit = By.xpath("//button[@type='submit']");

    public LoginFeature(WebDriver driver)
    {
        this.driver=driver;

    }

    public void enterUsername()
    {
      driver.findElement(username).sendKeys("Admin");

    }

    public void enterPassword()
    {
        driver.findElement(password).sendKeys("admin123");

    }

    public void clickSubmit()
    {
        driver.findElement(submit).click();


    }


}
