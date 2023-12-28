@DevreDışıBırakılanSonuçKodlarınınListelenmesiVeListedenÇıkartılması
Feature: Devre Dışı Bırakılan Sonuç Kodlarının Listelenmesi

  Scenario: TC_001 Devre Dışı Bırakılan Sonuç Kodlarının Listelenmesi

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    Then Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    Then Kod grupları hiyerarşisi altında devre dışı bırakılan sonuç kodlarının da üstü çizili olarak listelendiği görülür

  Scenario: TC_002 Devre Dışı Bırakılan Sonuç Kodlarını Listeden Çıkarma
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    Then Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    #Then Kod grupları hiyerarşisi altında devre dışı bırakılan sonuç kodlarının da üstü çizili olarak listelendiği görülür
    Then Tekrar devre dışı bırakılanlar iconuna tıklandığında, devre dışı bırakılmış sonuç kodlarının listelenmediği  görülür
