package PetPlanPrePrd;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Petplandocupload extends BaseClass {

    @Test
    public void SendUsADocumentOnline() throws InterruptedException {

//Launching Website and Accepting cookies
        driver.get("https://forms.petplan.co.uk/existing-customers/upload-a-document/");
        acceptCookies();

//Select the Title
        WebElement Title = scrollUntilVisible(By.id("slTitle"));
        Select TitleDrp= new Select(Title);
        TitleDrp.selectByIndex(2);

//Send the first name and lastname
        driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("Marry");
        driver.findElement(By.xpath("//*[@id='txtSurname']")).sendKeys("Jury");

//Select Day
       // String year= "1997" ;String month="06";String day="20";;
       // String DOB = day+"/"+month+"/"+year;
        WebElement DateDrp= scrollUntilVisible(By.xpath("//*[@id='slDOBDay']"));
        Select Date= new Select(DateDrp);
        Date.selectByValue("06");
//Select Month
        WebElement MonthDrp= scrollUntilVisible(By.xpath("//*[@id='slDOBMonth']"));
        Select Month= new Select(MonthDrp);
        Month.selectByVisibleText("Jun");
//Select Year
        WebElement YearDrp= scrollUntilVisible(By.id("slDOBYear"));
        Select Year= new Select(YearDrp);
        Year.selectByVisibleText("1993");


//Select Postcode
        WebElement PostCde = scrollUntilVisible(By.id("txtOldPostArea"));
        PostCde.sendKeys("87500");

//Email Email capture
        WebElement Email = scrollUntilVisible(By.id("txtEmail"));
        Email.sendKeys("tingtong0@gmail.com");

//Policy Number capture
        WebElement PCN = scrollUntilVisible(By.id("txtPolicyNumber"));
        PCN.sendKeys("079112300");

//Pet Name capture
        WebElement PTName = scrollUntilVisible(By.id("petname"));
        PTName.sendKeys("Luffy");

//Capture Query Type
        WebElement QryType= scrollUntilVisible(By.xpath("//*[@id='QueryType']"));
        Select Query = new Select(QryType);
        Query.selectByVisibleText("Claim");

//Upload Document 1
        WebElement UpldDoc1= scrollUntilVisible(By.xpath("//*[@id='fileupload1']"));
        UpldDoc1.sendKeys("C:\\Users\\harih\\OneDrive\\Documents\\Automation\\PolicyDoc.docx");

 //Upload Document 2
        WebElement UpldDoc2= scrollUntilVisible(By.xpath("//*[@id='fileUpload2']"));
        UpldDoc2.sendKeys("C:\\Users\\harih\\OneDrive\\Documents\\Automation\\PolicyDoc.docx");
//Upload Document 3
        WebElement UpldDoc3= scrollUntilVisible(By.xpath("//*[@id='fileUpload3']"));
        UpldDoc3.sendKeys("C:\\Users\\harih\\OneDrive\\Documents\\Automation\\PolicyDoc.docx");

//Capturing What all documents uploaded
        WebElement YourMsg = scrollUntilVisible(By.id("txtMessage"));
        YourMsg.sendKeys("Uploaded all 3 Testing Documents");


        Thread.sleep(2000);

    }

}

