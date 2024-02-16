@RolYetkiMatrisi
Feature: Rol Yetki Matrisi

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sistem Butonuna tıklar
    And Rol-Yetki matrisi  sekmesine tıklar


  @ignore
  @RolOlarakYetkiVerme
  Scenario:TC_001 Yetki Tipi Rol olarak yetki verme

    And Açılan pencerede yetki tipini "Rol" seçer
    And İstediği Rol'ü "Ucms30_Admin" seçer
    And Vermek istediği yetki'yi "Sonuç Kodu ekleyebilir." seçer
    And Kaydet butona tıklar
    And Yetki güncellendi mesajını doğrular

  @ignore
  @RolOlarakYetkiKaldırma
  Scenario:TC_001	Yetki Tipi Rol olarak yetki kaldırma

    And Açılan pencerede yetki tipini "Rol" seçer
    And İstediği Rol'ü "Ucms30_Admin" seçer
    And Kaldırmak istediği yetki'yi "Sonuç Kodu ekleyebilir." seçer
    And Kaydet butona tıklar
    And Yetki güncellendi mesajını doğrular


  @KullanıcıOlarakYetkiVerme
  Scenario: TC_002 Yetki Tipi Kullanıcı olarak Rol yetki verme

    And Açılan pencerede yetki tipini "Kullanıcı" seçer
    And Kullanıcı adını "mehmet" girer
    And 2 saniye bekler
    And Vermek istediği yetki'yi "Sonuç Kodu ekleyebilir." seçer
    And Kaydet butona tıklar
    And Yetki güncellendi mesajını doğrular


  @KullanıcıOlarakYetkiKaldırma
  Scenario: TC_002 Yetki Tipi Kullanıcı olarak Rol yetki verme

    And Açılan pencerede yetki tipini "Kullanıcı" seçer
    And Kullanıcı adını "mehmet" girer
    And 2 saniye bekler
    And Kaldırmak istediği yetki'yi "Sonuç Kodu ekleyebilir." seçer
    And Kaydet butona tıklar
    And Yetki güncellendi mesajını doğrular









