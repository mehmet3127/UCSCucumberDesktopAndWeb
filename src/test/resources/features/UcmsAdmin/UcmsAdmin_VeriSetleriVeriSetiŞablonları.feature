@VeriSetiŞablonları
Feature: Veri Setleri Veri Seti Şablonları


  @ŞablonAdıGirmedenVeriSetiŞablonuEkleme
  Scenario:TC_002 Şablon adı girmeden veri seti şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Veri seti şablonu ekleme ikonuna tıklar
    And Şablon adı "" girer
    And En az bir adet veri seti "combo" seçer
    And Kaydet butonuna tıklar
    Then Şablon adı boş bırakılamaz uyarısını doğrular

  @VeriSetiSeçmedenVeriSetiŞablonuEkleme
  Scenario:TC_003 Form alanı seçmeden veri seti şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Veri seti şablonu ekleme ikonuna tıklar
    And Şablon adı "veriSetiŞablonuDeneme" girer
    And En az bir adet veri seti "" seçer
    And Kaydet butonuna tıklar
    Then Bir veya birden fazla form alanı seçiniz uyarısnı doğrular

  @VeriSetiŞablonuEkleme
  Scenario:TC_001 Veri seti şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Veri seti şablonu ekleme ikonuna tıklar
    And Şablon adı "veriSetiŞablonuDeneme06" girer
    And En az bir adet veri seti "combo" seçer
    And Kaydet butonuna tıklar
    Then Veri seti şablonunun eklendiğini doğrular

  @VeriSetiŞablonuİçerikArama
  Scenario:TC_001 Var olan ver seti şablonları ismi ile içerikten arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And İçerik ara searchbox ına tıklar
    And Aramak istediği veri seti şablonunun "" ismini girer
    Then Veri seti şablonunun olduğunu doğrular


  @ŞablonAdıBoşBırakılarakVeriSetiŞablonuDüzenleme
  Scenario:TC_002	Şablon adı girmeden veri seti şablonu düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Düzenlemek istediği veri seti şablonunun "" düzenle ikonuna tıklar
    And Açılan pencerede Şablon adını "" değiştirir
    #Veri seti şablonu ismini silip boş bırakınca uyarı vermesi gerekirken vermiyor
    #And En az bir adet veri seti "" seçer
    And Kaydet butonuna tıklar
    Then Şablon adı boş bırakılamaz uyarısını doğrular


  @VeriSetiSeçmedenVeriSetiŞablonuDüzenleme
  Scenario:TC_003 Seçili form alanını iptal ederek veri seti şablonu

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Düzenlemek istediği veri seti şablonunun "" düzenle ikonuna tıklar
    And Açılan pencerede Şablon adını "veriSetiŞablonuGüncellendi" değiştirir
    And Seçilen veri setlerini "combo" iptal eder
    And Kaydet butonuna tıklar
    Then Bir veya birden fazla form alanı seçiniz uyarısnı doğrular
    #Bir üstte ki senaryoda isim boş bırakılınca güncelleme olmaması gerekirken olduğu için burda da seçilen


  @VeriSetiŞablonuDüzenleme
  Scenario:TC_001 Veri seti şablonu düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Düzenlemek istediği veri seti şablonunun "" düzenle ikonuna tıklar
    And Açılan pencerede Şablon adını "veriSetiŞablonuDeneme06Güncellendi" değiştirir
    And En az bir adet veri seti "deneme_x" seçer
    And Kaydet butonuna tıklar
    Then Veri seti şablonunun güncellendiğini doğrular


  @VeriSetiŞablonuVersiyonDeğiştirme
  Scenario: TC_001 Güncellenen veri seti şablonunun ilk versiyonuna dönme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    #And Düzenlemek istediği veri seti şablonunun "" düzenle ikonuna tıklar
    #And Açılan pencerede Şablon adını "" değiştirir
    #And Kaydet butonuna tıklar
    #Then Veri seti şablonunun güncellendiğini doğrular
    And Güncellenen veri seti şablonunun "VeriSetiŞablonuVersiyonDeğişikliğiGüncellendi" versiyon ikonuna tıklar
    #Güncellenen veri seti şablonunun versiyon değiştir ikonuna tıklayınca oluşturma tipi vs hiç bir kayıt çıkmadığı için Task açıldı beklemede


  @PasifVeriSetiŞablonlarınıListeleme
  Scenario: TC_001 Tüm(aktif/pasif) veri seti şablonlarını listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    Then İnaktif veri seti şablonlarının listelendiği görülür

  @AktifVeriSetiŞablonlarınıListeleme
  Scenario: TC_002 Yalnızca Aktif veri seti şablonlarını listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Açılan Devre dışı bırakılanlar toggle'ı kapatılır
    Then Yalnızca aktif veri seti şablonlarının listelendiği görülür

  @VeriSetiŞablonlarıPasifEtme
  Scenario: TC_002 Devre dışı bırak iconu kullanarak aktif şablonu pasif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Aktif olan veri seti şablonunun "" Aktif-Pasif et iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular

  @VeriSetiŞablonlarıAktifEtme
  Scenario:TC_001 Aktif et iconu kullanarak pasif şablonu aktif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Aktif olan veri seti şablonunun "" Aktif-Pasif et iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular

  @CheckBoxİleVeriSetiŞablonunuPasifEtme
  Scenario: TC_001 Checkbox ile aktif olan veri seti şablonunu seçip pasif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Pasif etmek istediği şablonun "" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular

  @CheckBoxİleVeriSetiŞablonunuAktifEtme
  Scenario: TC_002 Checkbox ile pasif olan veri seti şablonunu seçip aktif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Pasif etmek istediği şablonun "" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular














































