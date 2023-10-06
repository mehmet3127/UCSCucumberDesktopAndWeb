Feature: PreviewModdaBirdenFazlaİnteraction geldiğinde custcall tablosuna hatalI kayıT yazılması

  @PreviewModdaÇağrıAlma
  Scenario: TC001_PreviewModdaÇağrıAlınması

    Given Kullanıcıc wde uygulamasına gider
    When Kullanıc wde için geçerli username girer
    And Kullanıcı wde için geçerli password girer
    And Kullanıc wde için Login button tıklar
    And Kullanıcı hamburger menu ye tiklar
    And My Campains e tıklar
    And My campains sayfasında get rocords butonu na tıklar
    And Runtıme penceresi içerisin de arama butonuna tıklar
    And Açılan arama penceresinde kaydın ilk numarasını tıklar
    And Arama penceresi kapatılır
    And Runtime içerisinde bitir butonuna tıklar
    And Kapatıcı sonuç kodu girer
    And Bitir butonuna tıklar
    Then onay butonun da evet tıklar

