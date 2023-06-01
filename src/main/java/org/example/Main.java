package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {




        System.out.println("Choose what to test\n"
            +"1) Assign a claim (Claim Center)\n"
            +"2) Add a person in policy (Policy Center)\n"
            +"3) Generate person");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                Claim claim = new Claim();
                claim.assignClaim();
                break;
            case 2:
                NameGenerate nameGenerate = new NameGenerate();
                HashMap identity = nameGenerate.getIdentity();
                Policy policy = new Policy();
                policy.addPerson(identity);
                break;
            case 3:
                NameGenerate nameGenerate1 = new NameGenerate();
                HashMap identity1 = nameGenerate1.getIdentity();
                System.out.println(identity1);
                break;
        }



    }
}