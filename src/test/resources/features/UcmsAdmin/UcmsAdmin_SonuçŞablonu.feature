@SonuçŞablonu
Feature: Sonuç Şablonu Ekleme-Düzenleme-Arama

  @SonuçKoduSeçmedenŞablonEkleme
  Scenario: TC_001 Sonuç kodu seçmeden sonuç şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Sonuç şablonu ekleme ıkonun tıklar
    And Şablon adı girer
    And Kaydet butonuna tıklar
    Then Sonuç kodu seçiniz uyarısını doğrular

  @SonuçKoduSeçerekŞablonEkleme
  Scenario: TC_002 Sonuç kodu seçerek sonuç şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Sonuç şablonu ekleme ıkonun tıklar
    And Şablon adı girer
    And Sonuç kodu seçer
    And Kaydet butonuna tıklar
    Then Sonuç şablonu eklendi yazısını doğrular


  @SonuçŞablonuİsmiİleArama
  Scenario: TC_001 Sonuç Şablonu İsmi İle İçerikten Arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And İçerik ara searchbox ına tıklar
    And Var olan sonuç şablonunun ismini girer
    Then Var olan sonuç şablonunun olduğunu doğrular

  @SonuçŞablonuIdİleArama
  Scenario: TC_001 Sonuç Şablonu İsmi İle İçerikten Arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And İçerik ara searchbox ına tıklar
    And Var olan sonuç şablonunun ıd sini girer
    Then Id ile aranan sonuç şablonunun olduğunu doğrular

  @SonuçŞablonuDüzenleme1
  Scenario: TC_001 Seçili sonuç kodlarını kaldırarak sonuç şablonunu düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Düzenlemek istediği sonuç şablonunun "şablonGüncellendi" düzenle ikonuna tıklar
    And Seçili olan sonuç kodu seçeneğini kaldırır
    And Kaydet butonuna tıklar
    And Sonuç kodu seçiniz uyarısını doğrular

  @SonuçŞablonuDüzenleme2
  Scenario: TC_002 Şablon adını değiştirerek sonuç şablonunu düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Düzenlemek istediği sonuç şablonunun "SonuçŞablonuGüncellendi" düzenle ikonuna tıklar
    And Şablon adını "SonuçŞablonuGüncellendi2" değiştirir
    And Kaydet butonuna tıklar
    And Sonuç şablonu güncellendi yazısnı doğrular


  @SonuçŞablonlarılisteleme1
  Scenario:TC_001 Tüm(aktif/pasif) sonuç şablonlarını listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And İnaktif sonuç şablonları listelenir









