Feature: Vrei setleri İlişkili Veriler

  @VeriEkleme
  Scenario:TC_001 Uygun formatta veri ekleme
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And İlişkili veriler sekmesine tıklar
    And Ekle ıkonuna  tıklar
    And Uygun formatta bir dosyayı "C:\Users\demir\OneDrive\Masaüstü\Excel.xlsx" seçer
    And Dosyanın eklendiğini "Excel.xlsx" doğrular














