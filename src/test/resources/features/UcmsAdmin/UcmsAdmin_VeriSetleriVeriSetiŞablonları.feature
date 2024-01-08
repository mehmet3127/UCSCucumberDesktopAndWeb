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
    And Şablon adı "veriSetiŞablonu12" girer
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
    And Şablon adı "veriSetiŞablonu12" girer
    And En az bir adet veri seti "combo" seçer
    And Kaydet butonuna tıklar
    Then Veri seti şablonunun eklendiğini doğrular

  @ŞablonAdıBoşBırakılarakVeriSetiŞablonuDüzenleme
  Scenario:TC_002	Şablon adı girmeden veri seti şablonu düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Düzenlemek istediği veri seti şablonunun "veriSetiŞablonu12" düzenle ikonuna tıklar
    And Açılan pencerede Şablon adını "" değiştirir
    #Veri seti şablonu ismini silip boş bırakınca uyarı vermesi gerekirken vermiyor
    And En az bir adet veri seti "deneme_x" seçer
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
    And Düzenlemek istediği veri seti şablonunun "veriSetiŞablonu12" düzenle ikonuna tıklar
    And Açılan pencerede Şablon adını "veriSetiŞablonu11Güncellendi" değiştirir
    And Seçilen veri setlerini "deneme_x" iptal eder
    And Kaydet butonuna tıklar
    Then Bir veya birden fazla form alanı seçiniz uyarısnı doğrular


  @VeriSetiŞablonuDüzenleme
  Scenario:TC_001	Veri seti şablonu düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Düzenlemek istediği veri seti şablonunun "veriSetiŞablonu12" düzenle ikonuna tıklar
    And Açılan pencerede Şablon adını "veriSetiŞablonu12Güncellendi" değiştirir
    And En az bir adet veri seti "deneme_x" seçer
    And Kaydet butonuna tıklar
    Then Veri seti şablonunun güncellendiğini doğrular





