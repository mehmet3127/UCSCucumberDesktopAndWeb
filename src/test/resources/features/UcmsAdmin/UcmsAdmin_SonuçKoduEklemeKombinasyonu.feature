@SonuçKoduSenaryoOutline
Feature: Sonuç Kodu Ekleme Tüm Senaryolar

  Scenario Outline:Sonuç Kodu Ekleme Tüm Senaryolar

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    When Kullanıcı ucmsadmin için geçerli password girer
    Then Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Kod grubunun sonuç kodu ekle ikonuna tıklar
    And Başlık kısmına isim "<isim>" girer ve Aksiyon tipi-başarı durumu-müsteriye ulaşılma durumu-müşteriye temas durumunu seçer
    And Sonuç kodunun eklendiğini görür
    Then Kaydete tıklar
    Examples:
      | isim        |
      | DemoOtomasyon01 |
      | DemoOtomasyon02 |
      | DemoOtomasyon03 |
      | Otomasyon04 |
      | Otomasyon05 |
      | Otomasyon06 |
      | Otomasyon07 |
      | Otomasyon08 |
      | Otomasyon09 |
      | Otomasyon10 |
      | Otomasyon11 |
      | Otomasyon12 |
      | Otomasyon13 |
      | Otomasyon14 |
      | Otomasyon15 |
      | Otomasyon16 |
      | Otomasyon17 |
      | Otomasyon18 |
      | Otomasyon19 |
      | Otomasyon20 |
      | Otomasyon21 |
      | Otomasyon22 |
      | Otomasyon23 |
      | Otomasyon24 |
      | Otomasyon25 |
      | Otomasyon26 |
      | Otomasyon27 |
      | Otomasyon28 |
      | Otomasyon29 |
      | Otomasyon30 |
      | Otomasyon31 |
      | Otomasyon32 |
      | Otomasyon33 |
      | Otomasyon34 |
      | Otomasyon35 |
      | Otomasyon36 |
      | Otomasyon37 |
      | Otomasyon38 |
      | Otomasyon39 |
      | Otomasyon40 |
      | Otomasyon41 |
      | Otomasyon42 |
      | Otomasyon43 |
      | Otomasyon44 |
      | Otomasyon45 |
      | Otomasyon46 |
      | Otomasyon47 |
      | Otomasyon48 |


