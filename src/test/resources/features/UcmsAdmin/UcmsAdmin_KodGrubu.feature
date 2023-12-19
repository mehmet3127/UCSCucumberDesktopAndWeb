@KodGrubu
Feature: Kod Grubu

  @KodGrubuEkleme
  Scenario Outline:TC_001-TC_002 Kod Grubu Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Kod grubu ekle ıkon a tıklar
    And Crm ıd alanını null geçer
    And Grup adı "<grupAdı>" ekler
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Sayfayı kapatır
    Examples:
      | grupAdı               |
      | AltGrupPencereKapat01 |


  @SonuçKoduOlanKodGrubunuSilme
  Scenario:Kod Grubu Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Eklenen kod grubunun sonuç kodu ekle ikonuna tıklar
    And Başlık kısmına isim girer
    And Aksiyon tipi combo suna tıklanır
    And Açılan pencereden kaydı kapat sekmesine tıklar
    And Genel özellikler tabına geçer
    And Başarı durumu combosunda kriter dışını seçer
    And Müşteriye ulaşılma durumundan müşteriye ulaşılamadı seçer
    And Müşteri temas durumundan temas edilemedi seçer
    And Kaydete tıklar


  @SonuçKoduOlmayanKodGrubuSilme
  Scenario: TC_001 Sonuç Kodu Olmayan Kod Grubunu Silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Silmek istediği kod grubunun sil ıkonuna tıklar
    Then Kod grubunun silindiğini doğrular

  @SonuçKoduOlanKodGrubuSilme
  Scenario: TC_002 Sonuç Kodu Olan Kod Grubunu Silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Silmek istediği sonuç kodu olan kod grubunun sil Ikonuna tıklar
    Then Kod grubunun silinemediğini doğrular

  @KodGrubuGüncelleme
  Scenario: TC_001 Bilgileri değiştirerek kod grubu güncelleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Güncellemek istediği kod grubunun "grupAdı" grup güncelle ıkonuna tıklar
    And Açılan pencereden grup adı "KG_Versiyon" ve crmId "crmId" alanını günceller
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Kod grubunun güncellendiğini doğrular

  @BoşBırakarakKodGrubuGüncelleme
  Scenario: TC_001 Bilgileri değiştirerek kod grubu güncelleme
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Güncellemek istediği kod grubunun "GrupGüncelleme" grup güncelle ıkonuna tıklar
    And Açılan pencereden bilgileri siler
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Zorunlu alanları doldurunuz uyarısını doğrular
    #otomasyon da crm ıd ve grup adı silinince Kaydet buttın pasif oluyor

  @KodGrubuVersiyonDeğiştirme
  Scenario: TC_001 Kod grubu versiyon değiştirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Güncellemek istediği kod grubunun "SonuçKoduOtomasyonu" grup güncelle ıkonuna tıklar
    And Açılan pencereden grup adı "KG_Versiyon02" ve crmId "crmId" alanını günceller
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Kod grubunun güncellendiğini doğrular
    And Güncellenen sonuç kodu grubunun versiyon ikonuna tıklar
    And Açılan pencerede tipi Oluşturma olan satırın Bu versiyonlar devam et ikonuna tıklar
    And Açılan pencerede tüm alanların pasif geldiğini görür
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    And Sonuç kodu grubunun güncellendiğini doğrular






