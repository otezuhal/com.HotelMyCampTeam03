package tests.US_0005;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_MainPageLogin {
    @Test
    public void logIn (){
        Driver.getDriver().get("https://www.hotelmycamp.com/");
    }

}
