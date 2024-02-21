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
    Then Kaydın eklenip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      |                 | test_log2 |
      | is zamanlayici_ |           |
      |                 |           |
      | is zamanlayici_ | test_log2 |


  @PlanlanmışİşlerİşAdıİleİçeriktenArama
  Scenario:TC_001 Planlanmış işler iş adı ile içerikten arama
    And İçerik ara searchbox ına tıklar
    And İçerik ara kısmına aramak istediği iş adını "" girer
    And Aradığı işin listede olduğunu doğrular


  @PlanlanmışİşlerScriptAdıİleİçeriktenArama
  Scenario:TC_001 Planlanmış işler iş adı ile içerikten arama
    And İçerik ara searchbox ına tıklar
    And İçerik ara kısmına aramak istediği işin scriptini "" girer
    And Aradığı işin listede olduğunu doğrular


  @AynıİsimdeİşZamanlayıcıEkleme
  Scenario:TC_009 Aynı isimle İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And Açılan modalda İş adı alanına var olan bir işin ismi "dmr" girilir
    And Scripts combosundan bir script "test" seçer
    And Dakika tabını geçer
    And Dakika combosundan değer 5 seçer
    And Saniye combosundan değer 25 seçer
    And Kaydet butona tıklar
    Then Eklemeye çalıştığınız iş aynı bilgilerle önceden oluşturulmuştur uyarısını görür
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @DakikayaGöreİşZamanlayıcıGüncelleme
  Scenario:Tc_004 Planlanmış işin Sıklık alanında Dakika tabını güncelleme

    And Listelenen planlanmış işlerden herhangi biri için "VarOlanİşiGüncelle" Düzenle iconuna tıklanır
    And Dakika tabını geçer
    And Dakika combosundan değer 40 seçer
    And Saniye combosundan değer 45 seçer
    And Kaydet butona tıklar
    Then Planlanmış iş güncellendi yazısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @SaateGöreİşZamanlayıcıEkleme
  Scenario Outline:TC_002 Saate göre çalışan İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And İş adı alanına "<is Adi>" giriş yapar
    And Scripts combosundan bir script "<scrript>" seçer
    And Saat Tab'ına geçer
    And Saat combosundan değer 6 seçer
    And Dakika combosundan değer 5 seçer
    And Saniye combosundan deger 25 seçer
    And Kaydet butona tıklar
    Then Kaydın eklenip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      | is zamanlayici_ | test_log2 |


  @SaateGöreİşZamanlayıcıGuncelleme
  Scenario: TC_005 Planlanmış işin Sıklık alanında Saat tabını güncelleme

    And Listelenen planlanmış işlerden herhangi biri için "VarOlanİşiGüncelle" Düzenle iconuna tıklanır
    And Saat Tab'ına geçer
    And Saat combosundan değer 17 seçer
    And Dakika combosundan değer 17 seçer
    And Saniye combosundan deger 17 seçer
    And Kaydet butona tıklar
    Then Planlanmış iş güncellendi yazısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @GüneGöreİşZamanlayıcıEkleme
  Scenario Outline:TC_003 Güne göre çalışan İş Zamanlayıcı ekleme

    And Ekle ikonuna tıklar
    And İş adı alanına "<is Adi>" giriş yapar
    And Scripts combosundan bir script "<scrript>" seçer
    And Gün Tab'ına geçer
    And Gün combosunda deger 5 seçer
    And Saat combosunda değer 6 seçer
    And Dakika combosunda değer 5 seçer
    And Saniye combosunda değer 25 seçer
    And Kaydet butona tıklar
    Then Kaydın eklenip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      | is zamanlayici_ | test_log2 |


  @GüneGöreİşZamanlayıcıGüncelleme
  Scenario:TC_006 Planlanmış işin Sıklık alanında Gün tabını güncelleme

    And Listelenen planlanmış işlerden herhangi biri için "VarOlanİşiGüncelle" Düzenle iconuna tıklanır
    And Gün Tab'ına geçer
    And Gün combosunda deger 4 seçer
    And Saat combosunda değer 4 seçer
    And Dakika combosunda değer 4 seçer
    And Saniye combosunda değer 4 seçer
    And Kaydet butona tıklar
    Then Planlanmış iş güncellendi yazısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


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
    Then Kaydın eklenip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   | Gun Adi |
      | is zamanlayici_ | test_log2 | Cuma    |


  @HaftayaGöreİşZamanlayıcıGüncelleme
  Scenario:TC_007 Planlanmış işin Sıklık alanında Hafta tabını güncelleme

    And Listelenen planlanmış işlerden herhangi biri için "VarOlanİşiGüncelle" Düzenle iconuna tıklanır
    And Hafta Tab'ına geçer
    And Bir gün "Perşembe" seçer
    And Saat combosundan değer 12 girer
    And Dakika combosundan değer 12 girer
    And Saniye combosundan değer 12 girer
    And Kaydet butona tıklar
    Then Planlanmış iş güncellendi yazısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


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
    Then Kaydın eklenip eklenmedigini doğrular
    Examples:
      | is Adi          | scrript   |
      | is zamanlayici_ | test_log2 |


  @AyaGöreİşZamanlayıcıGüncelleme
  Scenario:TC_008 Planlanmış işin Sıklık alanında Hafta tabını güncelleme

    And Listelenen planlanmış işlerden herhangi biri için "VarOlanİşiGüncelle" Düzenle iconuna tıklanır
    And Ay Tab'ına geçer
    And Ay combosundan değer 3 girer
    And Gün combosunda deger 3 girer
    And Saat combosunda değer 3 girer
    And Dakika combosunda değer 3 girer
    And Saniye combosunda değer 3 girer
    And Kaydet butona tıklar
    Then Planlanmış iş güncellendi yazısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.

  @PlanlanmışİşiVarOlanİsimleGüncelleme
  Scenario: TC_001 Planlanmış işin ismini var olan bir işin ismine güncellemeye çalışma
    And Listelenen planlanmış işlerden herhangi biri için "xx" Düzenle iconuna tıklanır
    And Açılan modalda İş adı alanına var olan bir işin ismi "VarOlanİşiGüncelle" girilir
    And Kaydet butona tıklar
    Then Eklemeye çalıştığınız iş aynı bilgilerle önceden oluşturulmuştur uyarısını görür
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @PlanlanmışİşiİşAdınıGüncelleme
  Scenario:TC_002 Planlanmış işin İş adı alanını güncelleme

    And Listelenen planlanmış işlerden herhangi biri için "xx" Düzenle iconuna tıklanır
    And İş adı alanına "is Adi_" giriş yapar
    And Kaydet butona tıklar
    Then Planlanmış iş güncellendi yazısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @PlanlanmışİşinScriptAlanınıGuncelleme
  Scenario:TC_003 Planlanmış işin Scripts alanını güncelleme

    And Listelenen planlanmış işlerden herhangi biri için "is Adi_424-19-1938" Düzenle iconuna tıklanır
    And Scripts combosundan bir script "test_log2" seçer
    And Kaydet butona tıklar
    Then Planlanmış iş güncellendi yazısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @BirKereÇalıştır
  Scenario: TC_001 Planlanmış işi Bir Kere Çalıştır iconu kullanarak bir kez çalıştırma

    And Listelenen planlanmış işlerden herhangi biri için "is zamanlayici_809-57-3708" Bir Kere Çalıştır iconuna tıklar
    Then Çalıştırıldı yazan bilgilendirme pop up ının gelmesi beklenir.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @PlanlanmışişiDurdur
  Scenario:TC_001 Planlanmış işi Durdur iconu kullanarak durdurma

    And Listelenen planlanmış işlerden herhangi biri için "is zamanlayici_809-57-3708" planlanmış işi durdur iconuna tıklar
    Then Zamanlanan İş Durduruldu yazan bilgilendirme pop up ının gelmesi beklenir.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.
    And İşlem yapılan planlanmış iş için kırmızı olan Durdur iconunun yeşil Çalıştırmaya Devam Et iconuna dönüşmesi beklenir.


  @PlanlanmışİşiTekrarÇalıştırma
  Scenario:TC_001 Planlanmış işi Çalıştırmaya devam et iconu kullanarak bir kez çalıştırma

    And Listelenen planlanmış işlerden herhangi biri için "is zamanlayici_809-57-3708" planlanmış işi durdur iconuna tıklar
    Then Durdurulmuş İş Tekrar Çalıştırıldı yazan bilgilendirme pop up ının gelmesi beklenir.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.
    And İşlem yapılan planlanmış iş için yeşil olan Çalıştırmaya Devam Et iconunun kırmızı Durdur iconuna dönüşmesi beklenir.


  @PlanlanmışİşiSilmeme
  Scenario:TC_001 Planlanmış işi Çöp kutusu iconu kullanarak silme

    And Listelenen planlanmış işlerden çalışan bir iş için "is zamanlayici_809-57-3708" Çöp kutusu iconuna tıklanır
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then planlanan iş silindi uyarısını görmez.


  @PlanlanmışİşiSilme
  Scenario:TC_001 Planlanmış işi Çöp kutusu iconu kullanarak silme

    And Listelenen planlanmış işlerden çalışan bir iş için "is zamanlayici_809-57-3708" Çöp kutusu iconuna tıklanır
    And Onay butonuna tıklar
    Then planlanan iş silindi uyarısını görür.
    And Pop uptaki Kapat butonu kullanılarak pop up kapatılır.


  @SilinenişiAktifleştirme
  Scenario:TC_001 Silinen işi Aktif et iconu kullanarak tekrar aktifleştirme

    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir tıklanır.
    And Silinen planlanmış işlerden herhangi biri için "dmr" Aktif et iconuna tıklanır
    Then Silinen planlanmış işin "dmr" aktif edildiği ve listelendiği görülür.





























































