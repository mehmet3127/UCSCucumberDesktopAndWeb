@SonuçKoduVersiyonDeğiştirme
Feature: Sonuç Kodu Versiyon Değiştirme

  Scenario Outline: TC_001	Güncellenen sonuç kodunun ilk versiyonuna dönme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Güncellemek istediği sonuç kodunun "<Kod Grubuna>" tıklar
    And Güncellemek istediği "<sonuç kodu>" güncelle ıkonuna tıklar
    And Açılan pencereden Başlık alanını günceller
    And Güncelle butonuna tıklar
    Then Sonuç kodunun güncellendiğini doğrular
    And Güncellenen sonuç kodunun versiyon ikonuna tıklar
    And Açılan pencerede tipi Oluşturma olan satırın Bu versiyonlar devam et ikonuna tıklar
    And Açılan pencerede tüm alanların pasif geldiğini görür
    And Versiyonu değiştir butonuna tıklar
    And Onay butonuna tıklar
    And Sonuç kodu veriyonunun güncellendiğini doğrular

    Examples:
      | Kod Grubuna | sonuç kodu |
      | KGOtomasyon001 | SKOtomasyon001 |




















