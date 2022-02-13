package tests.US0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelRoomPage;
import pages.MainPage;

public class TC_002 {
    //Hotel Management  a tıklanılmalı
    //HotelRooms a tıklanılmalı
    //'LIST OF HOTELROOMS' yazısının görünülürlüğü test edilmeli

    @Test
    public void hotelRoomsSayfasinaGiris(){
        MainPage mainPage=new MainPage();
        HotelRoomPage hotelRoomPage=new HotelRoomPage();
        mainPage.hotelMyCampGiris();
        hotelRoomPage.hotelManagementLinki.click();
        hotelRoomPage.hotelRoomsLinki.click();
        Assert.assertTrue(hotelRoomPage.listOfHotelYazisi.isDisplayed());
    }


}
