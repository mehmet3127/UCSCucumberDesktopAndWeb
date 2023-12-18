@AltGrupEkleme
Feature: Kod Grubu Ekleme ve Alt Grup Ekleme

  @AltGrupEklemeİçinKodGrubuEkleme
  Scenario Outline:TC_001 Kod Grubu Ekleme

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
      | grupAdı     |
      |AltGrupdeneme03|



  @AltGrupEkleme
  Scenario: TC_001 Alt Grup Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Eklenen kod grubunun alt grup ekle ikonuna tıklar
    And Alt grup ekle modalı açılır.
    And Geçerli bir başlık girilir.
    And Kaydet butonuna tıklanır.
    Then Başarılı bir şekilde kaydedildiği doğrulanır.

  @BaşlıkEklemedenAltGrupEkleme
  Scenario:TC_002 Başlık Eklemeden Alt Grup Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Eklenen kod grubunun alt grup ekle ikonuna tıklar
    And Alt grup ekle modalı açılır.
    And Kaydet butonunun aktif olmadığı görülür

  @AltGrupPenceresiKapat
  Scenario:TC_003 Alt Grup Penceresi Kapatma

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Eklenen kod grubunun alt grup ekle ikonuna tıklar
    And Alt grup ekle modalı açılır.
    And Kapat butonuna tıklanarak menü kapatılır.