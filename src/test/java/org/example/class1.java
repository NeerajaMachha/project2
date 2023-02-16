package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class class1 {
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.linkText("Lost password?")).click();
        driver.findElement(By.className("form-control")).sendKeys("2000030571");
    }
}