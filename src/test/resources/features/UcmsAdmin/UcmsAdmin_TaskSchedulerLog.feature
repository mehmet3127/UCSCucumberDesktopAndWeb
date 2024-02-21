@TaskSchedulerLog
Feature: TaskScheduler_Log Sayfası

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Test Scheduler butonuna tıklar
    And Log sekmesine tıklar

  @İşAdiİleLogAramaVeSıfırLama
  Scenario:TC_001 İş adı ile log arama & TC_001	Yapılan filtreleme işleminin kaldırılıması

    And İş adı searchBoxına aramak istediği logun iş adını "sontest1" girer
    And Filtre butonuna tıklar
    Then Aradığı "sontest1" log'un olduğunu doğrular
    And Sıfırla butonuna tıklar
    Then Yapılan filtreleme işleminin kaldırlıdığını görür


  @oluşturanOlarakLogArama
  Scenario:TC_002 Oluşturan olarak log arama

    And İş adı searchBoxına aramak istediği logun oluşturanı "Quartz" girer
    And Filtre butonuna tıklar
    Then Aradığı "Quartz" log'un olduğunu doğrular


  @BelirliTarihAralığındakiLoglarıArama
  Scenario:TC_003 Belirli tarih aralığındaki logları arama

    And Başlangıç "20.02.2024" ve bitiş "21.02.2024" tarihini seçer
    And Filtre butonuna tıklar
    Then Belirtilen tarih aralığındaki Logların listelendiğini görür


  @BaşlangıçVeBitişTarihAlanınısıfırlama
  Scenario:TC_001 Seçilen başlangıç tarihi alanının sıfırlanması

    And Başlangıç "20.02.2024" ve bitiş "21.02.2024" tarihini seçer
    And Başlangıç tarihi sıfırlama ikonuna tıklar
    And Bitiş tarihi sıfırlama ikonuna tıklar


  @LogSıralama
  Scenario Outline:Logları iş adına-oluşturana-tarihe ve log kaydına göre sıralama

    And Logları "<Sıralama>" sıralama butonuna tıklar
    Then Logların "<Dogrulama>" göre sıralandığını görür
    Examples:
      | Sıralama  | Dogrulama |
      | İş Adı    | İş Adı    |
      | Oluşturan | Oluşturan |
      | Log       | Log       |
      | Tarih     | Tarih     |






























