package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.example.ClaimElement;

public class Claim {

    Claim(){
        _driver.get("http://3.17.237.109:8080/cc/ClaimCenter.do");
        driver(ClaimElement.USERNAME_TEXT).sendKeys("bhunter");
        driver(ClaimElement.PASSWORD_TEXT).sendKeys("gw");
        driver(ClaimElement.LOGIN_BUTTON).click();
    }

    final static private WebDriver _driver = new ChromeDriver();
    public void assignClaim(){
        driver(ClaimElement.Tab.SEARCH_BUTTON).click();
        select(ClaimElement.Search.FOR_SELECT).selectByValue("claimant");
        driver(ClaimElement.Search.FNAME_TEXT).sendKeys("a");
        driver(ClaimElement.Search.SEARCH_BUTTON).click();
        driver(ClaimElement.Search.RESULT_CHECK).click();
        driver(ClaimElement.Search.ASSIGN_BUTTON).click();
        select(ClaimElement.Assign.FROM_LIST).selectByValue("Thomas Sanders (Auto1 - TeamC)");
    }

    public void createClaim() throws InterruptedException {
        driver(ClaimElement.Tab.CLAIM_BUTTON).click();
        driver(ClaimElement.Tab.FNOL_BUTTON).click();
        driver(ClaimElement.FNOL.ORGANIZATION_TEXT).sendKeys("Wright");
        driver(ClaimElement.FNOL.SEARCH_BUTTON).click();
        driver(ClaimElement.FNOL.RESULT_CHECK).click();
        driver(ClaimElement.FNOL.LOSS_DATE).sendKeys("04/15/2023");
        driver(ClaimElement.FNOL.NEXT_BUTTON).click();
        driver(ClaimElement.FNOL.NAME_BUTTON).click();
        driver(ClaimElement.FNOL.NEWPERSON_BUTTON).click();
        driver(ClaimElement.CONTACT.LNAME_TEXT).sendKeys("White");
        driver(ClaimElement.CONTACT.UPDATE_BUTTON).click();
        select(ClaimElement.FNOL.REPORTED_SELECT).selectByIndex(1);
        select(ClaimElement.FNOL.CLAIMANT_SELECT).selectByIndex(1);
        driver(ClaimElement.FNOL.NEXT_BUTTON).click();
        driver(ClaimElement.FNOL.REPORTED_DATE).sendKeys("04/21/2023");
        driver(ClaimElement.FNOL.TIMELOSS_RADIO).click();
        select(ClaimElement.FNOL.ADDRESS_SELECT).selectByIndex(1);
        driver(ClaimElement.FNOL.DEATH_RADIO).click();
        select(ClaimElement.FNOL.INJURY_SELECT).selectByIndex(1);
        driver(ClaimElement.FNOL.MEDICAL_RADIO).click();
        driver(ClaimElement.FNOL.FINISH_BUTTON).click();

    }

    public void editClaim(){
        driver(ClaimElement.Tab.CLAIM_BUTTON).click();
        driver(ClaimElement.Tab.FINDCLAIM_TEXT).sendKeys("00000001001");
        driver(ClaimElement.Tab.FINDCLAIM_BUTTON).click();
        driver(ClaimElement.Menu.LOSS_DETAILS).click();
        driver(ClaimElement.LossDetails.EDIT_BUTTON).click();
        driver(ClaimElement.LossDetails.DESCRIPTION_TEXT).clear();
        driver(ClaimElement.LossDetails.DESCRIPTION_TEXT).sendKeys("EDITED2");
        driver(ClaimElement.LossDetails.UPDATE_BUTTON).click();
    }

    public WebElement driver(String xPath){
        _driver.manage()
                .timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
        return new WebDriverWait(_driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
    }

    public Select select(String xPath){
        return new Select(driver(xPath));
    }

}
