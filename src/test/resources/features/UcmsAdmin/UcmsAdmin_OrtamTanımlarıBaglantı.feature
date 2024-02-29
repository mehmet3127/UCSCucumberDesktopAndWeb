@OrtamTanımlarıBaglantı
Feature:Ortam Tanımları Baglantı

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Ortam Tanımları butonuna tıklar
    And Bağlantı sekmesine tıklar


  @AynıİsimleBaglantıEkleme
  Scenario:TC_002 Aynı isimle bağlantı ekleme

    And Ekle ikonuna tıklar
    And Aynı isimde bağlantı adı "testconn" girilir
    And Bağlantı tipi combosundan MSSQL seçilir
    And Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    And Test başarılı yazısını doğrular
    And Kaydet butonunun aktif olduğu görülür
    And Kaydet butona tıklar
    Then Bu isimde bir kayıt var uyarsı alır
    #Aynı isimde baglantı ekleme yapmaması gerekirken ekleme yapılıyor


  @FormatHatalıConnectionStringİleBaglantıEkleme
  Scenario:TC_003 Format hatalı connection string ile bağlantı ekleme

    And Ekle ikonuna tıklar
    And Bağlantı adı "testconn" girilir
    And Bağlantı tipi combosundan MSSQL seçilir
    And Hatalı Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    Then Format uygun değil uyarısı aldığı görülür.


  @İçerikHatalıConnectionStringİleBaglantıEkleme
  Scenario:TC_004 İçerik hatalı connection string ile bağlantı ekleme

    And Ekle ikonuna tıklar
    And Bağlantı adı "testconn" girilir
    And Bağlantı tipi combosundan MSSQL seçilir
    And İçerik hatalı Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    Then Format uygun değil uyarısı aldığı görülür.


  @BaglantıAdıBoşBırakarakKayıtEkleme
  Scenario:TC_005 Bağlantı adı boş bırakılarak kayıt ekleme

    And Ekle ikonuna tıklar
    And Bağlantı adı "" girilir
    And Bağlantı tipi combosundan MSSQL seçilir
    And Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    Then Bağlantı adı boş bırakılamaz uyarısı görülür
    #Baglantı adını boş bırakarak baglantı ekleyince "boş bırakılamaz" uyarısı çıkmıyor


  @BaglantıEkleme
  Scenario: TC_001 Bağlantı ekleme

    And Ekle ikonuna tıklar
    And Bağlantı adı "testconn" girilir
    And Bağlantı tipi combosundan MSSQL seçilir
    And Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    And Test başarılı yazısını doğrular
    And Kaydet butonunun aktif olduğu görülür
    And Kaydet butona tıklar
    Then İşlemin tamamlandığını doğrular


  @FormatHatalıConnectionStringİleBaglantıGüncelleme
  Scenario:TC_003 Format hatalı connstirng ile bağlantı güncelleme

    And Güncellemek istediği baglantının "" düzenle ikonuna tıklar
    And Hatalı Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    Then Format uygun değil uyarısı aldığı görülür.


  @İçerikHatalıConnectionStringİleBaglantıGüncelleme
  Scenario:TC_003 İçerik hatalı connstirng ile bağlantı güncelleme

    And Güncellemek istediği baglantının "" düzenle ikonuna tıklar
    And İçerik hatalı Bağlantı Cümlesi girilir
    And Bağlantıyı test et butonuna tıklar
    Then Format uygun değil uyarısı aldığı görülür.



  @ignore
  @AynıİsimleBaglantıGüncelleme
  Scenario:TC_002 Aynı isimle bağlantı Güncelleme

    And Güncellemek istediği baglantının "testconn1" düzenle ikonuna tıklar
    And Aynı isimde bağlantı adı "testconn1" girilir
    And Güncelle butonuna tıklar.
    Then Bu isimde bir kayıt var uyarsı alır
    #Aynı isimde baglantı ekleme yapmaması gerekirken ekleme yapılıyor


  @BaglantıAdıGüncelleme
  Scenario:TC_002 Bağlantı Adı Güncelleme

    And Güncellemek istediği baglantının "" düzenle ikonuna tıklar
    And Bağlantı adı "testconn" girilir
    And Güncelle butonuna tıklar.
    Then İşlemin tamamlandığını doğrular


  @BağlantıSilmeltenVazgeç
  Scenario:TC_002 Ekli bağlantıyı silmekten vazgeçme

    And Silmek istediği baglantının "testconn1" sil ikonuna tıklar
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Baglantının silinmediğini doğrular


  @BağlantıSilme
  Scenario:TC_001 Ekli bağlantıyı silme

    And Silmek istediği baglantının "testconn1" sil ikonuna tıklar
    And Onay butonuna tıklar
    Then Baglantının silindiğini doğrular










































