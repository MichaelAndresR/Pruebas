package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String input_login_email="//input[@id='email']";
        String input_login_pass="//input[@id='pass']";
        String button_login="//button[@name='login']";
        String value_email_local= "michaelandresr13@gmail.com";

        // Establece la ruta del ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Configura las opciones de Chrome
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); // Asegúrate de que la ruta es correcta
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");

        // Inicializa el WebDriver con las opciones configuradas
        WebDriver driver = new ChromeDriver(options);

        // Navega a una página web
        driver.get("https://www.facebook.com/?locale=es_LA");
        try {

            // Encuentra el campo de búsqueda usando su nombre
            WebElement Winput_login_email = driver.findElement(By.xpath(input_login_email));
            WebElement Winput_login_pass = driver.findElement(By.xpath(input_login_pass));
            WebElement Wbutton_login = driver.findElement(By.xpath(button_login));

            Winput_login_email.sendKeys("michaelandresr13@gmail.com");
            Winput_login_pass.click();
            String Value_email_web = Winput_login_email.getAttribute("value");

            if (Winput_login_email.equals(value_email_local)) {
                Winput_login_pass.sendKeys("michandrerodrimar13");
            } else {
                System.out.println("el valor no coincide");
            }

            Wbutton_login.click();

            Thread.sleep(10000);
        } catch (Exception e){
            System.out.println("DATO MALO"+e.getMessage());
        }


        // Espera unos segundos para ver los resultados
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cierra el navegador
        driver.quit();
    }
}