package w3d2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class count {

    public static void main(String[] args)
    {
        ChromeDriver driver  = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//*[@placeholder='Search Amazon.in']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Search Amazon.in']")).sendKeys("Mobile");
        driver.findElement(By.xpath("//*[@placeholder='Search Amazon.in']")).sendKeys(Keys.ENTER);
        List<WebElement>price = driver.findElements(By.xpath("//*[@class='a-price-whole']"));

        for (int i=0;i<price.size();i++)
        {
            System.out.println(price.get(i).getText());
        }
    }
}
