package tests;

import components.GalenTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tests  extends GalenTestBase {

    @Test(dataProvider = "devices")
    public void welcomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        checkLayout("/specs/welcomePage.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void loginPage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        getDriver().findElement(By.xpath("//button[.='Login']")).click();
        checkLayout("/specs/loginPage.spec", device.getTags());
    }
}
