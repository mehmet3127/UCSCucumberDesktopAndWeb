@GenasysAdminLogin
Feature: GenesysAdminLogin

  Scenario: GenesysAdminPozitiveLoginTest

    Given Genesys admin Url'ye gidilir
    When Genesys admin icin gecerli username girilir
    And Genesys admin icin gecerli password girilir
    And Genesys admin icin application girilir
    And Genesys admin icin host name girilir
    And Genesys admin icin port girilir
    And Genesys admin login buttonuna tıklanir
    Then Kullanıcı genesys admin anasayfasına gidildiğini doğrular

  @WindowsHandles
  Scenario: GenesysAdminWindowHandles

    Given Genesys admin Url'ye gidilir
    When Genesys admin icin gecerli username girilir
    And Genesys admin icin gecerli password girilir
    And Genesys admin icin application girilir
    And Genesys admin icin host name girilir
    And Genesys admin icin port girilir
    And Genesys admin login buttonuna tıklanir
    And Account sekmesine tiklanir
    And Users sekmesine tiklanir
    And Kullanıcı istediği Testi seçer
    And Kullanıcı agentGroup tab'a tıklar
    And Kullanıcı istediği link e tıklar


