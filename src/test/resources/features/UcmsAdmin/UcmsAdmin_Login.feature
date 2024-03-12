@UcmsLoginTest
Feature: Ucms Admin Login Test

  @UcmsAdminPozitifeLoginTest
  Scenario: TC001_Ucms Admin Pozitif Login Test

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    Then Anasayfaya gidildiğini doğrular



  @UcmsNegatifLoginTest
  Scenario Outline:TC_002_TC_003_TC_004 Ucms Admin Neğatif Login Test
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için username "<username>" girer
    And Kullanıcı ucmsadmin için passeord "<password>" girer
    And Kullanıcı giriş butona tıklar
    Then Kullanıcı Anasayfaya gidilemediğini doğrular

    Examples:
      | username     | password |
      | mehmet.demir | y        |
      | mehmetdemir  | x        |
      | mehmetdemir  | y        |
