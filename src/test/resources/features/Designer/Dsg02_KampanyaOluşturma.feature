Feature:Kampanya

  Background: Designer Login Steps
    Given Kullanici designer sayfasina gider
    When Kullanici gecerli username girer
    And Kullanici gecerli password girer
    And Kullanici login buttonuna tıklar


  @KampanyaOluşturma
  Scenario:UCMS-TC-49 Kampanya Oluşturma

    And Kullanıcı Campaigns klasörüne tıklar
    And Kampanyanin eklenecegi klasöre "Test" sag tiklar
    And Kullanıcı Kampanya ekle ye tıklar
    And Kullanıcı Kampanya adıni "OTOMASYON_" girer
    And Kullanıcı arama tipini "Outbound" secer
    And Kullanıcı kaydet butonuna tıklar
    Then Kampanyanin eklendigini dogrular

  @KampanyaGoruntuleme
  Scenario:UCMS-TC-53 Kampanya Goruntuleme
    Given Islem yapilacak olan "OTOMASYON_12" kampanya secilir
    And Kullanıcı kampanya modunu secer
    And Varsayılan sonuç kodu için seç butonuna tıklar
    And Kullanıcı varsayılan sonuç kodunu "Mesgul" secer
    And Tamam butonuna tıklar
    Then Kullanıcı kaydet butonuna tıklar


  @KampanyaVersiyonYayinlama
  Scenario:UCMS-TC-53 Kampanya Goruntuleme
    Given Islem yapilacak olan "OTOMASYON_59" kampanya secilir
    And Kullanıcı kampanya modunu secer

  @KampanyaKopyalama
  Scenario: UCMS-TC-109 Kampanya Kopyalama
    Given Kopyalanacak olan "OTOMASYON_59" kampanyaya sag tiklanir
    And Kampanya kopyala secenegine tiklanir
    And Kullanıcı Kampanya adıni "OTOMASYON_" girer
    And Kampanyanin eklenecegi klasor secilir
    And Kullanıcı arama tipini "Outbound" secer
    And Kullanıcı kaydet butonuna tıklar
    And Onay penceresinde Evet'e tiklar
    Then Kampanyanin kopyalandigini dogrular



