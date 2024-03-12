@ListelerDnc
Feature: Listeler_dNC


  @ManuelDncEkleme
  Scenario Outline:Manuel DNC Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Listeler butonuna tıklar
    And DNC sekmesine tıklar
    And Ekle ikonuna tıklar
    And Açılan pencerede Manuel DNC Kaydı ekle tabına geçer
    And CampId alanına "<campId>" giriş yapar
    And Telefon numarasına alanına "<telNo>" giriş yapar
    And ClientId alanına "<clientId>" giriş yapar
    And Kaydet butona tıklar
    Then Manuel DNC Kaydı eklenip eklenmedigini doğrular
    Examples:
      | campId | telNo | clientId |
      | campId | telNo | clientId |
      |        | telNo | clientId |
      | campId |       | clientId |
      | campId | telNo |          |
      | campId |       |          |
      |        | telNo |          |
      |        |       | clientId |



  @DncArama
  Scenario Outline:DNC'i içerikten arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Listeler butonuna tıklar
    And DNC sekmesine tıklar
    And Arama katagorisinden "<AramaKatagorisi>" yu seçer
    And İçerik ara kısmına aramak istediği DNC in "<Data>" sunu girer
    And Ara butonuna tıklar
    And Var olan DNC'in olduğunu görür
    Examples:
      | AramaKatagorisi | Data       |
      | ClientNo        | 2          |
      | TelNo           | 5445044466 |
      | CampId          | 1          |


  @DNCListeEklemeUygunOlmayanFormat
  Scenario Outline:TC_002-TC_003-DNC Liste Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Listeler butonuna tıklar
    And DNC sekmesine tıklar
    And Ekle ikonuna tıklar
    And Açılan pencerede dosya seç butonu ile "<Dosya Path>" dosya seçilir
    And İşlem combosunda DNC Liste ekle seçilir
    And Kaydet butona tıklar
    Then DNC Kaydı eklenmediğini doğrular
    Examples:
      | Dosya Path                                                               |
      | C:\Users\demir\OneDrive\Masaüstü\MultiLineTextBox ve TextBox seçildi.txt |
      | C:\Users\demir\OneDrive\Masaüstü\Uygulama Bazlı Test Senaryo Raporu.xlsx |


  @DNCListeEkleme
  Scenario Outline:TC_001 DNC Liste Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Listeler butonuna tıklar
    And DNC sekmesine tıklar
    And Ekle ikonuna tıklar
    And Açılan pencerede dosya seç butonu ile "<Dosya Path>" dosya seçilir
    And İşlem combosunda DNC Liste ekle seçilir
    And Kaydet butona tıklar
    Then Listedeki satırlar kadar DNC Kaydı eklendiğini doğrular
    Examples:
      | Dosya Path                                         |
      | C:\Users\demir\OneDrive\Masaüstü\testdata_dnc.xlsx |


  @DNCListeSilme
  Scenario Outline:TC_002 DNC Liste Silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Listeler butonuna tıklar
    And DNC sekmesine tıklar
    And Ekle ikonuna tıklar
    And Açılan pencerede dosya seç butonu ile "<Dosya Path>" dosya seçilir
    And İşlem combosunda DNC Liste sil seçilir
    And Kaydet butona tıklar
    And Onay butonuna tıklar
    Then Listedeki satırlar kadar DNC Kaydı silinğini doğrular
    Examples:
      | Dosya Path                                         |
      | C:\Users\demir\OneDrive\Masaüstü\testdata_dnc.xlsx |













