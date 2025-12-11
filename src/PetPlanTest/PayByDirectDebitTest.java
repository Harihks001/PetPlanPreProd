package PetPlanTest;

import PetPlanProd.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PayByDirectDebitTest extends BaseClass {

    @Test
    public void PayingByDirectDebit() throws InterruptedException {

//Launching Website and Accepting Cookies
        driver.get("https://www-test-petplan.allianz.co.uk/existing-customers/paying-by-direct-debit/");
        acceptCookies();

//Capturing PolicyHolder FullName
        WebElement FullName = scrollUntilVisible(By.id("txtName"));
        FullName.sendKeys("Kate Wilson");

//Capturing PolicyHolder Email address
        WebElement EmailPH = scrollUntilVisible(By.id("txtEmail"));
        EmailPH.sendKeys("Kt091@gmail.com");

//Capturing PolicyHolder Date Of birth
        WebElement Day = scrollUntilVisible(By.id("slDOBDay"));
        Day.sendKeys("12");
        WebElement Month = scrollUntilVisible(By.id("slDOBMonth"));
        Month.sendKeys("July");
        WebElement Year = scrollUntilVisible(By.id("slDOBYear"));
        Year.sendKeys("1997");
//Capturing the Postcode
        WebElement PostCode = scrollUntilVisible(By.id("txtpostcode"));
        PostCode.sendKeys("GU1 1PA");

//Click FindAddress
        WebElement FindAddress = driver.findElement(By.id("btnFindAddressNew"));
        FindAddress.click();


//Dropdown for address
        WebElement selectAddress = driver.findElement(By.id("addressNew"));
        Select Query = new Select(selectAddress);
        Query.selectByVisibleText("6 Juniper Close Guildford, GU1 1PA");

//HouseName/Street/Town will be automatically captured
//If needed we can verify that values are captured correctly

//Capturing PolicyNumber
        WebElement PolicyNumber = scrollUntilVisible(By.id("txtPolicyNumber"));
        PolicyNumber.sendKeys("070999000");
//Capturing Pets Name
        WebElement PetsName = scrollUntilVisible(By.id("txtpetname"));
        PetsName.sendKeys("Kittyy");
//Capture PetType
        WebElement enterPetType = scrollUntilVisible(By.id("speciesCat"));
        enterPetType.click();
//Capture Breed Name
        WebElement breedList = driver.findElement(By.id("catBreedList"));
        Select select = new Select(breedList);
        select.selectByVisibleText("American Curl");

//Policy renewal date (dropdown)
        //Day
        WebElement enterDayforRenewal = scrollUntilVisible(By.id("drpRenewDate_Day"));
        Select DayforRenewal = new Select(enterDayforRenewal);
        DayforRenewal.selectByVisibleText("25");
        //Month
        WebElement enterMonthforRenewal = scrollUntilVisible(By.id("drpRenewDate_Month"));
        Select MonthforRenewal = new Select(enterMonthforRenewal);
        MonthforRenewal.selectByVisibleText("Dec");
        //Year
        WebElement enterYearforRenewal = scrollUntilVisible(By.id("drpRenewDate_Year"));
        Select YearforRenewal = new Select(enterYearforRenewal);
        YearforRenewal.selectByVisibleText("2025");

// Capturing "you would like to pay"
        WebElement enterPaymentWay = scrollUntilVisible(By.id("paymentmethod.day"));
        enterPaymentWay.click();

//Capturing Name of bank account holder
        WebElement BankAccountName = scrollUntilVisible(By.id("txtAccountName"));
        BankAccountName.sendKeys("Gimmyy George");
//Capturing Bank account number
        WebElement BankAccountNumber = scrollUntilVisible(By.id("txtAccountNo"));
        BankAccountNumber.sendKeys("789463123642");
//Capturing Branch Sort Code
        WebElement BranchSortCode1 = scrollUntilVisible(By.id("txtSortCode1"));
        BranchSortCode1.sendKeys("78");
        WebElement BranchSortCode2 = scrollUntilVisible(By.id("txtSortCode2"));
        BranchSortCode2.sendKeys("42");
        WebElement BranchSortCode3 = scrollUntilVisible(By.id("txtSortCode3"));
        BranchSortCode3.sendKeys("72");

        Thread.sleep(2000);

    }

}