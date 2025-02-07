@DesignerLoginTest
Feature:Designer_Login

  Background:
    Given Designer uygulamasina gidilir


  @DesignerNegativeLoginTest
  Scenario Outline:Designer_Negative_LoginTest

    Then UserName "<girilecekUserName>" girilir
    And Password "<girilecekPassword>" girilir
    And Kullanıcı uygulama adını "<girilecekUygulamaAdi>" gırer
    And Server name "<girilecekServer>" girilir
    And Port bilgisi "<girilecekPort>" girilir
    And Login butonuna tıklanir.
    And Tamam button'una tıklanir
    Then Vazgec butonuna tiklar

    Examples: Kullanıcı Dataları

      | girilecekUserName | girilecekPassword | girilecekUygulamaAdi | girilecekServer | girilecekPort |
      | userName          | wrongPassword     | uygulamaAdi          | serverName      | portx          |
      | wrongUserName     | password          | uygulamaAdi          | serverName      | port          |
      | wrongUserName     | wrongPassword     | uygulamaAdi          | serverName      | port          |
      | userName          | password          | hataliUygulamaAdi    | serverName      | port          |
      | userName          | password          | uygulamaAdi          | hataliServer    | port          |
      | userName          | password          | uygulamaAdi          | serverName      | hataliPort    |



  @DesignerPozitifLoginTest
  Scenario Outline:Designer_Pozitive_LoginTest

    Then UserName "<girilecekUserName>" girilir
    And Password "<girilecekPassword>" girilir
    And Kullanıcı uygulama adını "<girilecekUygulamaAdi>" gırer
    And Server name "<girilecekServer>" girilir
    And Port bilgisi "<girilecekPort>" girilir
    And Login butonuna tıklanir.
    Then Designer ana sayfasina gidildiği gorulur
    #Then Kullanıcı sayfayı kapatır

    Examples:
      | girilecekUserName | girilecekPassword | girilecekUygulamaAdi | girilecekServer | girilecekPort |
      | userName          | password          | uygulamaAdi          | serverName      | port          |




