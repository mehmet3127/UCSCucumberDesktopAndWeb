@İşZamanlayıcı
Feature:TaskScheduler_İş Zamanlayıcı Sayfası


  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Test Scheduler butonuna tıklar
    And İş zamanlayıcı sekmesine tıklar

  @DakikayaGöreİşZamanlayıcıEkleme
  Scenario Outline:TC_001 Dakikaya göre çalışan İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And İş adı alanına "<is Adi>" giriş yapar
    And Scripts combosundan bir script "<scrript>" seçer
    And Dakika tabını geçer
    And Dakika combosundan değer 5 seçer
    And Saniye combosundan değer 25 seçer
    And Kaydet butona tıklar
    Then Kaydın eklendiğip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      |                 | test_log2 |
      | is zamanlayici_ |           |
      |                 |           |
      | is zamanlayici_ | test_log2 |


  @SaateGöreİşZamanlayıcıEkleme
  Scenario Outline:TC_002 Saate göre çalışan İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And İş adı alanına "<is Adi>" giriş yapar
    And Scripts combosundan bir script "<scrript>" seçer
    And Saat Tab'ına geçer
    And Saat combosundan değer 6 seçer
    And Dakika combosundan değer 5 seçer
    And Saniye combosundan değer 25 seçer
    And Kaydet butona tıklar
    Then Kaydın eklendiğip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      | is zamanlayici_ | test_log2 |

  @GüneGöreİşZamanlayıcıEkleme
  Scenario Outline:TC_003	Güne göre çalışan İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And İş adı alanına "<is Adi>" giriş yapar
    And Scripts combosundan bir script "<scrript>" seçer
    And Gün Tab'ına geçer
    And Gün combosunda deger 5 seçer
    And Saat combosunda değer 6 seçer
    And Dakika combosunda değer 5 seçer
    And Saniye combosunda değer 25 seçer
    And Kaydet butona tıklar
    Then Kaydın eklendiğip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      | is zamanlayici_ | test_log2 |


  @HaftayaGöreİşZamanlayıcıEkleme
  Scenario Outline:TC_004 Haftanın gününe göre çalışan İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And İş adı alanına "<is Adi>" giriş yapar
    And Scripts combosundan bir script "<scrript>" seçer
    And Hafta Tab'ına geçer
    And Bir gün "<Gun Adi>" seçer
    And Saat combosundan değer 6 girer
    And Dakika combosundan değer 5 girer
    And Saniye combosundan değer 25 girer
    And Kaydet butona tıklar
    Then Kaydın eklendiğip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   | Gun Adi   |
      | is zamanlayici_ | test_log2 | Cuma |


  @AyaGöreİşZamanlayıcıEkleme
  Scenario Outline:TC_005 Ayın gününe göre çalışan İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And İş adı alanına "<is Adi>" giriş yapar
    And Scripts combosundan bir script "<scrript>" seçer
    And Ay Tab'ına geçer
    And Ay combosundan değer 4 girer
    And Gün combosunda deger 5 girer
    And Saat combosunda değer 6 girer
    And Dakika combosunda değer 5 girer
    And Saniye combosunda değer 25 girer
    And Kaydet butona tıklar
    Then Kaydın eklendiğip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      | is zamanlayici_ | test_log2 |




