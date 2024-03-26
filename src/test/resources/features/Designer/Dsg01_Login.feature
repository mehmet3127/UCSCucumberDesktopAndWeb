@DesignerLoginTest
Feature:Designer_Login

  Background:
    Given Kullanici designer sayfasina gider


  @DesignerNegativeLoginTest
  Scenario Outline: TC001_Negative_LoginTest

    Given Kullanici designer sayfasina gider
    Then Kullanici gecerli userName "<girilecekUserName>" girer
    And kullanıcı gecerli password "<girilecekPassword>" girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı tamam button'una tıklar

    Examples: Kullanıcı Dataları

      | girilecekUserName | girilecekPassword |
      | userName          | wrongPassword     |
      | wrongUserName     | password          |
      | wrongUserName     | wrongPassword     |


  @DesignerPozitifLoginTest
  Scenario: TC01 Kullanıcı Kullanıcı Bilgilerini Girer

    Then Kullanici gecerli username girer
    And Kullanici gecerli password girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı designer ana sayfasina gidildiğini doğrular
    Then Kullanıcı sayfayı kapatır


