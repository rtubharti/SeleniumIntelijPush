package com.PageClass.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmpFeature
{

    WebDriver driver;

    By PIM = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
    By addEmpl = By.xpath("//a[text()='Add Employee']");

    public AddEmpFeature(WebDriver driver)
    {
        this.driver=driver;

    }

    public void clickPIM()
    {
        driver.findElement(PIM).click();

    }

    public void addEmployee()
    {
        driver.findElement(addEmpl).click();

    }

}
