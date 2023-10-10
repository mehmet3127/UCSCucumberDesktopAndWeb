@SonuçKoduArama
Feature:İçerikden Sonuç Kodu Arama

  Scenario: TC_002 İçerik den Sonuç Kodu Arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And İçerik ara searchbox ına tıklar
    And Var olan sonuç kodunun ismini girer
    And Var olan sonuç kodunun olduğunu doğrular