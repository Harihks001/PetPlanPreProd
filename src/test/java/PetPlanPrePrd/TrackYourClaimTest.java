package PetPlanPrePrd;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TrackYourClaimTest extends BaseClass {

    @Test
    public void TrackMyPetInsuranceClaim() throws InterruptedException {
//Launching Website and Accepting Cookies
        driver.get("https://forms.petplan.co.uk/existing-customers/track-your-claim/");
        acceptCookies();
        System.out.println("Website Launched and Cookies Accepted");
        System.out.println("All Test passed");

//Capture Policy Number
        driver.findElement(By.id("txtPolicyNumber")).sendKeys("246314236");
//Capture PostCode
        driver.findElement(By.id("txtPostCode")).sendKeys("GU11PA");

        Thread.sleep(2000);

    }

}
