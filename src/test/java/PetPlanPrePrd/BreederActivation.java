package PetPlanPrePrd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BreederActivation extends BaseClass {

    @Test
    public void VerifyTheBreederActivationSiteLaunchedSuccessfullyOrNot() {
//Launching Website and Accepting Cookies
        driver.get("https://forms.petplan.co.uk/breeder-activation/unsubscribe.asp?referenceno=D9900444");

//Verify Required Text is Displayed
        WebElement DisplayedText = driver.findElement(By.xpath("//strong[normalize-space()='This is an invalid request']"));
        boolean Result = DisplayedText.isDisplayed();
        Assert.assertTrue(Result);

    }



}
