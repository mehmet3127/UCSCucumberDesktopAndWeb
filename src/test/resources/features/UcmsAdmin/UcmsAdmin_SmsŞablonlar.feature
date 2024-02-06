@SmsŞablonlar
Feature: SMS_Şablonlar Menüsü

  Scenario: Sms Şablon Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And Şablonlar sekmesine tıklar
    And Sms şablonu ekle ikonuna tıklar
    And Sms Şablon adı "SmsŞablonAdı_" girer
    And Veri seti alanında eklemek istediği veri setini seçer
    And Şablon metni alanına on karakterden uzun bir metin girer
    And Kaydet butonuna tıklar
    Then Sms şablonunun eklendiğini görür