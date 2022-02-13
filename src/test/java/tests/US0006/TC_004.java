package tests.US0006;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelRoomPage;
import pages.MainPage;
import utilities.ReusableMethods;

public class TC_004 {
//İstenen bilgiler doğru şekilde girilmeli
//Bos yer bırakılmamalı
//Save butonuna tıklanılmalı


@Test
    public void createNewHotel(){

    MainPage mainPage=new MainPage();
    HotelRoomPage hotelRoomPage=new HotelRoomPage();

    mainPage.hotelMyCampGiris();
    hotelRoomPage.hotelManagementLinki.click();
    hotelRoomPage.hotelRoomsLinki.click();
    hotelRoomPage.addHotelRoomButtonu.click();
    Select select=new Select(hotelRoomPage.iDHotelDropBox);

//select hotel deki tum hoteller seciliyor mu nasıl kontrol edecegim

    for (WebElement each: hotelRoomPage.selectHotelListesi
         ) {
        ReusableMethods.waitFor(1);
       // select.selectByVisibleText(each.getText());
    }




}



}
