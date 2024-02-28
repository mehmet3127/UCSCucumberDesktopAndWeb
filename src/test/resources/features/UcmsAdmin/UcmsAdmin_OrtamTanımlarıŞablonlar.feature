@OrtamTanımlarıŞablonlar
Feature:OrtamTanımları Şablonlar


  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Ortam Tanımları butonuna tıklar
    And Şablonlar menusune tıklar


  @NumaraSeçmedenÇıkışNumaralarıŞablonuEkleme
  Scenario:TC_003 Numara seçmeden Çıkış Numaraları şablonu ekleme

    And Ekle ikonuna tıklar
    And Açılan pencerede şablon adını "ÇıkışNumarasıŞablonu_" girer
    And Kaydet butonuna tıklar
    And Bir veya birden fazla numara seçiniz uyarısını doğrular



  @AynıİsimdeÇıkışNumaralarıŞablonuEkleme
  Scenario:TC_002 Aynı isimde Çıkış Numaraları şablonu ekleme

    And Ekle ikonuna tıklar
    And Açılan pencerede var olan şablon adını "ÇıkışNumaralarıŞablonu" girer
    And En az bir adet numara "4441444" seçer
    And Kaydet butonuna tıklar
    And Bu isimle bir şablon zaten var uyarısını görür


  @ÇıkışNumaralarıŞablonuEkleme
  Scenario:TC_001 Çıkış Numaraları şablonu ekleme

    And Ekle ikonuna tıklar
    And Açılan pencerede şablon adını "ÇıkışNumarasıŞablonu_" girer
    And En az bir adet numara "4441444" seçer
    And Kaydet butonuna tıklar
    And Çıkış Numaraları şablonu eklendiğini doğrular


  @SeçiliNuarayıİptalEderekÇıkışNumaralarıŞablonuDüzenleme
  Scenario:TC_001 Seçili numaraları iptal ederek Çıkış Numaraları şablonu düzenleme

    And Çıkış Numaraları şablonu "ÇıkışNumarasıŞablonu_" düzenleme ikonuna tıklar
    And Seçili numarasını "4441444" iptal eder
    And Güncelle butonuna tıklar
    And Bir veya birden fazla numara seçiniz uyarısını doğrular


  @ÇıkışNumaralarıŞablonuDüzenleme
  Scenario:TC_002 Çıkış Numaraları şablonu düzenleme

    And Çıkış Numaraları şablonu "ÇıkışNumarasıŞablonu_" düzenleme ikonuna tıklar
    And Açılan pencerede şablon adını "ÇıkışNumaralarıŞablonuUpdate_" girer
    And En az bir adet numara "16379221116" seçer
    And Güncelle butonuna tıklar
    Then Çıkış Numaraları şablonu güncellendiğini doğrular


  @VarOlanÇıkışNumaralarıŞablonunuİçeriktenArama
  Scenario:TC_001-TC_002 Çıkış numaralarını şablonunu ismi ve ıd ile arama

    And İçerik ara searchbox ına tıklar
    And Var olan Çıkış Numaraları şablonunun ismini "" girer
    Then Var olan Çıkış Numaraları şablonunun "" olduğunu doğrular
    And Var olan Çıkış Numaraları şablonunun ıd sini girer


































