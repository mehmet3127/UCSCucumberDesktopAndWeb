@KampanyalarAramaLimitleri
Feature: Kampanyalar Sayfası-Arama Limitleri Menüsü

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Kampanyalar butonuna tıklar
    And Arama limitleri menüsüne tıklar


  @AramaLimitiEkleme
  Scenario:TC_001 Kampanyalara Arama Limiti Ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "9" girer
    And Arama sayısı "3" girer
    And Arama limitini eklemek istediği diğer "" kampanyayı seçer
    And Kaydet butonuna tıklar
    And Arama limitinin eklendiğini görür


  @KayıtGününüBoşBırakarakAramaLimitiEkleme
  Scenario:TC_002 Kayıt gününü alanını boş bırakarak kampanyalara arama limiti ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "" girer
    And Arama sayısı "3" girer
    And Kaydet butonuna tıklar
    And Birinci sıradaki Kayıt günü alanını doldurunuz uyarısını görür.


  @AramaSayısınıBoşBırakarakAramaLimitiEkleme
  Scenario:TC_003 Arama sayısı alanını boş bırakarak kampanyalara arama limiti ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "4" girer
    And Arama sayısı "" girer
    And Kaydet butonuna tıklar
    And Birinci sıradaki Arama sayısı alanını doldurunuz uyarısını görür


  @TümKampanyalaraAramaLimitiEkleme
  Scenario:TC_004 Eklemek istediğimiz arama limitini tüm kampanyalar için uygulama

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "8" girer
    And Arama sayısı "1" girer
    And Arama limitini eklemek istediği diğer "Tüm kampanyalara uygula" kampanyayı seçer
    And Kaydet butonuna tıklar
    And Arama limitinin eklendiğini görür


  @KayıtGünüSıfırGirilerekAramaLimitiEkleme
  Scenario:TC_005 Kayıt günü sıfır girerek kampanyalara arama limiti ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "" girer
    And Arama sayısı "1" girer
    And Kaydet butonuna tıklar
    And Birinci sıradaki Kayıt günü alanını doldurunuz uyarısını görür.


  @KayıtGünüBirAramaSayısıSıfırGirilerekAramaLimitiEkleme
  Scenario:TC_006	Kayıt günü bir Arama sayısı sıfır girilerek kampanyalara arama limiti ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "1" girer
    And Arama sayısı "0" girer
    And İlk gün limiti sıfır olamaz uyarısını görür.


  @FarklıSatırlardaAynıGünİçinAramaLimitiEkleme
  Scenario:TC_007	Farklı satırlarda aynı gün için kampanyalara arama limiti ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "4" girer
    And Arama sayısı "5" girer
    And Ekle butonuna tıklar
    And ikinci kayıt günü "4" girer
    Then Aynı gün için tek bir kayıt girilebilir uyarısı görür


  @AramaGünüAynıOlanAramaLimitiEkleme
  Scenario:TC_008 Kampanyaya önceden eklenmiş arama günü aynı olan arama limiti ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Kayıt günü "5" girer
    And Arama sayısı "3" girer
    And Arama limitini eklemek istediği diğer "" kampanyayı seçer
    And Kaydet butonuna tıklar
    And Aynı kayıt gününe ait farklı değer olduğu silinip yerine yazılacak uyarısını görür.
    #Kampanyaya önceden eklenmiş arama günü aynı olan arama limiti ekleme manuel olarak sıkıntı yok ama.Otomasyon ile ekleme yapıyor


  @AramaLimitiniSilme
  Scenario:TC_009 Eklenen arama limitini silme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Silmek istediği arama limitinin sil ikonuna tıklar
    And Onay butonuna tıklar
    Then Arama limitini silindiğini doğrular


  @SilinmişOlanAramaLimitleriniGösterme
  Scenario:TC_010Silinmiş olan arama limitlerini gösterme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Silinenleri göster butonunu aktif hale getirir
    Then Silinmiş olan arama limitlerini görür

























































