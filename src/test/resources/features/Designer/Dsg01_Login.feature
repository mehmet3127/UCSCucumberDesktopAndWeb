@DesignerLoginTest
Feature:Designer_Login

  Background:
    Given Kullanici designer sayfasina gider

  @DesignerPozitifLoginTest
  Scenario:Designer_Pozitive_LoginTest

    Then Kullanici gecerli username girer
    And Kullanici gecerli password girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı designer ana sayfasina gidildiğini doğrular
    #Then Kullanıcı sayfayı kapatır

  @DesignerNegativeLoginTest
  Scenario Outline:Designer_Negative_LoginTest

    Given Kullanici designer sayfasina gider
    Then Kullanici userName "<girilecekUserName>" girer
    And kullanıcı password "<girilecekPassword>" girer
    And Kullanıcı uygulama adını "<girilecekUygulamaAdi>" gırer
    And Kullanıcı server name "<girilecekServer>" girer
    And Kullanıcı Port bilgisini "<girilecekPort>" girer
    And Kullanıcı login butonuna tıklar
    And Kullanıcı tamam button'una tıklar
    #Then Vazgec butonuna tiklar

    Examples: Kullanıcı Dataları

      | girilecekUserName | girilecekPassword | girilecekUygulamaAdi | girilecekServer | girilecekPort |
      | userName          | wrongPassword     | uygulamaAdi          | serverName      | port          |
      | wrongUserName     | password          | uygulamaAdi          | serverName      | port          |
      | wrongUserName     | wrongPassword     | uygulamaAdi          | serverName      | port          |
      | userName          | password          | hataliUygulamaAdi    | serverName      | port          |
      | userName          | password          | uygulamaAdi          | hataliServer    | port          |
      | userName          | password          | uygulamaAdi          | serverName      | hataliPort    |




