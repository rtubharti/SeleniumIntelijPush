package com.POMTestMain.OrangeHRM;

import com.PageClass.OrangeHRM.AddEmpFeature;
import com.PageClass.OrangeHRM.LoginFeature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest
{

    public static void main(String[]args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(4000);

        LoginFeature log = new LoginFeature(driver);

        log.enterUsername();
        log.enterPassword();
        log.clickSubmit();

        Thread.sleep(4000);

        AddEmpFeature addemp = new AddEmpFeature(driver);

        addemp.clickPIM();

        Thread.sleep(4000);
        addemp.addEmployee();

        Thread.sleep(4000);

        driver.quit();


    }

}
