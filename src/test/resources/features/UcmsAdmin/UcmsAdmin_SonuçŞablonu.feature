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
    And Düzenlemek istediği sonuç şablonunun "SonuçŞablonuGüncelleme" düzenle ikonuna tıklar
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
    And Düzenlemek istediği sonuç şablonunun "SonuçŞablonuGüncelleme" düzenle ikonuna tıklar
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
    Then İnaktif sonuç şablonları listelendiği görülür


  @SonuçŞablonlarılisteleme2
  Scenario:TC_002 Yalnızca Aktif sonuç şablonlarını listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Açılan Devre dışı bırakılanlar toggle'ı kapatılır
    Then Yalnızca aktif sonuç şablonları listelendiği görülür

  @SonuçŞablonlarıAktifEtme
  Scenario:TC_001 Aktif et iconu kullanarak pasif şablonu aktif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And İnaktif olan sonuç şablonunun "SonuçŞablonuEklemeOtomasyon05" Aktif et iconuna tıklanır
    Then Kayıt güncellendi yazısnı görür

  @SonuçŞablonlarıPasifEtme
  Scenario:TC_002 Devre dışı bırak iconu kullanarak aktif şablonu pasif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Aktif olan sonuç şablonunun "SonuçŞablonuEklemeOtomasyon05" Pasif et iconuna tıklanır
    Then Kayıt güncellendi yazısnı görür

  @CheckBoxİleSonuçŞablonlarıPasifEtme
  Scenario:TC_003 Checkbox ile aktif olan şablonu seçip pasif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Listelenen sonuç şablonlarının solundaki checkbox kullanılarak bir tanesi "SonuçŞablonuAktifPasifHaleGetirme" seçilir
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Seçilen şablonun güncellendiği görülür


  @CheckBoxİleSonuçŞablonlarıAktifEtme
  Scenario:TC_005 Checkbox ile pasif olan şablonu seçip aktif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Listelenen sonuç şablonlarının solundaki checkbox kullanılarak bir tanesi "SonuçŞablonuAktifPasifHaleGetirme" seçilir
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Seçilen şablonun güncellendiği görülür


  @CheckBoxİleBirdenFazlaSonuçŞablonlarıPasifEtme
  Scenario:TC_004 Checkbox ile birden fazla aktif olan şablonları seçip pasif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Listelenen sonuç şablonlarının solundaki checkbox kullanılarak birden fazla "CheckBoxAktifPasifEtmeŞablonu1" "CheckBoxAktifPasifEtmeŞablonu2" seçilir
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Seçilen şablonun güncellendiği görülür

  @CheckBoxİleBirdenFazlaSonuçŞablonlarıAktifEtme
  Scenario:TC_006 Checkbox ile birden fazla pasif olan şablonları seçip aktif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Listelenen sonuç şablonlarının solundaki checkbox kullanılarak birden fazla "CheckBoxAktifPasifEtmeŞablonu1" "CheckBoxAktifPasifEtmeŞablonu2" seçilir
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Seçilen şablonun güncellendiği görülür

   #Sonuş Şablonu Ekle modalında Devre dışı bırakılanlar ikonu ile sonuç kodlarını listeleme
  @EkleModalıDevreDışıBırakılanSonuçKodlarıListeleme
  Scenario:TC_001 Ekle modalı devre dışı bırakılan kodlarını da listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Sonuç şablonu ekleme ıkonun tıklar
    And Açılan modaldaki devre dışı bırakılanlar toggle'ı aktif edilir
    Then Devre dışı bırakılan sonuç kodlarının listelendiği görülür
    #!!Sonuç kodları listelenmediği için görünmüyor task açıldı bekleneiyor


  @EkleModalıSonuçKodlarıListeleme
  Scenario:TC_002 Ekle modalı şablonları listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Sonuç şablonu ekleme ıkonun tıklar
    And Açılan modaldaki devre dışı bırakılanlar toggle'ı kapatılır
    Then Sonuç kodlarının listelendiği görülür
    #!!Sonuç kodları listelenmediği için görünmüyor task açıldı bekleneiyor


  #Sonuş Şablonu Güncelle modalında Devre dışı bırakılanlar ikonu ile sonuç Kodlarını listeleme
  @GüncelleModalıDevreDışıBırakılanSonuçKodlarıListeleme
  Scenario:TC_001 Güncelle modalı devre dışı bırakılan sonuç kodlarını da listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Düzenlemek istediği sonuç şablonunun "SonuçŞablonuGüncellme" düzenle ikonuna tıklar
    And Açılan modaldaki devre dışı bırakılanlar toggle'ı aktif edilir
    Then Devre dışı bırakılan sonuç kodlarının listelendiği görülür
    #!!Sonuç kodları listelenmediği için görünmüyor task açıldı bekleneiyor


  @GüncelleModalıSonuçKodlarıListeleme
  Scenario:TC_001 Güncelle modalı devre dışı bırakılan şablonları da listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Düzenlemek istediği sonuç şablonunun "SonuçŞablonuGüncellme" düzenle ikonuna tıklar
    And Açılan modaldaki devre dışı bırakılanlar toggle'ı kapatılır
    Then Sonuç kodlarının listelendiği görülür
    #!!Sonuç kodları listelenmediği için görünmüyor task açıldı bekleneiyor


  @sonuçKoduŞablonuVersiyonDeğiştirme
  Scenario: TC_001	Güncellenen sonuç kodu şablonunun ilk versiyonuna dönme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç şablonları sekmesine tıklar
    And Düzenlemek istediği sonuç şablonunun "SonuçŞablonuGüncelleme" düzenle ikonuna tıklar
    And Şablon adını "SonuçŞablonuGüncelleme" değiştirir
    And Kaydet butonuna tıklar
    And Güncellenen sonuç kodu şablonunun versiyon ikonuna tıklar
    #Bu versiyonla devam et dedikten sonra Tip olarak oluşturma görünmediği için beklemede task açılacak





















