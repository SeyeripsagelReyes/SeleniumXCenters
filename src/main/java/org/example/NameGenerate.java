package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class NameGenerate {
    final static private WebDriver _driver = new ChromeDriver();
    private HashMap identity = new HashMap<String,String>();

    NameGenerate(){
        _driver.get("https://www.fakenamegenerator.com/");

    }

    public HashMap<String,String> getIdentity () throws ParseException {
        identity.put("First_Name",
                splitString("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/h3")[0]);
        identity.put("Last_Name",
                splitString("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/h3")[2]);
        identity.put("Phone",
                driver("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[4]/dd")
                        .getAttribute("innerHTML"));
        identity.put("Mail",
                splitString("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[9]/dd")[0]);
        address("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/div");
        identity.put("Birth_Date",formatDate("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[6]/dd"));
        _driver.close();
        return identity;
    }

    public String[] splitString(String xPath){
        String[] splitString = driver(xPath).getAttribute("innerHTML").split("\\s+");
        return splitString;
    }

    public WebElement driver(String xPath){
        _driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement driver = new WebDriverWait(_driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
        return driver;
    }

    public void address(String xPath){
        String address = driver(xPath).getText();
        String[] splitAddress = address.split("\\r?\\n");
        identity.put("Address",splitAddress[0]);
        splitAddress = splitAddress[1].split(", ");
        identity.put("City",splitAddress[0]);
        splitAddress = splitAddress[1].split(" ");
        identity.put("State",splitAddress[0]);
        identity.put("ZIP",splitAddress[1]);
    }

    public String formatDate(String xPath) throws ParseException {
        String date = driver(xPath).getText();
        DateFormat inputDateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        DateFormat outputDateFormat = new SimpleDateFormat("MM/dd/yyy");
        return outputDateFormat.format(inputDateFormat.parse(date));
    }
}
