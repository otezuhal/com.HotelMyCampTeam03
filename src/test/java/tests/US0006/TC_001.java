package tests.US0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelRoomPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001 {
    //Yönetici olarak basarili Log in yapılması
    //'ListofUsers' yazısı var mı test edilmeli

    @Test
    public void girisYapildiTesti(){
        MainPage mainPage=new MainPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        mainPage.ilkLoginLinki.click();
        mainPage.userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        mainPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        mainPage.loginButonu.click();

    }
    @Test
    public void listOfUsersGorunduYazisi(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        MainPage mainPage=new MainPage();
        mainPage.hotelMyCampGiris();
        HotelRoomPage hotelRoomPage=new HotelRoomPage();
        Assert.assertTrue(hotelRoomPage.listOfUsersYazisi.isDisplayed());
    }

}
