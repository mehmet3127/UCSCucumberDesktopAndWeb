@ScriptTanımı
Feature: Script Tanımı

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Test Scheduler butonuna tıklar
    And Script Tanımı sekmesine tıklar


  @ScriptTanımıEkleme
  Scenario:TC_001 Script Tanımı ekleme

    And Ekle ikonuna tıklar
    And Script adı alanına değer "test_scriptname_" girilir
    And Bağlantı combosundan bir bağlantı "test1234" seçilir
    And Komut zaman aşımı alanına değer "100" girilir
    And Script alanına değer "select getdate()" girilir
    And Kaydet butona tıklar
    Then Scriptin kaydedildigini dogrular


  @ScriptTanımıBağlantıDüzenleme
  Scenario:TC_002 Script Tanımı Bağlantı düzenleme

    And Listeden bir kaydın "test_scriptname_526-61-4304" düzenle ikonuna tıklar
    And Bağlantı combosundan bir bağlantı "testucms26" seçilir
    And Kaydet butona tıklar
    Then Güncelleme işleminin yapıldığını doğrular


  @ScriptTanımıKomutZamanAşımıDüzenleme
  Scenario:TC_003 Script Tanımı Komut zaman aşımı düzenleme

    And Listeden bir kaydın "test_scriptname_526-61-4304" düzenle ikonuna tıklar
    And Komut zaman aşımı alanına değer "205" girilir
    And Kaydet butona tıklar
    Then Güncelleme işleminin yapıldığını doğrular


  @ScriptTanımıScriptDüzenleme
  Scenario:TC_004 Script Tanımı Script düzenleme

    And Listeden bir kaydın "test_scriptname_526-61-4304" düzenle ikonuna tıklar
    And Script alanına değer "select * from CpnNo" girilir
    And Kaydet butona tıklar
    Then Güncelleme işleminin yapıldığını doğrular


    #ScriptName göre düzenleme yaptıgımız için script adını en son güncellemek istedim
  @ScriptTanımıScriptAdıDüzenleme
  Scenario:TC_001 Script Tanımı Script adı düzenleme

    And Listeden bir kaydın "test_log174-87-1083" düzenle ikonuna tıklar
    And Script adı alanına değer "update" girilir
    And Kaydet butona tıklar
    Then Güncelleme işleminin yapıldığını doğrular


  @ScriptAdıBosBırakarakScriptTanımıEkleme
  Scenario:TC_002 Script adı boş bırakılarak Script Tanımı ekleme

    And Ekle ikonuna tıklar
    And Script adı alanına değer "" girilir
    And Bağlantı combosundan bir bağlantı "test1234" seçilir
    And Komut zaman aşımı alanına değer "100" girilir
    And Script alanına değer "select getdate()" girilir
    And Kaydet butona tıklar
    Then Script adı boş bırakılamaz uyarısı geldiği görülür


  @BağlantıCombosuBoşBırakılarakScriptTanımıEkleme
  Scenario:TC_003 Bağlantı combosu boş bırakılarak Script Tanımı ekleme

    And Ekle ikonuna tıklar
    And Script adı alanına değer "test_scriptname_" girilir
    And Bağlantı combosundan bir bağlantı "" seçilir
    And Komut zaman aşımı alanına değer "100" girilir
    And Script alanına değer "select getdate()" girilir
    And Kaydet butona tıklar
    Then Bağlantı boş bırakılamaz uyarısı geldiği görülür


  @KomutZamanAşımıBoşBırakılarakScriptTanımıEkleme
  Scenario:TC_004 Komut zaman aşımı boş bırakılarak Script Tanımı ekleme

    And Ekle ikonuna tıklar
    And Script adı alanına değer "test_scriptname_" girilir
    And Bağlantı combosundan bir bağlantı "test1234" seçilir
    And Komut zaman aşımı alanına değer "" girilir
    And Script alanına değer "select getdate()" girilir
    And Kaydet butona tıklar
    Then Komut zaman aşımı boş bırakılamaz uyarısı geldiği görülür


  @ScriptBoşBırakılarakScriptTanımıEkleme
  Scenario:TC_005 Script boş bırakılarak Script Tanımı ekleme

    And Ekle ikonuna tıklar
    And Script adı alanına değer "test_scriptname_" girilir
    And Bağlantı combosundan bir bağlantı "test1234" seçilir
    And Komut zaman aşımı alanına değer "100" girilir
    And Script alanına değer "" girilir
    And Kaydet butona tıklar
    Then Script boş bırakılamaz uyarısı geldiği görülür


  @ScriptAdıAynıOlanScriptTanımıEkleme
  Scenario:TC_006 Script adı aynı olan Script Tanımı ekleme

    And Ekle ikonuna tıklar
    And Script adı alanına var olan değer "test_scriptname" girilir
    And Bağlantı combosundan bir bağlantı "test1234" seçilir
    And Komut zaman aşımı alanına değer "100" girilir
    And Script alanına değer "select getdate()" girilir
    And Kaydet butona tıklar
    Then Script adı mevcut uyarısı geldiği görülür


  @KomutZamanAsımıNumerikKontrolü
  Scenario:TC_007	Komut zaman aşımı numerik kontrolü

    And Ekle ikonuna tıklar
    And Komut zaman aşımı alanına değer "String" girilir
    Then Girilen değerin yazılmadığı görülür




























