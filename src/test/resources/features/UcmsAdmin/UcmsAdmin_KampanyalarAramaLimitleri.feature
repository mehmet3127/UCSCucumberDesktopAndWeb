@KampanyalarAramaLimitleri
Feature: Kampanyalar Sayfası-Arama Limitleri Menüsü

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Kampanyalar butonuna tıklar
    And Arama limitleri menüsüne tıklar


  @KampanyalaraAramaLimitiEkleme
  Scenario:TC_001 Kampanyalara Arama Limiti Ekleme

    And Açılan pencereden arama limiti eklemek istediği "DENEME_OTOMASYON" kampanyayı seçer
    And Ekle ikonuna tıklar
    And Ekle butonuna tıklar
    And Sıfırdan büyük bir kayıt günü "5" girer
    And Arama sayısı "3" girer
    And Arama limitini eklemek istediği diğer "" kampanyayı seçer
    And Kaydet butonuna tıklar
    And Arama limitinin eklendiğini görür














