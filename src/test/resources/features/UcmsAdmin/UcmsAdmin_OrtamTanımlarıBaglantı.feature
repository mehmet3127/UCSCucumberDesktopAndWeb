@OrtamTanımlarıBaglantı
Feature:Ortam Tanımları Baglantı

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Ortam Tanımları butonuna tıklar
    And Bağlantı sekmesine tıklar

  @BaglantıEkleme
  Scenario: TC_001 Bağlantı ekleme

    And Ekle ikonuna tıklar
    And Bağlantı adı "testconn1" girilir
    And Bağlantı tipi combosundan MSSQL seçilir
    And Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    And Test başarılı yazısını doğrular
    And Kaydet butonunun aktif olduğu görülür
    And Kaydet butona tıklar
    Then İşlemin tamamlandığını doğrular












