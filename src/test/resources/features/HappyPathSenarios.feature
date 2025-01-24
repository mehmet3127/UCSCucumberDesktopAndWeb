@HappyPathSenario
Feature: HappyPathSenario_UcmsAdmin_Designer


  @HappyPathUcmsAdmin
  Scenario:UCMS-TC-1553: Ucms Otomasyon testi/UcmsAdmin

    #Kod Grubu Ekleme
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Kod grubu ekle ıkon a tıklar
    And CRM ıd "test_automation" girilir
    And Grup adı "test_automation" ekler
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Kod grubunun eklendigini dogrular
    #Sonuc Kodu Ekleme
    And Eklenen kod grubunun sonuç kodu ekle ikonuna tıklar
    And Başlık bilgisi "automation_closed_resultcode" girilir
    And Varsa Bilgilendirme notu bilgisi girilir
    And Varsa Aciklama bilgisi girilir
    And CRM sonuc kodu "automation_closed_resultcode" girilir
    And Aksiyon tipi "Kaydı Kapat" secilir
    And Genel özellikler tabına geçer
    And Başarı durumu "Kriter Dışı" secilir
    And Musteriye ulasilma durumu "Müşteriye Ulaşılamadı" secilir
    And Musteriye temas durumu "Müşteriye Temas Edildi" secilir
    And Varsa CTI sonuc kodu "Cevaplandı (33) " secilir
    And Kaydete tıklar
    Then Sonuç kodunun eklendiğini görür
    #Veri Seti Ekleme
    And Veri setleri menusune tiklanir
    And Veri setleri sekmesine tiklanir
    And Veri seti ekle ikonuna tiklanir
    And Form alan tipi "TextBox" secilir
    And Veri tipi "Karakter" secilir
    And Alan adi "automation_txt_char30" girilir
    And Etiket adi "automation_txt_char30" girilir
    And Db adi "automation_txt_char30" girilir
    And Veri kaynagi alan adi "automation_txt_char30" girilir
    And Aciklama "created by automation" girilir
    And Özellikler sekmesine tiklanir
    And Maksimum veri uzunlugu 30 girilir
    And Kaydet butonuna tıklar.
    Then Veri setinin eklendiğini doğrular
    And Sag ustte profil iconuna tiklanir
    And Cikis butonuna tıklanir
    Then Logout isleminin yapildigi ve login sayfasinin geldigi gorulur



  @HappyPathDesigner
  Scenario: UCMS-TC-49 Kampanya Oluşturma

    Given Designer uygulamasina gidilir
    When UserName "userName" girilir
    And Password "password" girilir
    And Uygulama sunucu ve port bilgileri icin detay butonuna tıklanır
    And Kullanıcı uygulama adını "uygulamaAdi" gırer
    And Server name "serverName" girilir
    And Port bilgisi "port" girilir
    And Login butonuna tıklanir.
    Then Designer ana sayfasina gidildiği gorulur
    And Campaigns klasörüne tıklanir
    And Kampanyanin eklenecegi klasöre "Test" sag tiklanir
    And Kampanya ekle ye tıklanir
    And Kampanya adi "OTOMASYON_" girilir
    And Arama tipi "Outbound" secilir
    #And Kaydet butonuna tıklanir
    #Then Kampanyanin eklendigini dogrular
