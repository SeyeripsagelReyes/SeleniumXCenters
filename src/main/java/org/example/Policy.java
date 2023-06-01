package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class Policy {
    final static private WebDriver _driver = new ChromeDriver();
    final static private Actions action = new Actions(_driver);

    final static private WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(10));
    Policy(){
        _driver.get("http://3.17.237.109:8180/pc/PolicyCenter.do");
        driver("//*[@id=\"Login-LoginScreen-LoginDV-username\"]/div/input")
                .sendKeys("carkle");
        driver("//*[@id=\"Login-LoginScreen-LoginDV-password\"]/div[1]/input")
                .sendKeys("gw");
        driver("//*[@id=\"Login-LoginScreen-LoginDV-submit\"]/div")
                .click();

    }

    public void addPerson(HashMap<String,String> identity) throws InterruptedException {
        driver("//*[@id=\"TabBar-ContactTab\"]/div[3]")
                .click();
        action.moveToElement(driver("//*[@id=\"TabBar-ContactTab-NewContact\"]/div[1]"))
                .perform();
        driver("//*[@id=\"TabBar-ContactTab-NewContact-NewPerson\"]/div")
                .click();
        driver("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-ContactNameInputSet-GlobalPersonNameInputSet-FirstName\"]/div/input")
                .sendKeys(identity.get("First_Name"));
        driver("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-ContactNameInputSet-GlobalPersonNameInputSet-LastName\"]/div/input")
                .sendKeys(identity.get("Last_Name"));
        driver("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-ContactNameInputSet-DateOfBirth\"]/div/input")
                .sendKeys(identity.get("Birth_Date"));
        select("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-ContactNameInputSet-PrimaryPhone\"]/div/div/select")
                .selectByValue("home");
        driver("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-ContactNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber\"]/div/input")
                .sendKeys(identity.get("Phone"));
        textdriver("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-ContactNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber\"]/div/input")
                .sendKeys(identity.get("Phone"));
        _driver.findElement(By.name("NewContact-ContactPanelSet-ContactCV-ContactDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1"))
                        .sendKeys("1");
        textdriver("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City\"]/div[1]/input")
                .sendKeys(identity.get("City"));
        select("//*[@id=\"NewContact-ContactPanelSet-ContactCV-ContactDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State\"]/div/div/select")
                .selectByValue(identity.get("State"));
        System.out.println(identity.get("Address"));

    }

    public WebElement driver(String xPath){
        WebElement driver = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
        return driver;
    }

    public WebElement textdriver(String xPath) throws InterruptedException {
        Thread.sleep(2000);
        return driver(xPath);
    }

    public Select select(String xPath){
        return new Select(driver(xPath));
    }
}
