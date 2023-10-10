@KodGrubuAltGrupEkleme
Feature: Kod Grubu Ekleme

  @KodGrubuEkleme
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
      | otomasyon07 |

  @AltGrupEkleme
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
