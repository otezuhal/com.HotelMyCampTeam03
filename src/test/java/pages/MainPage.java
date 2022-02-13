package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MainPage {

    //bir page class'i actigimizda ilk yapmamiz gereken
    //parametresiz bir constructor olusturup bu constructor icinde
    //pagefactory ile driver'a ilk deger atamasi yapmak olmalidir
    //We use Page Factory pattern to initialize
    // web elements which are defined in Page Objects.
    //Once we call initElements() method, all elements will get initialized
    //yani kisacasi webelementlere deger atamak icin once pagefactory clas'indaki
    //initElements methodunu kullaniyoruz
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
//yani kisacasi webelementlere deger atamak icin once pagefactory clas'indaki
        //initElements methodunu kullaniyoruz
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(id = "UserName")
    public WebElement userNameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    public void hotelMyCampGiris() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        ReusableMethods.waitFor(1);
        userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        ReusableMethods.waitFor(1);
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        ReusableMethods.waitFor(1);
        loginButonu.click();

    }


}
