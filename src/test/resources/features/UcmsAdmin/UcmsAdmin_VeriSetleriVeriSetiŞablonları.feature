@VeriSetiŞablonları
Feature: Veri Setleri Veri Seti Şablonları

  Scenario:TC_001 Veri seti şablonu ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri seti şablonları sekmesine tıklar
    And Veri seti şablonu ekleme ikonuna tıklar
    And Şablon adı "veriSetiEkleme01" girer
    And En az bir adet from alanı "" seçer
    And Kaydet butonuna tıklar
    Then Veri seti şablonunun eklendi ğini doğrular

