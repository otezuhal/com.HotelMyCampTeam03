package tests.US0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelRoomPage;
import pages.MainPage;

public class TC_003 {
    //ADD HOTELROOM butonuna tıklanılmalı
    //'Create Hotelroom' yazısının görünürlüğü test edilmeli
    @Test
    public void addHotelRoom(){
        MainPage mainPage=new MainPage();
        HotelRoomPage hotelRoomPage=new HotelRoomPage();
        mainPage.hotelMyCampGiris();
        hotelRoomPage.hotelManagementLinki.click();
        hotelRoomPage.hotelRoomsLinki.click();
        hotelRoomPage.addHotelRoomButtonu.click();
        Assert.assertTrue(hotelRoomPage.createHotelRoomYazisi.isDisplayed());



    }



}
