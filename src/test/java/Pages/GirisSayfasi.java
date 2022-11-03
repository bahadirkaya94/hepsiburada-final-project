package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GirisSayfasi extends Parent{

    public GirisSayfasi()
    {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cerezleriKapat;

    @FindBy(xpath = "(//span[@class='sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq'])[1]")
    private WebElement girisYapveyaUyeOl;

    @FindBy(id = "login")
    private WebElement girisYap;

   @FindBy(id = "btnFacebook")
   private WebElement facebookIleGirisYap;

   @FindBy(id = "email")
   private WebElement eMail;

    @FindBy(id = "pass")
    private WebElement sifre;
    @FindBy(id = "loginbutton")
    private WebElement girisYapButonu;
   @FindBy(xpath = "//span[text()='Hesabım']")
   private WebElement girisDogrulama;


    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement)
        {
            case "cerezleriKapat": myElement = cerezleriKapat; break;
            case "girisYapveyaUyeOl": myElement = girisYapveyaUyeOl; break;
            case "girisYap": myElement = girisYap; break;
            case "facebookIleGirisYap": myElement = facebookIleGirisYap; break;
            case "girisYapButonu": myElement = girisYapButonu; break;

        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value)
    {
        switch (strElement)
        {
            case "eMail": myElement = eMail; break;
            case "sifre": myElement = sifre; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "girisDogrulama" : myElement =girisDogrulama; break;
        }

        verifyContainsText(myElement,text);
    }

}
