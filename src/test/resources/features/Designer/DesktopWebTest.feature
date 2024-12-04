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


  @Test1
  @DesignerCPNveSMSServislerininOptionlarınınAtanmışOlması
  Scenario: UCMS-TC-514: Designer CPN ve SMS Servislerinin Optionlarının Atanmış Olması

    Given Kullanıcı Genesys admin Url'ye gider
    When Kullanıcı Genesys admin için geçerli username girer
    And Kullanıcı Genesys admin için geçerli password girer
    And Kullanıcı Genesys admin için application girer
    And Kullanıcı Genesys admin için host name girer
    And Kullanıcı Genesys admin için port girer
    And Kullanıcı login buttonuna tıklar
    And Provisioning tab'i acilir
    And Environment sekmesine tiklanir
    And Applications'a tiklanir
    And Ilgili klasor "TestApps" acilir
    And Ilgili application "UcmsDesigner26_Test" acilir
    And options tab'ina tiklanir
    And Option alanina guncellenecek optionun adi "ObNumberTemplateApiUrl" yazilir
    And Guncelleme yapilmak istenen optionun value degerine "http://test-linux.ucs.pvt:39037/api" veri girilir
    And Save butonuna tiklanir
    And Genesys uygulmasi kapatilir

  @Test1
  Scenario:UCMS-TC-514: Designer CPN ve SMS Servislerinin Optionlarının Atanmış Olması
    Given Designer uygulamasina gidilir
    When Gecerli username girilir
    And Gecerli password girilir
    And Login butonuna tıklanir
    And Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir



