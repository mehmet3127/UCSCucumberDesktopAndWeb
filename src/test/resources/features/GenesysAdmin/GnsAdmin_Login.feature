@GenasysAdminLogin
Feature: GenesysAdminLogin

  Scenario: GenesysAdminPozitiveLoginTest

    Given Kullanıcı Genesys admin Url'ye gider
    When Kullanıcı Genesys admin için geçerli username girer
    And Kullanıcı Genesys admin için geçerli password girer
    And Kullanıcı Genesys admin için application girer
    And Kullanıcı Genesys admin için host name girer
    And Kullanıcı Genesys admin için port girer
    And Kullanıcı login buttonuna tıklar
    Then Kullanıcı genesys admin anasayfasına gidildiğini doğrular

  @WindowsHandles
  Scenario: GenesysAdminWindowHandles
    Given Kullanıcı Genesys admin Url'ye gider
    When Kullanıcı Genesys admin için geçerli username girer
    And Kullanıcı Genesys admin için geçerli password girer
    And Kullanıcı Genesys admin için application girer
    And Kullanıcı Genesys admin için host name girer
    And Kullanıcı Genesys admin için port girer
    And Kullanıcı login buttonuna tıklar
    And Kullanıcı Account sekmesine tıklar
    And Kullanıcı users sekmesine tıklar
    And Kullanıcı istediği Testi seçer
    And Kullanıcı agentGroup tab'a tıklar
    And Kullanıcı istediği link e tıklar


