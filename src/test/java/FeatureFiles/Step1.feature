Feature: Hepsiburada Step1

  @SmokeTest
  Scenario: Hepsiburada.com'a gidilir, üye girişi yapılır, herhangibir ürün aratilir,
  aratılan ürün sepete eklenir ve aynı ürünü başka bir satıcı tarafından da sepete eklenir,
  seçilen ürün sepetim sayfasında doğrulanır, sepetteki ürünler sepetten  çıkarılır

    Given web sitesine gidilir

    And cerezler kapatilir
      | cerezleriKapat |
    And giris yap veya uye ol penceresine tiklanir
      | girisYapveyaUyeOl |

    And giris yap butonuna tiklanir
      | girisYap |

    And facebook ile giris yap butonuna tiklanir
      | facebookIleGirisYap |

    And email adresi girilir
      | eMail | bhky1994@gmail.com |

    And sifre girilir
      | sifre | 1234567Q |

    And giris yap butonuna tiklanir
      | girisYapButonu |

    And kullanici giris isleminin yapildigi dogrulanir
      | girisDogrulama | HESABIM |

    And arama kutucuguna aranacak urun girilir
      | aramaKutucugu | Acer Aspire 3 A315-56-327T |

    And ara butonuna tiklanir
      | aramaButonu |

    And cikan urune tiklanir
      | urun |

    And acilan diger sayfaya gecilir

    And urunun bilgileri ilk satici icin kayit edilir

    And sepete ekle butonuna tiklanir
      | sepeteEkle |

    And acilan pencere kapatilir
      | pencereKapatma |

    And baska satici varsa ilkine tiklanir
      | digerIlkSatici |

    And urunun bilgileri ikinci satici icin kayit edilir

    And sepete ekle butonuna tiklanir
      | sepeteEkle |

    And acilan pencere kapatilir
      | pencereKapatma |

    And sepetim butonuna tiklanir
      | sepetim |

    And sepetteki urunlerin bilgileri ilk satici icin kayit  edilir

    And sepetteki urunlerin bilgileri ikinci satici icin kayit  edilir

    And secilen urunun dogru olarak eklendigi sepetim sayfasinda dogrulanir

    And sepetteki tum urunler sepetten cikarilir
