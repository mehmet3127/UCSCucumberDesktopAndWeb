
Feature: Kampanya_Oluşturma

  @KampanyaOluşturma
  Scenario:TC001_KampanyaOluşturma

    Given Kullanici designer sayfasina gider
    When Kullanici gecerli username girer
    And Kullanici gecerli password girer
    And Kullanici login buttonuna tıklar
    And Kullanıcı Campaigns klasörüne tıklar
    And Kullanıcı "Test" klasörüne sag tıklar
    And Kullanıcı KampanyaEkle ye tıklar
    And Kullanıcı Kampanya adı "Otomasyon_" girer
    And Kullanıcı kaydet butonuna tıklar
    And Kullanıcı kampanya modunu secer
    And Kullanıcı arama tipini "Outbound" secer
    And Kullanıcı varsayılan sonuç kodunu "Agent Geri Arama Hatasi (1001)" secer
    Then Kullanıcı Kaydet e tıklar

