Feature:Kampanyalar

  Background: Designer Login Steps
    Given Kullanici designer sayfasina gider
    When Kullanici gecerli username girer
    And Kullanici gecerli password girer
    And Kullanici login buttonuna tıklar


  @KampanyaOluşturma
  Scenario: UCMS-TC-49 Kampanya Oluşturma

    And Kullanıcı Campaigns klasörüne tıklar
    And Kampanyanin eklenecegi klasöre "Test" sag tiklar
    And Kullanıcı Kampanya ekle ye tıklar
    And Kullanıcı Kampanya adıni "OTOMASYON_" girer
    And Kullanıcı arama tipini "Outbound" secer
    And Kullanıcı kaydet butonuna tıklar
    Then Kampanyanin eklendigini dogrular

  @KampanyaGoruntuleme
  Scenario: UCMS-TC-53 Kampanya Goruntuleme

    Given Islem yapilacak olan "OTOMASYON_59" kampanya secilir
    And Kampanya modu secilir
    And Varsayılan sonuç kodu için seç butonuna tıklar
    And Kullanıcı varsayılan sonuç kodunu "Mesgul" secer
    And Tamam butonuna tıklar
    Then Kullanıcı kaydet butonuna tıklar

  @YayinlanmamisVersiyonSilme
  Scenario: UCMS-TC-658: Versiyon Silme
    Given Islem yapilacak olan "OTOMASYON_599" kampanyaya sag tiklanir
    And Versiyon sil butonuna tiklanir
    And Versiyon "1" satırına tıklanir
    And Tamam butonuna tıklar
    And Onay penceresinde Evet butonuna tiklar
    Then Tamam butonuna tıklar

  @KampanyaVersiyonOlusturma
  Scenario: UCMS-TC-649 Versiyon Oluşturma

    Given Islem yapilacak olan "OTOMASYON_59" kampanyaya sag tiklanir
    And Versiyon olustur butonuna tiklanir

  @KampanyaKopyalama
  Scenario: UCMS-TC-109 Kampanya Kopyalama

    Given Islem yapilacak olan "OTOMASYON_59" kampanyaya sag tiklanir
    And Kampanya kopyala secenegine tiklanir
    And Kullanıcı Kampanya adıni "OTOMASYON_" girer
    And Kampanyanin eklenecegi klasor secilir
    And Kullanıcı arama tipini "Outbound" secer
    And Kullanıcı kaydet butonuna tıklar
    And Onay penceresinde Evet'e tiklar
    Then Kampanyanin kopyalandigini dogrular

  @VersiyonYayinlanmisKampanyayiKopyalama
  Scenario:UCMS-TC-654 Versiyon Yayinlanmis Kampanyayi Kopyalama

    Given Islem yapilacak olan "OTOMASYON_59" kampanyaya sag tiklanir
    And Kampanya kopyala secenegine tiklanir
    And Versiyon "1" satırına tıklanir
    And Tamam butonuna tıklar
    And Kullanıcı Kampanya adıni "OTOMASYON_" girer
    And Kampanyanin eklenecegi klasor secilir
    And Kullanıcı arama tipini "Outbound" secer
    And Kullanıcı kaydet butonuna tıklar
    And Onay penceresinde Evet'e tiklar
    Then Kampanyanin kopyalandigini dogrular

  @VersiyonYayinlanmisKampanyayiDuzenleme
  Scenario:UCMS-TC-661: Versiyon Yayinlanmis Kampanyayi Düzenleme

    Given Islem yapilacak olan "OTOMASYON_59" kampanyaya sag tiklanir
    And Kampanya duzenle butonuna tiklanir
    And Versiyon "1" satırına tıklanir
    And Tamam butonuna tıklar
    And Kampanya modu secilir

  @KampanyaVersiyonYayinlama
  Scenario: UCMS-TC-648 Versiyon Yayınlama

    Given Islem yapilacak olan "OTOMASYON_59" kampanya secilir
    And Kampanya modu secilir
    And Kontrol ettim checkbox'ı işaretlenir
    And Versiyon Yayınla butonuna tıklanır
    Then Onay penceresinde Evet butonuna tiklar



