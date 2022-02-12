package tests.US_0005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class girisYap {
MainPage mainPage=new MainPage();
    SoftAssert softAssert=new SoftAssert();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void loginButonuisDisplayed (){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        WebElement loginButonuElementi=mainPage.firstLoginLinki;
        String loginButonuElementiStr=loginButonuElementi.getText();
        System.out.println("loginButonuElementiStr = " + loginButonuElementiStr);
        
        softAssert.assertTrue((loginButonuElementi.isDisplayed()));
        softAssert.assertAll();

    }
    @Test
    public void userNameBoxIsDisplayed (){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        mainPage.firstLoginLinki.click();
        actions.
                sendKeys(Keys.ARROW_DOWN).
                perform();
        WebElement userNameBoxElement=mainPage.firstUserNameBox;
        String userNameBoxElementStr =userNameBoxElement.getText();
        System.out.println("userNameBoxElementStr = " + userNameBoxElementStr);
        softAssert.assertTrue((userNameBoxElement.isDisplayed()));
        softAssert.assertAll();
    }


    @Test
    public void positiveLoginTest (){



        //https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
//login butonuna bas
        mainPage.firstLoginLinki.click();
        ReusableMethods.waitFor(1);
        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                perform();
        //1-username  kutusuna manager datasi gonderilir (sendkeys)
        mainPage.firstUserNameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        ReusableMethods.waitFor(1);
        //2-ve password  kutusuna Manager! (datasi gonderilir sendkeys)
        mainPage.firstPasswordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        ReusableMethods.waitFor(1);
        mainPage.secondLoginButonu.click();
        //3-gecerli giris yapilabildigi
        // https://www.hotelmycamp.com/Admin/UserAdmin urlsine ulasildigi test edilir(positive test)
        String expectedTitle="https://www.hotelmycamp.com/Admin/UserAdmin";
       //String actualTitle=String actualUrl=driver.getCurrentUrl();

    }

}
