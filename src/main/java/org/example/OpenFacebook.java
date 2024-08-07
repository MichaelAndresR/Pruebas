package org.example;

import org.example.locatorsLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\varga\\Documents\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        //WebLocators
        WebElement webInputEmail = driver.findElement(By.xpath(locatorsLogin.inputEmail));
        WebElement webInputPass = driver.findElement(By.xpath(locatorsLogin.inputPass));
        WebElement webButtonLogin = driver.findElement(By.xpath(locatorsLogin.buttonLogin));

        //date
        String email = "+573144545940";
        String pass = "Eucbwpf71#@";

        //actions
        webInputEmail.sendKeys(email);
        webInputPass.sendKeys(pass);
        webButtonLogin.click();

        //afterclass
        driver.quit();
    }

    public void forceTime(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
