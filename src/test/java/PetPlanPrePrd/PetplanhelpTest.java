package PetPlanPrePrd;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import java.util.List;

public class PetplanhelpTest extends BaseClass {

    @Test
    public void HelpAndContact() throws InterruptedException {

//Launching Website and Accepting cookies
        driver.get("https://www.petplan.co.uk/help.html");
        acceptCookies();
        Thread.sleep(2000);

//Click the dropdown to open it
        WebElement Title = scrollUntilVisible(By.id("generate-academic-title-133874710-label"));
        Title.click();

//Find all options
        List<WebElement> TitleOptions = driver.findElements(
                By.xpath("//*[@id='generate-academic-title-133874710-options']/li")
        );

// Click the desired option
        //Thread.sleep(1000);
        for (WebElement option : TitleOptions) {
            if (option.getText().trim().equals("Dr")) {
                option.click();
                break;
            }
        }

 //Send the first name and lastname
        driver.findElement(By.xpath("//*[@id='name_copy-firstName']")).sendKeys("Hari");
        driver.findElement(By.xpath("//*[@id='name_copy-lastName']")).sendKeys("Wayne");

//DOB
        String year= "1997" ;String month="06";String day="20";
        String DOB = day+"/"+month+"/"+year;

//Picking the DOB
        driver.findElement(By.xpath("//*[@id='dateofbirth']")).sendKeys(DOB);

//Address capture
        WebElement HouseNo=driver.findElement(By.xpath("//*[@id='textfield_716485610_-housenameno']"));
        HouseNo.sendKeys("MNRA-208");
        WebElement StreetNo=driver.findElement(By.xpath("//*[@id='textfield_716485610__1943172495-street']"));
        StreetNo.sendKeys("Elangathu Nagar");
        WebElement Town=scrollUntilVisible(By.xpath("//*[@id='textfield_716485610__179893247-town']"));
        Town.sendKeys("Trivandrum");
        WebElement PostCde = scrollUntilVisible(By.xpath("//*[@id='textfield_716485610__1568118705-postcode']"));
        PostCde.sendKeys("87500");

 //Email address capture
        WebElement Email = scrollUntilVisible(By.xpath("//*[@id='textfield_copy_copy_-emailaddress']"));
        Email.sendKeys("tingtong0@gmail.com");

//Click Enquiry type
        WebElement EnqType = scrollUntilVisible(By.xpath("//*[@id='generate-Enquiry-type-16326114-label']"));
        EnqType.click();

        //Select all Enquiry types
        List<WebElement> EnqOptions = driver.findElements(
                By.xpath("//*[@id='generate-Enquiry-type-16326114-options']/li")
        );
// Click the desired option
        for (WebElement option : EnqOptions) {
            if (option.getText().trim().equals("Claim")) {
                option.click();
                break;
            }
        }

//Capture your Message
        WebElement YourMsg = scrollUntilVisible(By.xpath("//*[@id='textarea_copy_copy-246914669']"));
        YourMsg.sendKeys("This is for testing");



        Thread.sleep(2000);

    }

}
