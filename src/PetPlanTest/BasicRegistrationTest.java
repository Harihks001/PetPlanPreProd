package PetPlanTest;

import PetPlanProd.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicRegistrationTest extends BaseClass {
    @Test
    public void BasicRegistration() throws InterruptedException {

        //Launching Website
        driver.get("https://www-test-petplan.allianz.co.uk/bacs/?pname=APP%20REP%20PRACTICE&ad1=TEST%20APP%20REP&ad2=MORE%20ADDRESS&twn=TEST%20CITY%20&cnty=TESTWOLD&pcode=TE5%201PC&tele=01234%20567890&pno=1234567");

        //Capturing your details
        WebElement TitleDD=scrollUntilVisible(By.xpath("//*[@name='title']"));Select TDDValues= new Select(TitleDD);TDDValues.selectByValue("Mr");//Title
        scrollUntilVisible(By.id("txtForename")).sendKeys("Test");//Firstname
        scrollUntilVisible(By.id("txtSurname")).sendKeys("Agent");//Lastname
        WebElement JobDD=scrollUntilVisible(By.xpath("//*[@name='selPosition']"));Select JobValues= new Select(JobDD);JobValues.selectByValue("Receptionist");//Job
        scrollUntilVisible(By.id("txtTelephone")).sendKeys("07878787878");//Telephone

        //Email Address
        scrollUntilVisible(By.id("txtEmail1")).sendKeys("TestAnalyst@mail.com");//Practice email
        //Bank details
        scrollUntilVisible(By.id("txtAcHolder")).sendKeys("Luffy D");//Name of ACC
        scrollUntilVisible(By.id("txtAcNo")).sendKeys("88888888");//Account Number
        scrollUntilVisible(By.id("txtSortCode1")).sendKeys("20");//SortCode1
        scrollUntilVisible(By.id("txtSortCode2")).sendKeys("20");//SortCode2
        scrollUntilVisible(By.id("txtSortCode3")).sendKeys("20");//SortCode3
        scrollUntilVisible(By.id("txtBankName")).sendKeys("Test Bank");//Bank name

        //Click the Submit button
        scrollUntilVisible(By.xpath("//*[@title='Next']")).click();

      //Assert that the heading is displayed
        WebElement heading = scrollUntilVisible(By.xpath("//*[contains(text(), ' Thank you ')]"));
        Assert.assertTrue(heading.isDisplayed());





    }
}
