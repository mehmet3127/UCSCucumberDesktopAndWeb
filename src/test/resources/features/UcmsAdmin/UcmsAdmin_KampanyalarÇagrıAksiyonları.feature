@KampanyalarÇagrıAksiyonları
Feature: Kampanyalar Sayfası-Çağrı Aksiyonları Menüsü

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Kampanyalar butonuna tıklar
    And Çağrı aksiyonları menüsüne tıklar


  @KoşulTipiArdışıkAksiyonTipiSmsGönderOlarakÇağrıAksiyonuEkleme
  Scenario:TC_001	Koşul tipi ardışık ve aksiyon tipi sms Gönder olarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Ardışık" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Göndermek istediği sms "sms" seçer
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @KoşulTipiArdışıkAksiyonTipiKayıtDurumuGüncelleOlarakÇağrıAksiyonuEkleme
  Scenario:TC_002 Koşul tipi ardışık ve aksiyon tipi kayıt durumu güncelle olarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Ardışık" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Kayıt durumu güncelle" seçer
    And Kayıt durumunu "İptal edildi" seçer
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @KoşulTipiArdışıkAksiyonTipiWebServisCagırOlarakÇağrıAksiyonuEkleme
  Scenario:TC_003 Koşul tipi ardışık ve aksiyon tipi web servis çağır olarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Ardışık" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Web Servis Çağır" seçer
    And Web servis linkini "http://test-linux.ucs.pvt:58027/login" ekler
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @KoşulTipiToplamAksiyonTipiSmsGönderOlarakÇağrıAksiyonuEkleme
  Scenario:TC_004 Koşul tipi toplam ve aksiyon tipi sms Gönder olarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Göndermek istediği sms "sms" seçer
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @KoşulTipiToplamAksiyonTipiKayıtDurumuGüncelleOlarakÇağrıAksiyonuEkleme
  Scenario:TC_002 Koşul tipi toplam ve aksiyon tipi kayıt durumu güncelle olarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Kayıt durumu güncelle" seçer
    And Kayıt durumunu "İptal edildi" seçer
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @KoşulTipiToplamAksiyonTipiWebServisCagırOlarakÇağrıAksiyonuEkleme
  Scenario:TC_003 Koşul tipi toplam ve aksiyon tipi web servis çağır olarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Web Servis Çağır" seçer
    And Web servis linkini "http://test-linux.ucs.pvt:58027/login" ekler
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @TümSonuçKodlarınıSeçerekÇağrıAksiyonuEkleme
  Scenario:TC_007 Tüm sonuç kodlarını seçerek çağrı aksiyonu Ekleme

    And Açılan pencereden "DENEME_AKISTEST" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Tüm sonuç kodları butonunu aktif hale getirir
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Göndermek istediği sms "Sablon Ekleme" seçer
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @TümKampanyalaraUygulayarakÇağrıAksiyonuEkleme
  Scenario:TC_008 Tüm kampanyalara uygulayarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Tüm kampanyalara uygula butonunu aktif hale getirir
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Kayıt durumu güncelle" seçer
    And Kayıt durumunu "İptal edildi" seçer
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür


  @SonuçKoduŞablonuSeçmedenÇağrıAksiyonuEkleme
  Scenario:TC_009 Sonuç kodu şablonu seçmeden çağrı aksiyonu Ekleme

    And Açılan pencereden "YASMIN_DENEME" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Göndermek istediği sms "sms" seçer
    And Kaydet butonuna tıklar
    Then Çağrı aksiyonunun eklendiğini görür
   #Sonuç kodu seçmeden çagrı askiyonu ekleme yaparken "Kaydet" button aktif olmamasına ragmen ekleme yapıyor
   # Sonuç kodu olarak "Tüm Sonuç Kodları" olarak ekleme yapıyor


  @KoşulTipiniSeçmedenSeçmedenÇağrıAksiyonuEkleme
  Scenario:TC_010 Koşul tipini seçmeden seçmeden çağrı aksiyonu Ekleme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Göndermek istediği sms "sms" seçer
    And Kaydet butonuna tıklar
    Then Birinci sıradaki Koşul Tipi alanını doldurunuz uyarısını görür


  @DeğerAlanınıBoşBırakarakÇağrıAksiyonuEkleme
  Scenario:TC_011 Değer alanını boş bırakarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Toplam" seçer
    And Değer "" ve dakika "5" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Göndermek istediği sms "sms" seçer
    And Kaydet butonuna tıklar
    Then Değer alanını doldurunuz uyarısını görür


  @DakikaAlanınıBoşBırakarakÇağrıAksiyonuEkleme
  Scenario:TC_012 Dakika alanını boş bırakarak çağrı aksiyonu Ekleme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Toplam" seçer
    And Değer "3" ve dakika "" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Göndermek istediği sms "sms" seçer
    And Kaydet butonuna tıklar
    Then Dakika alanını doldurunuz uyarısını görür


  @AksiyonTipiSeçmedenÇağrıAksiyonuEkleme
  Scenario:TC_013 Aksiyon tipi seçmeden çağrı aksiyonu Ekleme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Kaydet butonuna tıklar
    Then "Aksiyon Tipi" alanını doldurunuz uyarısını görür


  @TamplateSeçmedenÇağrıAksiyonuEkleme
  Scenario:TC_014	Seçilen aksiyon tipine uygun tamplate seçmeden çağrı aksiyonu Ekleme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sonuç kodu şablonu "DemirDeneme01Güncellendi" seçer
    And Koşul tipini "Toplam" seçer
    And Değer "2" ve dakika "5" girer
    And Aksiyon tipini "Sms gönder" seçer
    And Kaydet butonuna tıklar
    Then Tamplate alanını doldurunuz uyarısını görür


  @ÇağrıAksiyonuDüzenleme
  Scenario:TC_001 Çağrı Aksiyonu Düzenleme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Düzenlemek istediği çağrı aksiyonunun "DemirDeneme01Güncellendi" düzenle ikonuna tıklar
    And Değer "2" ve dakika "5" girer
    And Kaydet butonuna tıklar
    Then Yapılan düzenlemeyi doğrular
    #Düzenlendi yada güncellendi şeklinde popUp çıkmadığı için doğrulamada sıkıntı oluyor.


  @ÇağrıAksiyonunuDevreDışıBırakma
  Scenario:TC_001 Çağrı Aksiyonunu devre dışı bırakma

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Devre dışı bırakmak istediği "DemirDeneme01Güncellendi" çağrı aksiyonunun devre dışı bırak ikonuna tıklar
    Then Çağrı aksiyonunun devre dışı olduğunu doğrular
    #Cagrı askisyonu doğrulamak için unike bir isim olmadığı için doğrulama da sıkıntı oluyor


  @ÇağrıAksiyonunuAktifEtme
  Scenario:TC_002 Çağrı Aksiyonunu aktif hale getirme

    And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir tıklanır.
    And Devre dışı bırakmak istediği "DemirDeneme01Güncellendi" çağrı aksiyonunun devre dışı bırak ikonuna tıklar
    Then Çağrı aksiyonunun aktif olduğunu olduğunu doğrular


    @DevreDışıBırakılanÇağrıAksiyonlarınılisteleme
    Scenario:TC_001	Devre dışı bırakılan çağrı aksiyonlarını listeleme

      And Açılan pencereden "DEMIRDENEME" kampanyayı seçer
      And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir tıklanır.
      Then Devre dışı bırakılan çağrı aksiyonlarının listelendiğini doğrular









































































































































































































