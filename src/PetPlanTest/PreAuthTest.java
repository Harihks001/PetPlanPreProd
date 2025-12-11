package PetPlanTest;

import PetPlanProd.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PreAuthTest extends BaseClass {

    @Test
    public void PreAuthorization() throws InterruptedException {

        //Launching Website
        driver.get("https://www-test-petplan.allianz.co.uk/my-claims/pre-authorisation.asp?no=1100003000");

        //Capturing your details
        scrollUntilVisible(By.id("txtFirstName")).sendKeys("Test");//Firstname
        scrollUntilVisible(By.id("txtSurname")).sendKeys("Agent");//Lastname
        scrollUntilVisible(By.id("txtPosition")).sendKeys("Test Analyst");//Position
        scrollUntilVisible(By.id("txtPracticeEmail")).sendKeys("TestAnalyst@mail.com");//Practice email

        //Customer details
        scrollUntilVisible(By.id("txtPolicyNumber")).sendKeys("888888888");//policy number
        scrollUntilVisible(By.id("txtCustomerFirstName")).sendKeys("Test");//Firstname
        scrollUntilVisible(By.id("txtCustomerSurname")).sendKeys("Customer");//Lastname
        scrollUntilVisible(By.id("txtCustomerEmail")).sendKeys("TestCustomer@mail.com");//Customer Email address
        scrollUntilVisible(By.id("txtPetName")).sendKeys("Luffy");//Pet's name

        //Claims information
        scrollUntilVisible(By.xpath("//*[@id='treatmentday' and @value='same day']")).click();//When is the treatment required?
        scrollUntilVisible(By.xpath("//*[@id='bookedin' and @value='yes']")).click();//Is the pet booked in for treatment?
        scrollUntilVisible(By.id("costofclaim")).click();//Is the cost of the claim?
        scrollUntilVisible(By.id("txtCondition")).sendKeys("Asthma");//What condition is the treatment for?
        WebElement DayDD = scrollUntilVisible(By.id("slEffectDay"));
        Select DayDDValues = new Select(DayDD);
        DayDDValues.selectByValue("5");//Day
        WebElement MonthDD = scrollUntilVisible(By.id("slEffectMonth"));
        Select MonthDDValues = new Select(MonthDD);
        MonthDDValues.selectByValue("5");//Month
        WebElement YearDD = scrollUntilVisible(By.id("slEffectYear"));
        Select YearDDValues = new Select(YearDD);
        YearDDValues.selectByValue("2025");//Day
        scrollUntilVisible(By.id("txtFirstSigns")).sendKeys("Playing");//What was the animal doing when the problem was first noticed?
        scrollUntilVisible(By.xpath("//*[@id='payeeDetails' and @value='vet']")).click();//Who should we pay at claim settlement?
        WebElement DDD = scrollUntilVisible(By.id("slRegDay"));
        Select DDDValues = new Select(DDD);
        DDDValues.selectByValue("5");//Day
        WebElement MDD = scrollUntilVisible(By.id("slRegMonth"));
        Select MDDValues = new Select(MDD);
        MDDValues.selectByValue("10");//Month
        WebElement YDD = scrollUntilVisible(By.id("slRegYear"));
        Select YDDValues = new Select(YDD);
        YDDValues.selectByValue("2024");//Day
        scrollUntilVisible(By.xpath("//*[@id='primaryvet' and @value='yes']")).click();//Will your practice be carrying out treatment?

        //Uploding Doc for Medical History
        WebElement UpldDoc1 = scrollUntilVisible(By.xpath("//*[@id='medical_history']"));
        UpldDoc1.sendKeys("C:\\Users\\N53820\\OneDrive - Allianz\\Documents\\Test document for Uploading.pdf");
        //Uploding Doc for Estimate of treatment costs
        WebElement UpldDoc2 = scrollUntilVisible(By.xpath("//*[@id='treatment_costs']"));
        UpldDoc2.sendKeys("C:\\Users\\N53820\\OneDrive - Allianz\\Documents\\Test document for Uploading.pdf");

        //Disclaimer
        scrollUntilVisible(By.id("disclaimer1")).click();//Disclaimer1
        scrollUntilVisible(By.id("disclaimer2")).click();//Disclaimer2

        //Click the Submit button
        scrollUntilVisible(By.xpath("//*[@title='Submit']")).click();

        //Asserting the currentURL
        String ActUrl = driver.getCurrentUrl();
        String ExpUrl = "https://www-test-petplan.allianz.co.uk/my-claims/pre-authorisation_thankyou.asp";
        Assert.assertEquals(ActUrl, ExpUrl);

    }
}
