Feature: PreviewModdaBirdenFazlaİnteraction geldiğinde custcall tablosuna hatalI kayıT yazılması

  @PreviewModdaÇağrıAlma
  Scenario: TC001_PreviewModdaÇağrıAlınması

    Given Kullanıcı wde uygulamasına gider
    When Kullanıci wde için geçerli username girer
    And Kullanıcı wde için geçerli password girer
    And Kullanıc wde için Login button tıklar
    And Kullanıcı hamburger menu ye tiklar
    And My Campains e tıklar
    And My campains sayfasında get rocords butonu na tıklar
    And Runtime içerisinde bitir butonuna tıklar
    And Sonuc kodu "Cevap Yok" girilir
    And Bitir butonuna tıklar
    Then onay butonun da evet tıklar

