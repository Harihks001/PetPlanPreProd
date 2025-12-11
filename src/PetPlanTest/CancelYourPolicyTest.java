package PetPlanTest;

import PetPlanProd.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CancelYourPolicyTest extends BaseClass {
    @Test
    public void CancelPolicy() throws InterruptedException {

        //Launching Website and Accepting cookies
        driver.get("https://www-test-petplan.allianz.co.uk/existing-customers/cancel-your-policy/");
        acceptCookies();
        Thread.sleep(2000);

        //Capture the First Name
        scrollUntilVisible(By.id("txtFirstName")).sendKeys("Test");
        //Capture Last name
        scrollUntilVisible(By.id("txtSurname")).sendKeys("Customer");

        //Capture Date of Birth
        //Day
        WebElement DayDD=scrollUntilVisible(By.id("slDOBDay"));
        Select DayDDValues= new Select(DayDD);
        DayDDValues.selectByValue("05");
        //Month
        WebElement MonthDD=scrollUntilVisible(By.id("slDOBMonth"));
        Select MonthDDValues= new Select(MonthDD);
        MonthDDValues.selectByValue("05");
        //Day
        WebElement YearDD=scrollUntilVisible(By.id("slDOBYear"));
        Select YearDDValues= new Select(YearDD);
        YearDDValues.selectByValue("1998");

        //Capture Postcode
        scrollUntilVisible(By.id("txtNewPostArea")).sendKeys("GU11PA");
        //Capture Postcode
        scrollUntilVisible(By.id("txtPolicyNumber")).sendKeys("888888888");

        //Capture No of pets
        WebElement NoOfPetDD=scrollUntilVisible(By.id("noPolicies"));
        Select PetDDValues= new Select(NoOfPetDD);
        PetDDValues.selectByValue("1");
        //Capture PetName
        scrollUntilVisible(By.id("txtPetName-0")).sendKeys("Luffy");
        //Reason for cancelling
        WebElement ReasonDD=scrollUntilVisible(By.id("txtCancelReason"));
        Select ReasonDDValues= new Select(ReasonDD);
        ReasonDDValues.selectByValue("3");
        //Are you planning to change insurer or go without?
        scrollUntilVisible(By.xpath("//label[text()='Go Without']")).click();

        //When you like to Cancel your policy
        //Day
        WebElement DDD=scrollUntilVisible(By.id("slCancelDay"));
        Select DDDValues= new Select(DDD);
        DDDValues.selectByValue("15");
        //Month
        WebElement MDD=scrollUntilVisible(By.id("slCancelMonth"));
        Select MDDValues= new Select(MDD);
        MDDValues.selectByValue("12");
        //Day
        WebElement YDD=scrollUntilVisible(By.id("slCancelYear"));
        Select YDDValues= new Select(YDD);
        YDDValues.selectByValue("2025");


        Thread.sleep(2000);


    }
}
