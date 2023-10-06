@NegativeTest
Feature: Designer_Negative_Test

  Background:
    Given Kullanici designer sayfasina gider


  Scenario:TC001_Designer Negative Login Test
    Then Kullanici gecerli userName "userName" girer
    And Kullanici gecerli olmayan password "wrongPassword" girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı tamam button'una tıklar

  Scenario:TC002_Designer Negative Login Test
    Then Kullanici gecerli olmayan userName "wrongUserName" girer
    And kullanıcı gecerli password "password" girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı tamam button'una tıklar

  Scenario:TC003_Designer Negative Login Test
    Then Kullanici gecerli olmayan userName "wrongUserName" girer
    And Kullanici gecerli olmayan password "wrongPassword" girer
    And Kullanici login buttonuna tıklar
    Then Kullanıcı tamam button'una tıklar
