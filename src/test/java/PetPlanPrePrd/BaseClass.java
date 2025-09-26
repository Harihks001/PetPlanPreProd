package PetPlanPrePrd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class BaseClass {

    protected WebDriver driver;

//Custom scrolling method (reusable by almost child classes)
    public WebElement scrollUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        return element;
    }

//Accept cookies custom method (reusable by all child classes)
    public void acceptCookies() {

        WebElement AcceptAllButton = driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));
        AcceptAllButton.click();
//        try {
//            WebElement acceptBtn = new WebDriverWait(driver, Duration.ofSeconds(5))
//                    .until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
//            acceptBtn.click();
//        } catch (Exception e) {
//            System.out.println("No cookie banner found or already accepted.");
//        }
    }

//Setup browser before tests
    @BeforeClass
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//Cleanup after tests
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
