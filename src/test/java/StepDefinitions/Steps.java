package StepDefinitions;

import Pages.AramaSayfasi;
import Pages.GirisSayfasi;
import Pages.SepetSayfasi;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import logs.Log;
import org.testng.Assert;

import java.util.List;
import java.util.Set;


public class Steps {
    GirisSayfasi girisSayfasi = new GirisSayfasi();
    AramaSayfasi aramaSayfasi = new AramaSayfasi();
    SepetSayfasi sepetSayfasi = new SepetSayfasi();

    @Given("web sitesine gidilir")
    public void webSitesineGidilir()
    {
        Log.info("Hepsiburada.com'a Gidilir");
        GWD.getDriver().get("https://www.hepsiburada.com/");
    }

    @And("cerezler kapatilir")
    public void cerezlerKapatilir(DataTable elements)
    {
        Log.info("Çerezler Kapatılır");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            girisSayfasi.findAndClick(listElement.get(i));
        }
    }
    @And("giris yap veya uye ol penceresine tiklanir")
    public void girisYapVeyaUyeOlPenceresineTiklanir(DataTable elements)
    {
        Log.info("Giriş Yap Veya Üye Ol Butonuna Tıklanır");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            girisSayfasi.findAndClick(listElement.get(i));
        }

    }

    @And("giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir(DataTable elements)
    {
        Log.info("Giriş Yap Butonuna Tıklanır");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            girisSayfasi.findAndClick(listElement.get(i));
        }
    }

    @And("facebook ile giris yap butonuna tiklanir")
    public void facebookIleGirisYapButonunaTiklanir(DataTable elements)
    {
        Log.info("Facebook İle Giriş Yap Butonuna Tıklanır");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            girisSayfasi.findAndClick(listElement.get(i));
        }
    }

    @And("email adresi girilir")
    public void emailAdresiGirilir(DataTable elements)
    {
        Log.info("E-mail Adresi Girilir");
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            girisSayfasi.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("sifre girilir")
    public void sifreGirilir(DataTable elements)
    {
        Log.info("Şifre Girilir");
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            girisSayfasi.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("kullanici giris isleminin yapildigi dogrulanir")
    public void kullaniciGirisIslemininYapildigiDogrulanir(DataTable elements)
    {
        Log.info("HESABIM Yazısının Gözüktüğü Doğrulanır");
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            girisSayfasi.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("arama kutucuguna aranacak urun girilir")
    public void aramaKutucugunaAranacakUrunGirilir(DataTable elements)
    {
        Log.info("Arama Kutucuğuna Aranacak Ürünün İsmi Yazılır");
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            aramaSayfasi.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("ara butonuna tiklanir")
    public void araButonunaTiklanir(DataTable elements)
    {
        Log.info("Ara Butonuna Tıklanır");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            aramaSayfasi.findAndClick(listElement.get(i));
        }
    }

    @And("cikan urune tiklanir")
    public void cikanUruneTiklanir(DataTable elements)
    {
        Log.info("Çıkan İlk Ürüne Tıklanır");
        sepetSayfasi.findAndWaitVisibleOfElement("sepetim");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            sepetSayfasi.findAndClick(listElement.get(i));
        }
    }

    @And("acilan diger sayfaya gecilir")
    public void acilanDigerSayfayaGecilir()
    {
        Log.info("Açılan Diğer Sayfaya Geçilir");
        String anaSayfaWindowId = GWD.getDriver().getWindowHandle();

        Set<String> windowsIdler = GWD.getDriver().getWindowHandles();

        for (String id: windowsIdler)
        {
            if (id.equals(anaSayfaWindowId))
                continue;

            GWD.getDriver().switchTo().window(id);
        }
    }
    @And("urunun bilgileri ilk satici icin kayit edilir")
    public void urununBilgileriIlkSaticiIcinKayitEdilir()
    {
        Log.info("Ürünün Bilgileri İlk Satıcı İçin Kayıt Edilir");
        sepetSayfasi.setUrunAdi1(sepetSayfasi.findAndGetText("urunAdi"));
        sepetSayfasi.setSaticiAdi1(sepetSayfasi.findAndGetText("saticiAdi"));
        sepetSayfasi.setVirguldenOncekiGuncelFiyat1(sepetSayfasi.findAndGetText("virguldenOncekiGuncelFiyat"));
        sepetSayfasi.setVirguldenSonrakiGuncelFiyat1(sepetSayfasi.findAndGetText("virguldenSonrakiGuncelFiyat"));
        sepetSayfasi.setUrunFiyati1(sepetSayfasi.findAndGetText("virguldenOncekiGuncelFiyat")+","
                +sepetSayfasi.findAndGetText("virguldenSonrakiGuncelFiyat")+" tl");
        sepetSayfasi.setUrunRengi1(sepetSayfasi.findAndGetText("urunRengi"));

    }

    @And("sepete ekle butonuna tiklanir")
    public void sepeteEkleButonunaTiklanir(DataTable elements)
    {
        Log.info("Sepete Ekle Butonunua Tıklanır");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            sepetSayfasi.findAndClick(listElement.get(i));
        }
    }

    @And("acilan pencere kapatilir")
    public void acilanPencereKapatilir(DataTable elements)
    {
        Log.info("Açılan Pencere Kapatılır");
        sepetSayfasi.findAndWaitVisibleOfElement("urunSepetinizdeMesaji");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            sepetSayfasi.findAndClick(listElement.get(i));
        }
    }

    @And("baska satici varsa ilkine tiklanir")
    public void baskaSaticiVarsaIlkineTiklanir(DataTable elements)
    {
        Log.info("Ürünün Başka Satıcısı Var İse İlkine Tıklanır");
        Assert.assertEquals(sepetSayfasi.findAndGetText2("digerSaticilarVarMi"),"diğer satıcılar -");

        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            sepetSayfasi.findAndClick(listElement.get(i));
        }
    }

    @And("urunun bilgileri ikinci satici icin kayit edilir")
    public void urununBilgileriIkinciSaticiIcinKayitEdilir()
    {
        Log.info("Ürünün Bilgileri İkinci Satıcı İçin Kayıt Edilir");
        sepetSayfasi.setUrunAdi2(sepetSayfasi.findAndGetText("urunAdi"));
        sepetSayfasi.setSaticiAdi2(sepetSayfasi.findAndGetText("saticiAdi"));
        sepetSayfasi.setVirguldenOncekiGuncelFiyat2(sepetSayfasi.findAndGetText("virguldenOncekiGuncelFiyat"));
        sepetSayfasi.setVirguldenSonrakiGuncelFiyat2(sepetSayfasi.findAndGetText("virguldenSonrakiGuncelFiyat"));
        sepetSayfasi.setUrunFiyati2(sepetSayfasi.findAndGetText("virguldenOncekiGuncelFiyat")+","
                +sepetSayfasi.findAndGetText("virguldenSonrakiGuncelFiyat")+" tl");
        sepetSayfasi.setUrunRengi2(sepetSayfasi.findAndGetText("urunRengi"));
    }

    @And("sepetim butonuna tiklanir")
    public void sepetimButonunaTiklanir(DataTable elements)
    {
        Log.info("Sepetim Butonuna Tıklanır");
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i <listElement.size(); i++)
        {
            sepetSayfasi.findAndClick(listElement.get(i));
        }
    }
    @And("sepetteki urunlerin bilgileri ilk satici icin kayit  edilir")
    public void sepettekiUrunlerinBilgileriIlkSaticiIcinKayitEdilir()
    {
        Log.info("Sepetteki Ürünlerin Bilgileri İlk Satıcı İçin Kayıt Edilir");
        sepetSayfasi.setSepetUrunAdi1(sepetSayfasi.findAndGetText("sepettekiUrunAdi1"));
        sepetSayfasi.setSepetSaticiAdi1(sepetSayfasi.findAndGetText("sepettekiSaticiAdi1"));
        sepetSayfasi.setSepetGuncelFiyat1(sepetSayfasi.findAndGetText("sepettekiGuncelFiyat1"));
        sepetSayfasi.setSepetUrunRengi1(sepetSayfasi.findAndGetText("sepettekiUrunRengi1"));
    }

    @And("sepetteki urunlerin bilgileri ikinci satici icin kayit  edilir")
    public void sepettekiUrunlerinBilgileriIkinciSaticiIcinKayitEdilir()
    {
        Log.info("Sepetteki Ürünlerin Bilgileri İkinci Satıcı İçin Kayıt Edilir");
        sepetSayfasi.setSepetUrunAdi2(sepetSayfasi.findAndGetText("sepettekiUrunAdi2"));
        sepetSayfasi.setSepetSaticiAdi2(sepetSayfasi.findAndGetText("sepettekiSaticiAdi2"));
        sepetSayfasi.setSepetGuncelFiyat2(sepetSayfasi.findAndGetText("sepettekiGuncelFiyat2"));
        sepetSayfasi.setSepetUrunRengi2(sepetSayfasi.findAndGetText("sepettekiUrunRengi2"));
    }
    @And("secilen urunun dogru olarak eklendigi sepetim sayfasinda dogrulanir")
    public void secilenUrununDogruOlarakEklendigiSepetimSayfasindaDogrulanir()
    {
        Log.info("Sepete Eklenen Ürünlerin Doğru Olarak Eklendiği Sepetim Sayfasında Doğrulanır");
        Assert.assertEquals(sepetSayfasi.getUrunAdi1(), sepetSayfasi.getSepetUrunAdi1());
        Assert.assertEquals(sepetSayfasi.getSaticiAdi1(), sepetSayfasi.getSepetSaticiAdi1());
        Assert.assertEquals(sepetSayfasi.getUrunFiyati1(), sepetSayfasi.getSepetGuncelFiyat1());
        Assert.assertEquals(sepetSayfasi.getUrunRengi1(), sepetSayfasi.getSepetUrunRengi1());
        Assert.assertEquals(sepetSayfasi.getUrunAdi2(), sepetSayfasi.getSepetUrunAdi2());
        Assert.assertEquals(sepetSayfasi.getSaticiAdi2(), sepetSayfasi.getSepetSaticiAdi2());
        Assert.assertEquals(sepetSayfasi.getUrunFiyati2(), sepetSayfasi.getSepetGuncelFiyat2());
        Assert.assertEquals(sepetSayfasi.getUrunRengi2(), sepetSayfasi.getSepetUrunRengi2());
    }

    @And("sepetteki tum urunler sepetten cikarilir")
    public void sepettekiTumUrunlerSepettenCikarilir()
    {
        Log.info("Sepetteki Tüm Ürünler Sepetten Çıkartılır");
        for (int i = 0; i < 2; i++) {
            sepetSayfasi.findAndClickWithoutScroll("sepettekiIlkUrunSilme");
            sepetSayfasi.findAndWaitUntilInvisibilityOfElement("sepettekiIkinciUrun");
        }

    }
}

