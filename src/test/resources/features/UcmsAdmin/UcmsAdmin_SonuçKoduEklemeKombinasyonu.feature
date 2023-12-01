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
      | isim                  |
      |                       |
      | sonuçKoduOtomasyonu1  |
      | sonuçKoduOtomasyonu2  |
      | sonuçKoduOtomasyonu3  |
      | sonuçKoduOtomasyonu4  |
      | sonuçKoduOtomasyonu5  |
      | sonuçKoduOtomasyonu6  |
      | sonuçKoduOtomasyonu7  |
      | sonuçKoduOtomasyonu8  |
      | sonuçKoduOtomasyonu9  |
      | sonuçKoduOtomasyonu10 |
      | sonuçKoduOtomasyonu11 |
      | sonuçKoduOtomasyonu12 |
      | sonuçKoduOtomasyonu13 |
      | sonuçKoduOtomasyonu14 |
      | sonuçKoduOtomasyonu15 |
      | sonuçKoduOtomasyonu16 |
      | sonuçKoduOtomasyonu17 |
      | sonuçKoduOtomasyonu18 |
      | sonuçKoduOtomasyonu19 |
      | sonuçKoduOtomasyonu20 |
      | sonuçKoduOtomasyonu21 |
      | sonuçKoduOtomasyonu22 |
      | sonuçKoduOtomasyonu23 |
      | sonuçKoduOtomasyonu24 |
      | sonuçKoduOtomasyonu25 |
      | sonuçKoduOtomasyonu26 |
      | sonuçKoduOtomasyonu27 |
      | sonuçKoduOtomasyonu28 |
      | sonuçKoduOtomasyonu29 |
      | sonuçKoduOtomasyonu30 |
      | sonuçKoduOtomasyonu31 |
      | sonuçKoduOtomasyonu32 |
      | sonuçKoduOtomasyonu33 |
      | sonuçKoduOtomasyonu34 |
      | sonuçKoduOtomasyonu35 |
      | sonuçKoduOtomasyonu36 |
      | sonuçKoduOtomasyonu37 |
      | sonuçKoduOtomasyonu38 |
      | sonuçKoduOtomasyonu39 |
      | sonuçKoduOtomasyonu40 |
      | sonuçKoduOtomasyonu41 |
      | sonuçKoduOtomasyonu42 |
      | sonuçKoduOtomasyonu43 |
      | sonuçKoduOtomasyonu44 |
      | sonuçKoduOtomasyonu45 |
      | sonuçKoduOtomasyonu46 |
      | sonuçKoduOtomasyonu47 |
      | sonuçKoduOtomasyonu48 |
