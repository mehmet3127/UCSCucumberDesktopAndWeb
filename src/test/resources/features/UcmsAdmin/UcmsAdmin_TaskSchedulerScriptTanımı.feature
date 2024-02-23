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


  @ScriptTanımıScriptAdıBoşBırakarakDüzenleme
  Scenario:TC_005 Script Tanımı Script adı boş bırakarak düzenleme

    And Listeden bir kaydın "test_scriptname_526-61-4304" düzenle ikonuna tıklar
    And Script adı alanına değer "" girilir
    And Kaydet butona tıklar
    Then Script adı boş bırakılamaz uyarısı geldiği görülür


  @ScriptTanımıKomutZamanAşımıBoşBırakarakDüzenleme
  Scenario:TC_006 Script Tanımı Komut zaman aşımı boş bırakarak düzenleme

    And Listeden bir kaydın "test_scriptname_526-61-4304" düzenle ikonuna tıklar
    And Komut zaman aşımı alanına değer "" girilir
    And Kaydet butona tıklar
    Then Komut zaman aşımı boş bırakılamaz uyarısı geldiği görülür


  @ScriptTanımıScriptBoşBırakarakDüzenleme
  Scenario:TC_007 Script Tanımı Script boş bırakarak düzenleme

    And Listeden bir kaydın "test_scriptname_526-61-4304" düzenle ikonuna tıklar
    And Script alanına değer "" girilir
    And Kaydet butona tıklar
    Then Script boş bırakılamaz uyarısı geldiği görülür


  @ScriptAdıAynıOlanScriptTanımıDüzenleme
  Scenario:TC_008	Script adı aynı olan Script Tanımı düzenleme

    And Listeden bir kaydın "test_scriptname_526-61-4304" düzenle ikonuna tıklar
    And Script adı alanına var olan değer "test_scriptname" girilir
    And Kaydet butona tıklar
    Then Script adı mevcut uyarısı geldiği görülür


  @ScriptTanımıScriptAdıDüzenleme
  Scenario:TC_001 Script Tanımı Script adı düzenleme

    And Listeden bir kaydın "test_log174-87-1083" düzenle ikonuna tıklar
    And Script adı alanına değer "update" girilir
    And Kaydet butona tıklar
    Then Güncelleme işleminin yapıldığını doğrular
    #ScriptName göre düzenleme yaptıgımız için script adını en son güncellemek istedim


  @ScriptTanımıSilmeme
  Scenario: TC_002 Script Tanımı silmeme

    And Listeden bir kaydın "test_sc1" sil ikonuna tıklar
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Script tanımının listeden silinmediğini doğrular


  @ScriptTanımıSilme
  Scenario: TC_001	Script Tanımı silme

    And Listeden bir kaydın "update512-67-2511" sil ikonuna tıklar
    And Onay butonuna tıklar
    And 1 saniye bekler
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir tıklanır.
    Then Script tanımının "update512-67-2511" listeden sildiğini doğrular
    #Script silindi popUp kısa sürede kayboldugu için göremiyor olabilir



  @SilinenScriptTanımınıAktifEtme
  Scenario:TC_001	Silinen Script Tanımını aktif etme

    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir tıklanır.
    And Listeden silinmiş bir kaydın "update512-67-2511" aktif et ikonuna tıklar
    Then Silinen "update512-67-2511" Script tanımının aktif edildiğini doğrular


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
  Scenario:TC_007 Komut zaman aşımı numerik kontrolü

    And Ekle ikonuna tıklar
    And Komut zaman aşımı alanına değer "String" girilir
    Then Girilen değerin yazılmadığı görülür




























