@SonuçKoduEkleme
Feature: Sonuç Kodu Ekleme


  Scenario Outline: TC001 Kodu Grubu Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Kod grubu ekle ıkon a tıklar
    And Grup adı "<grupAdı>" ekler
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Sayfayı kapatır
    Examples:
      | grupAdı     |
      | otmasyon_05 |


  Scenario: Alt Grup Ekleme
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

  @KapatıcısonuçKoduEkleme
  Scenario: TC002 Kapatıcı Sonuç Kodu Ekleme

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








