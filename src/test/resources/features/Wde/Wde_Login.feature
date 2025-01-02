Feature: wde Login Test

  @WdeLoginTest
  Scenario: TC001 Wde Pozitive Login Test

    Given Kullanıcı wde uygulamasına gider
    When Kullanıci wde için geçerli username girer
    And Kullanıcı wde için geçerli password girer
    And Kullanıc wde için Login button tıklar
    Then Kullanıcı hamburger menu ye tiklar