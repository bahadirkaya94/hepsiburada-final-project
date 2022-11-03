package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AramaSayfasi extends Parent {

    public AramaSayfasi(){
        PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(className = "desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b")
    private WebElement aramaKutucugu;

    @FindBy(className = "SearchBoxOld-cHxjyU99nxdIaAbGyX7F")
    private WebElement aramaButonu;

    WebElement myElement;

    public void findAndSend(String strElement, String value)
    {
        switch (strElement)
        {
            case "aramaKutucugu": myElement = aramaKutucugu; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement)
        {
            case "aramaButonu": myElement = aramaButonu; break;
        }
        clickFunction(myElement);
    }

}
