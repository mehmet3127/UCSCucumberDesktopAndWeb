Feature: Vrei setleri İlişkili Veriler

  @UygunFormattaVeriEkleme
  Scenario:TC_001 Uygun formatta veri ekleme
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Ekle ikonuna tıklar
    And Bir dosya "C:\Users\demir\OneDrive\Masaüstü\eklenenDosya.xlsx" seçer
    Then Dosyanın eklendiğini "eklenenDosya.xlsx" doğrular

  @UygunOlmayanFormattaVeriEkleme
  Scenario:TC_002 Uygun olmayan formatta veri ekleme
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Ekle ikonuna tıklar
    And Bir dosya "C:\Users\demir\OneDrive\Masaüstü\Uygulama Bazlı Test Senaryo Raporu.xlsx" seçer
    Then Dosya formatının uygun olmadığı uyarısını doğrular

  @AynıİsimdeVeriEkleme
  Scenario:TC_003 Aynı isimde veri ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Ekle ikonuna tıklar
    And Bir dosya "C:\Users\demir\OneDrive\Masaüstü\eklenenDosya.xlsx" seçer
    Then Bu dosya adında bir kayıt zaten var uyarısını doğrular

  @UygunFormattaVeriDeğişikliği
  Scenario:TC_001 Uygun formatta veri ile değişiklik yapma

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Değiştirmek istediği verinin "eklenenVeri" düzenle ıkonuna  tıklar
    And Değişiklik yapmak istediğinizden eminmisiniz uyarısını onaylar
    And Bir dosya "C:\Users\demir\OneDrive\Masaüstü\dataDosyası.xlsx" seçer
    Then Dosyanın eklendiğini "dataDosyası.xlsx" doğrular

  @UygunOlmayanFormattaVeriDeğişikliği
  Scenario:TC_002	Uygun olmayan formatta veri ile değişiklik yapma

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Değiştirmek istediği verinin "dataDosyası" düzenle ıkonuna  tıklar
    And Değişiklik yapmak istediğinizden eminmisiniz uyarısını onaylar
    And Bir dosya "C:\Users\demir\OneDrive\Masaüstü\Uygulama Bazlı Test Senaryo Raporu.xlsx" seçer
    Then Dosya formatının uygun olmadığı uyarısını doğrular


  @AynıİsimdeVeriDeğişikliği
  Scenario:TC_003 Aynı isimde veri ile değişiklik yapma

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Değiştirmek istediği verinin "dataDosyası" düzenle ıkonuna  tıklar
    And Değişiklik yapmak istediğinizden eminmisiniz uyarısını onaylar
    And Bir dosya "C:\Users\demir\OneDrive\Masaüstü\dataDosyası.xlsx" seçer
    Then Bu dosya adında bir kayıt zaten var uyarısını doğrular


  @İsimİleVeriArama
  Scenario:TC_001 İsmi ile Veri arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And İçerik ara searchbox ına tıklar
    And Var olan veri ismini "dataDosyası" girer
    Then Var olan verinin olduğunu doğrular

  @Dosyaİndirme
  Scenario:TC_001 Dosya indirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And İndirmek istediği dosyanın "dataDosyası.xlsx" dosya indir ıkonuna tıklar
    Then Dosyanın indirildiğini doğrular


  @VeriSilme
  Scenario:TC_001 Veri silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Silmek istediği verinin "dataDosyası" sil ikonuna tıklar
    And Dosyayı silmek istediğinizden eminmisiniz uyarısını onaylar
    And Dosyanın silindiğini doğrular





















