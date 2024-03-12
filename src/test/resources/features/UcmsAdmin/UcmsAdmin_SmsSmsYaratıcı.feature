@SmsYaratıcı
Feature:Ucms Admin_Sms_SmsYaratıcı

  @SmsYaratıcıOluşturma
  Scenario Outline:TC_001 SMS Yaratıcı oluşturma

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And SMS Yaratıcı sekmesine tıklar
    And Ekle ikonuna tıklar
    And Açılan ekranda Yaratıcı Id "<Yaratici Id>" ve Yaratıcı Adı "<Yaratici Adi>" girer
    And Kaydet butona tıklar
    Then SMS Yaratıcı eklendiğini doğrular
    Examples:
      | Yaratici Id | Yaratici Adi |
      #|             |              |
      #|             | YaraticiAdi_ |
      #| -           |              |
      | -           | YaraticiAdi_ |


  @SmsYaratıcıDüzenleme
  Scenario Outline:SMS Düzenleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And SMS Yaratıcı sekmesine tıklar
    And Düzenlemek istediği Sms yaratıcı "234724547" düzenle ikonuna tıklar
    And Açılan ekranda Yaratıcı Id "<Yaratici Id>" ve Yaratıcı Adı "<Yaratici Adi>" girer
    And Güncelle butonuna tıklar.
    Then SMS güncellendiğini eklendiğini doğrular
    Examples:
      | Yaratici Id | Yaratici Adi |
      #|             |              |
      #|             | YaraticiAdi_ |
      #| -           |              |
      #| -           | YaraticiAdi_ |

    #NOT:Otomasyon ile düzenleme yaparken ıd ve adı silince Güncellenmemesi gerekirken güncelleniyor


  @SmsYaratıcıSilme
  Scenario:TC_001	SMS Yaratıcı Silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sms butonuna tıklar
    And SMS Yaratıcı sekmesine tıklar
    And Silmek istediği Sms yaratıcının "870560480" sil ikonuna tıklar
    And Onay butonuna tıklar
    Then Sms yaratıcı nın silindiğini doğrular
    #NOT: Sms yaratıcı silindiğini doğrular pir PopUp çıkmadığı ve ara








