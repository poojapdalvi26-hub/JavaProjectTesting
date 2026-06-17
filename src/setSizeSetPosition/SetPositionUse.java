package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionUse {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpune.com/");
        Point browserPosition =driver.manage().window().getPosition();
        System.out.println(browserPosition);

        Thread.sleep(1000);
        Point point= new Point(70,60);
        driver.manage().window().setPosition(point);

    }
}
