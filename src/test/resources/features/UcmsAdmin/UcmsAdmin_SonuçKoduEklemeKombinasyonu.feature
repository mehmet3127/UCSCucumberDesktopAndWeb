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
    Then Kaydete tıklar
    And Sonuç kodunun eklendiğini görür

    Examples:
      | isim |
      |otmsyn15|

