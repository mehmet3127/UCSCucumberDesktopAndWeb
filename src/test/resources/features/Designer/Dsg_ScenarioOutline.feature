Feature: Ucms_Designer_Negative_LoginTest


  @ScenarioOutlineNegativeLogin
  Scenario Outline: TC001_Negative_LoginTest

    Given Kullanici designer sayfasina gider
    Then Kullanici gecerli userName "<girilecekUserName>" girer
    And kullanıcı gecerli password "<girilecekPassword>" girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı tamam button'una tıklar


    Examples:
      | girilecekUserName | girilecekPassword |
      | userName          | wrongPassword     |
      | wrongUserName     | password          |
      | wrongUserName     | wrongPassword     |
