@DesktopAndWeb
Feature: Desktop and Web

  @DesignerTest
  Scenario:Designer_Pozitive_LoginTest

    Then Gecerli username girilir
    And Gecerli password girilir
    And Login butonuna tıklanir
    And Designer ana sayfasina gidildiği gorulur



  @UcmsAdmin
  Scenario: TC001_Ucms Admin Pozitif Login Test
    Given Ucms admine gider

