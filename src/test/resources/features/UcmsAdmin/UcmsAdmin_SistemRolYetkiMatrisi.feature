@RolYetkiMatrisi
Feature: Rol Yetki Matrisi


  Scenario:TC_001	Yetki Tipi Rol olarak yetki verme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sistem Butonuna tıklar
    And Rol-Yetki matrisi  sekmesine tıklar
    And Açılan pencerede yetki tipi olarak rol seçer
    And İstediği Rol'ü seçer
    And Vermek istediği yetki'yi seçer
    And Kaydet butona tıklar
    And Yetkinin verildiği mesajını doğrular