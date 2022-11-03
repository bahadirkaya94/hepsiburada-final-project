package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SepetSayfasi extends Parent{
    public SepetSayfasi()
    {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath = "//h3[@data-test-id='product-card-name']")
    private WebElement urun;

    @FindBy(id = "product-name")
    private WebElement urunAdi;

    @FindBy(xpath = "(//a[contains(@data-bind,'text:')])[1]")
    private WebElement saticiAdi;

    @FindBy(xpath = "(//span[contains(@data-bind,'markupText')])[3]")
    private WebElement virguldenOncekiGuncelFiyat;

    @FindBy(xpath = "(//span[contains(@data-bind,'markupText')])[4]")
    private WebElement virguldenSonrakiGuncelFiyat;

    @FindBy(className = "variant-name")
    private WebElement urunRengi;

    @FindBy(id = "addToCart")
    private WebElement sepeteEkle;

    @FindBy(xpath = "//a[contains(@class,'checkoutui-Modal')]")
    private WebElement pencereKapatma;

    @FindBy(xpath = "//*[text()=' Ürün sepetinizde']")
    private WebElement urunSepetinizdeMesaji;

    @FindBy(xpath = "//span[text()='Diğer Satıcılar - ']")
    private WebElement digerSaticilarVarMi;

    @FindBy(xpath = "(//div[@class='shipment-content'])[1]")
    private WebElement digerIlkSatici;

    @FindBy(id = "shoppingCart")
    private WebElement sepetim;

    @FindBy(xpath = "(//div[@class='product_name_3Lh3t']//a)[1]")
    private WebElement sepettekiUrunAdi2;

    @FindBy(xpath = "(//span//a[contains(@href,'ttps://www.hepsiburada.com/magaza/')])[1]")
    private WebElement sepettekiSaticiAdi2;

    @FindBy(xpath = "(//div[contains(@class,'co-hbPrice-ibRavm')])[1]")
    private WebElement sepettekiGuncelFiyat2;


    @FindBy(xpath = "(//div[@class='product_variant_1Yhwf'])[1]")
    private WebElement sepettekiUrunRengi2;

    @FindBy(xpath = "(//div[@class='product_name_3Lh3t']//a)[2]")
    private WebElement sepettekiUrunAdi1;

    @FindBy(xpath = "(//span//a[contains(@href,'ttps://www.hepsiburada.com/magaza/')])[2]")
    private WebElement sepettekiSaticiAdi1;

    @FindBy(xpath = "(//div[contains(@class,'co-hbPrice-ibRavm')])[2]")
    private WebElement sepettekiGuncelFiyat1;

    @FindBy(xpath = "(//div[@class='product_variant_1Yhwf'])[2]")
    private WebElement sepettekiUrunRengi1;

    @FindBy(className = "product_delete_1zR-0")
    private WebElement sepettekiIlkUrunSilme;

    @FindBy(xpath = "//div[contains(text(),'Ürün sepetinizden kaldırıldı')]")
    private WebElement urunSepetinizdenKaldirildiMesaji;

    @FindBy(id = "continue_step_btn")
    private WebElement alisverisiTamamlaButonu;

    @FindBy(xpath = "(//a[@aria-label='Ürünü Kaldır'])[2]")
    private WebElement sepettekiIkinciUrun;

    WebElement myElement;
    private String urunAdi1;

    private String saticiAdi1;
    private String virguldenOncekiGuncelFiyat1;
    private String virguldenSonrakiGuncelFiyat1;
    private String urunFiyati1;
    private String urunRengi1;
    private String urunAdi2;
    private String saticiAdi2;
    private String virguldenOncekiGuncelFiyat2;
    private String virguldenSonrakiGuncelFiyat2;
    private String urunFiyati2;
    private String urunRengi2;

    private String sepetUrunAdi1;
    private String sepetSaticiAdi1;
    private String sepetGuncelFiyat1;;
    private String sepetUrunRengi1;

    private String sepetUrunAdi2;
    private String sepetSaticiAdi2;
    private String sepetGuncelFiyat2;
    private String sepetUrunRengi2;

    public String getUrunAdi1() {
        return urunAdi1;
    }

    public void setUrunAdi1(String urunAdi1) {
        this.urunAdi1 = urunAdi1;
    }

    public String getSaticiAdi1() {
        return saticiAdi1;
    }

    public void setSaticiAdi1(String saticiAdi1) {
        this.saticiAdi1 = saticiAdi1;
    }

    public String getVirguldenOncekiGuncelFiyat1() {
        return virguldenOncekiGuncelFiyat1;
    }

    public void setVirguldenOncekiGuncelFiyat1(String virguldenOncekiGuncelFiyat1) {
        this.virguldenOncekiGuncelFiyat1 = virguldenOncekiGuncelFiyat1;
    }

    public String getVirguldenSonrakiGuncelFiyat1() {
        return virguldenSonrakiGuncelFiyat1;
    }

    public void setVirguldenSonrakiGuncelFiyat1(String virguldenSonrakiGuncelFiyat1) {
        this.virguldenSonrakiGuncelFiyat1 = virguldenSonrakiGuncelFiyat1;
    }

    public String getUrunFiyati1() {
        return urunFiyati1;
    }

    public void setUrunFiyati1(String urunFiyati1) {
        this.urunFiyati1 = urunFiyati1;
    }

    public String getUrunRengi1() {
        return urunRengi1;
    }

    public void setUrunRengi1(String urunRengi1) {
        this.urunRengi1 = urunRengi1;
    }

    public String getUrunAdi2() {
        return urunAdi2;
    }

    public void setUrunAdi2(String urunAdi2) {
        this.urunAdi2 = urunAdi2;
    }

    public String getSaticiAdi2() {
        return saticiAdi2;
    }

    public void setSaticiAdi2(String saticiAdi2) {
        this.saticiAdi2 = saticiAdi2;
    }

    public String getVirguldenOncekiGuncelFiyat2() {
        return virguldenOncekiGuncelFiyat2;
    }

    public void setVirguldenOncekiGuncelFiyat2(String virguldenOncekiGuncelFiyat2) {
        this.virguldenOncekiGuncelFiyat2 = virguldenOncekiGuncelFiyat2;
    }

    public String getVirguldenSonrakiGuncelFiyat2() {
        return virguldenSonrakiGuncelFiyat2;
    }

    public void setVirguldenSonrakiGuncelFiyat2(String virguldenSonrakiGuncelFiyat2) {
        this.virguldenSonrakiGuncelFiyat2 = virguldenSonrakiGuncelFiyat2;
    }

    public String getUrunFiyati2() {
        return urunFiyati2;
    }

    public void setUrunFiyati2(String urunFiyati2) {
        this.urunFiyati2 = urunFiyati2;
    }

    public String getUrunRengi2() {
        return urunRengi2;
    }

    public void setUrunRengi2(String urunRengi2) {
        this.urunRengi2 = urunRengi2;
    }

    public String getSepetUrunAdi1() {
        return sepetUrunAdi1;
    }

    public void setSepetUrunAdi1(String sepetUrunAdi1) {
        this.sepetUrunAdi1 = sepetUrunAdi1;
    }

    public String getSepetSaticiAdi1() {
        return sepetSaticiAdi1;
    }

    public void setSepetSaticiAdi1(String sepetSaticiAdi1) {
        this.sepetSaticiAdi1 = sepetSaticiAdi1;
    }

    public String getSepetGuncelFiyat1() {
        return sepetGuncelFiyat1;
    }

    public void setSepetGuncelFiyat1(String sepetGuncelFiyat1) {
        this.sepetGuncelFiyat1 = sepetGuncelFiyat1;
    }

    public String getSepetUrunRengi1() {
        return sepetUrunRengi1;
    }

    public void setSepetUrunRengi1(String sepetUrunRengi1) {
        this.sepetUrunRengi1 = sepetUrunRengi1;
    }

    public String getSepetUrunAdi2() {
        return sepetUrunAdi2;
    }

    public void setSepetUrunAdi2(String sepetUrunAdi2) {
        this.sepetUrunAdi2 = sepetUrunAdi2;
    }

    public String getSepetSaticiAdi2() {
        return sepetSaticiAdi2;
    }

    public void setSepetSaticiAdi2(String sepetSaticiAdi2) {
        this.sepetSaticiAdi2 = sepetSaticiAdi2;
    }

    public String getSepetGuncelFiyat2() {
        return sepetGuncelFiyat2;
    }

    public void setSepetGuncelFiyat2(String sepetGuncelFiyat2) {
        this.sepetGuncelFiyat2 = sepetGuncelFiyat2;
    }

    public String getSepetUrunRengi2() {
        return sepetUrunRengi2;
    }

    public void setSepetUrunRengi2(String sepetUrunRengi2) {
        this.sepetUrunRengi2 = sepetUrunRengi2;
    }

    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "urun": myElement = urun; break;
            case "sepeteEkle": myElement = sepeteEkle; break;
            case "pencereKapatma": myElement = pencereKapatma; break;
            case "digerIlkSatici": myElement = digerIlkSatici; break;
            case "sepetim": myElement = sepetim; break;
        }
            clickFunction(myElement);
    }
    public String findAndGetText(String strElement)
    {
        switch (strElement)
        {
            case "urunAdi": myElement = urunAdi; break;
            case "saticiAdi": myElement = saticiAdi; break;
            case "virguldenOncekiGuncelFiyat": myElement = virguldenOncekiGuncelFiyat; break;
            case "virguldenSonrakiGuncelFiyat": myElement = virguldenSonrakiGuncelFiyat; break;
            case "urunRengi": myElement = urunRengi; break;
            case "digerSaticilarVarMi": myElement = digerSaticilarVarMi; break;
            case "sepettekiUrunAdi2": myElement = sepettekiUrunAdi2; break;
            case "sepettekiSaticiAdi2": myElement = sepettekiSaticiAdi2; break;
            case "sepettekiGuncelFiyat2": myElement = sepettekiGuncelFiyat2; break;
            case "sepettekiUrunRengi2": myElement = sepettekiUrunRengi2; break;
            case "sepettekiUrunAdi1": myElement = sepettekiUrunAdi1; break;
            case "sepettekiSaticiAdi1": myElement = sepettekiSaticiAdi1; break;
            case "sepettekiGuncelFiyat1": myElement = sepettekiGuncelFiyat1; break;
            case "sepettekiUrunRengi1": myElement = sepettekiUrunRengi1; break;

        }
        waitUntilVisible(myElement);
        return myElement.getText().toLowerCase();
    }
    public String findAndGetText2(String strElement)
    {
        switch (strElement)
        {
            case "digerSaticilarVarMi": myElement = digerSaticilarVarMi; break;
        }
        waitUntilVisible(myElement);
        return myElement.getText().toLowerCase();
    }

    public void findAndClickWithoutScroll(String strElement)
    {
        switch (strElement)
        {
            case "sepettekiIlkUrunSilme": myElement = sepettekiIlkUrunSilme; break;
        }
        clickFunctionWithoutScroll(myElement);

    }

    public void findAndWaitUntilInvisibilityOfElement(String strElement)
    {
        switch (strElement)
        {
            case "sepettekiIkinciUrun": myElement = sepettekiIkinciUrun; break;
        }
        waitUntilInvisibilityofElement(myElement);
    }

    public void findAndWaitVisibleOfElement(String strElement)
    {
        switch (strElement)
        {
            case "urunSepetinizdeMesaji": myElement = urunSepetinizdeMesaji; break;
            case "sepetim": myElement = sepetim; break;
        }
        waitUntilVisible(myElement);
    }
}
