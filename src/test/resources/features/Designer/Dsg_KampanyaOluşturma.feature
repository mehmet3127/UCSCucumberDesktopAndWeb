
Feature: Kampanya_Oluşturma

  @KampanyaOluşturma
  Scenario:TC001_KampanyaOluşturma

    Given Kullanici designer sayfasina gider
    When Kullanici gecerli username girer
    And Kullanici gecerli password girer
    And Kullanici login buttonuna tıklar
    And Kullanıcı Campaigns klasörüne tıklar
    And Kullanıcı mehmetDemir klasörüne sag tıklar
    And Kullanıcı KampanyaEkle ye tıklar
    And Kullanıcı Kampanya adı girer
    And Kullanıcı kaydet butonuna tıklar
    And Kullanıcı kampanya modunu secer
    And Kullanıcı outbound secenegine tıklar
    And Kullanıcı varsayılan sonuç kodunu secer
    Then Kullanıcı Kaydet e tıklar

