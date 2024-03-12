@SmsŞablonlar
Feature: SMS_Şablonlar Menüsü

  @10KarakterAltıMetinSmsŞablonuEkleme
  Scenario:TC_003 On karakterden az Şablon metni girerek Sms Şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Ekle ikonuna tıklar
    And Sms Şablon adı "SmsŞablonAdı_" girer
    And Şablon metni alanına bir metin "ileti" girer
    And Kaydet butonuna tıklar
    Then Şablon metni alanına en az on karakter girilmeli uyarısını görür


  @ŞablonAdiGirmedenSmsŞablonuEkleme
  Scenario:TC_002 Şablon adı girmeden Sms Şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Ekle ikonuna tıklar
    And Sms Şablon adı "" girer
    Then Kaydet butonunun aktif olmadığı görülür


  @SmsŞablonuEkleme
  Scenario:TC_001 Sms Şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Ekle ikonuna tıklar
    And Sms Şablon adı "SmsŞablonAdı_" girer
    And Veri seti alanında eklemek istediği veri setini "EtiketAdi_470-03-7170" seçer
    And Şablon metni alanına bir metin "Lütfen mesajınızı girin..." girer
    And Kaydet butonuna tıklar
    Then Sms şablonunun eklendiğini görür


  @SmsŞablonuİçeriktenArama
  Scenario:TC_001-TC_002 Sms Şablonu ismi ve ıd si ile içerkten arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And İçerik ara searchbox ına tıklar
    And Aramak istediği sms şablonunun "SmsŞablonAdı_182943131" ismini girer
    Then Aranan sms şablonunun listede olduğunu doğrular
    And Aramak istediği sms şablonunun id'sini girer
    Then Aranan sms şablonunun listede olduğunu doğrular


  @SmsSablonuAktifPasifEtme
  Scenario:Sms Sablonu Aktif-Pasif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Sms Sablonunun "SmsŞablonAdı_517039402" Aktif-Pasif et iconuna tıklanır
    Then Sms sablonunun aktif-pasif edildiği doğrulanır
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Sms Sablonunun "SmsŞablonAdı_517039402" Aktif-Pasif et iconuna tıklanır
    Then Sms sablonunun aktif-pasif edildiği doğrulanır
    And Aktif yada pasif etmek istediği sms sablonunun "SmsŞablonAdı_517039402" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Sms sablonunun aktif-pasif edildiği doğrulanır
    And Açılan Devre dışı bırakılanlar toggle'ı kapatılır
    And Aktif yada pasif etmek istediği sms sablonunun "SmsŞablonAdı_517039402" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Sms sablonunun aktif-pasif edildiği doğrulanır

    #NOT:Daha önceki Test lerde aktif etme ve pasif etme ayrı senaryolar ile test edilirken burda ikisi aynı senaryoda test edilmiştir.



  @CheckBoxİleBirdenFazlaSmsSablonuAktifPasifEtme
  Scenario:Birden fazla Sms Sablonu Aktif-Pasif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Aktif yada pasif etmek istediği sms sablonlarının "SmsŞablonAdı_104862448" "SmsŞablonAdı_337195997" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Sms sablonunun aktif-pasif edildiği doğrulanır


  @TümAktifPasifSmsSablonuListeleme
  Scenario:TC_001 Tüm(aktif/pasif) sms şablonlarını listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    Then İnaktif SMS şablonları da listelenir.


  @AktifPasifSmsSablonuListeleme
  Scenario:TC_002 Yalnızca Aktif SMS şablonlarını listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Açılan Devre dışı bırakılanlar toggle'ı kapatılır
    Then Yalnızca Aktif Sms sablonlaeının listelenir

  @SmsŞablonuDüzenleme
  Scenario:TC_001 Sms Şablonu düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Düzenlemek istediği Sms şablonunun "" düzenle ikonuna tıklar
    And Sms Şablon adı "GüncelSmsŞablonu_" girer
    #And Şablon metni alanında değişiklik "Şablon Metni Güncellendi..." yapar
    #Sms şablon metni alanında düzenlemede sıkıntı olduğu için şimdilik şablon adı değiştirp güncelleme yapacaz.
    And Kaydet butonuna tıklar
    Then Sms şablonunun güncellendiğini doğrular


  @SmsŞablonuVersiyonDeğiştirme
  Scenario:TC_001 Güncellenen SMS şablonunun ilk versiyonuna dönme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Güncellenen sms sablonunun "GüncelSmsŞablonu_032558958" versiyon ikonuna tıklar
    And Açılan pencerede tipi Oluşturma olan satırın Bu versiyonlar devam et ikonuna tıklar
    And Versiyonu geri al butonuna tıklar
    And Onay butonuna tıklar
    Then Versiyon değiştiğini görür


  @CheckBoxİleSmsSablonuSilmeVazgeç
  Scenario:TC_003 Checkbox ile aktif/pasif olan sms sablonu seçip silmeden vazgeçme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Silmek istediği sms sablonunun "SmsŞablonAdı_339437748" checkboxına tıklar
    And Sağ üst köşede beliren sil ikonuna tıklanır
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Sms sablonunun silinmediğini doğrular


  @CheckBoxİleSmsSablonuSilme
  Scenario:TC_001 Checkbox ile aktif/pasif olan şablonlar seçip silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Silmek istediği sms sablonunun "SmsŞablonAdı_176866214" checkboxına tıklar
    And Sağ üst köşede beliren sil ikonuna tıklanır
    And Dosyayı silmek istediğinizden eminmisiniz uyarısını onaylar
    Then Sms sablonunun silindiğini doğrular


  @CheckBoxİleBirdenFazlaSmsSablonuSilme
  Scenario:TC_002 Checkbox ile birden fazla sms şablonları seçip silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Silmek istediği sms sablonunun "SmsŞablonAdı_104862448" "SmsŞablonAdı_337195997" checkboxına tıklar
    And Sağ üst köşede beliren sil ikonuna tıklanır
    And Dosyayı silmek istediğinizden eminmisiniz uyarısını onaylar
    Then Sms sablonunun silindiğini doğrular

