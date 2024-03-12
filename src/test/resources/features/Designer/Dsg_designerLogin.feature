
Feature:Designer_Login


  @DesignerPozitifLoginTest
  Scenario: TC01 Kullanıcı Kullanıcı Bilgilerini Girer

    Given Kullanici designer sayfasina gider
    Then Kullanici gecerli username girer
    And Kullanici gecerli password girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı designer ana sayfasina gidildiğini doğrular
    Then Kullanıcı sayfayı kapatır


