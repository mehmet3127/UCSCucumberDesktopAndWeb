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
      | grupAdı       |
      | KodGrubuSilmeDeneme4 |

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

  @KodGrubuSilme
  Scenario: TC_001-TC_002 Kod Grubu Silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Silmek istediği kod grubunun sil ıkonuna tıklar
    Then Kod grubunun silindiğini doğrular





