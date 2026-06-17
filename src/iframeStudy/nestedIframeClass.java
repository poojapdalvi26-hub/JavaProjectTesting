package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedIframeClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-scenario/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.switchTo().frame("pact1");
        driver.findElement(By.cssSelector("input#inp_val")).sendKeys("abc");
        driver.findElement(By.cssSelector("button#lost")).click();
         String parentframeText =driver.findElement(By.xpath("//h3[text()='Dare for you']")).getText();
        System.out.println("Parent Frame text is "+parentframeText);
       //
        driver.switchTo().frame("pact2");
        driver.findElement(By.cssSelector("input#jex")).sendKeys("Velocity");
        driver.findElement(By.cssSelector("button#connect")).click();
        String child1FrameText =driver.findElement(By.xpath("//h4[text()='Heaven is here']")).getText();
        System.out.println("Child 1 frame text is "+ child1FrameText);

        driver.switchTo().frame("pact3");
        driver.findElement(By.cssSelector("input#glaf")).sendKeys("testing");
        System.out.println("selenium focus is on child 2 frame");

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

        String mainpageText=driver.findElement(By.xpath("//h6[text()='iframe and nested iframes']")).getText();
        System.out.println("Main page text is " + mainpageText);



    }
}
