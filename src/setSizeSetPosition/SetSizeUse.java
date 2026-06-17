package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpune.com/");
       Dimension browserSize= driver.manage().window().getSize();
        System.out.println(browserSize);

        Dimension dimension= new Dimension(600,200);
        driver.manage().window().setSize(dimension);

    }
}
