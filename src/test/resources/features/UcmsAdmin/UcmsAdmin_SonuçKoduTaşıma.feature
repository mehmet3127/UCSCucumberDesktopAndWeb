@SonuçKoduTaşıma
Feature: Sonuç Kodu Taşıma

  @SonuçKoduTaşımaEvet
  Scenario: TC_001	Dizin değiştir iconu kullanılarak sonuç kodu taşıma Onay penceresine evet dendiğinde
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Değiştirmek istediği sonuç kodunun kod grubuna tıklar
    And Değiştirmek istediği sonuç kodunun dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde evet e tıklanır
    Then Sonuç kodunun dizinin değiştiği görülür.

  @SonuçKoduTaşımaVazgeç
  Scenario: TC_002	Dizin değiştir iconu kullanılarak sonuç kodu taşıma Onay penceresine vazgeç dendiğinde
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Değiştirmek istediği sonuç kodunun kod grubuna tıklar
    And Değiştirmek istediği sonuç kodunun dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Sonuç kodunun dizinin değişmediğini görülür.

  @SonuçKoduTaşımaİptal
  Scenario: TC_003	Dizin değiştir iconu kullanılarak sonuç kodu taşıma iptal butonu kontrolu
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Değiştirmek istediği sonuç kodunun kod grubuna tıklar
    And Değiştirmek istediği sonuç kodunun dizin değiştir iconuna tıklar
    And İptal icon'una tıklar
    Then Sonuç kodunun dizinin değişmediğini görülür.

  @PasifSonuçKoduTaşımaEvet
  Scenario: TC_004	Dizin değiştir iconu kullanılarak pasif sonuç kodunu taşıma Onay penceresine evet dendiğinde
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    And Değiştirmek istediği sonuç kodunun kod grubuna tıklar
    And Değiştirmek istediği pasif sonuç kodunun dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde evet e tıklanır
    Then Sonuç kodunun dizinin değiştiği görülür.

  @PasifSonuçKoduTaşımaVazgeç
  Scenario: TC_005	Dizin değiştir iconu kullanılarak pasif sonuç kodu taşıma Onay penceresine vazgeç dendiğinde
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    And Değiştirmek istediği sonuç kodunun kod grubuna tıklar
    And Değiştirmek istediği pasif sonuç kodunun dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Sonuç kodunun dizinin değişmediğini görülür.

  @PasifSonuçKoduTaşımaİptal
  Scenario: TC_006	Dizin değiştir iconu kullanılarak sonuç kodu taşıma iptal butonu kontrolu
    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    And Değiştirmek istediği sonuç kodunun kod grubuna tıklar
    And Değiştirmek istediği pasif sonuç kodunun dizin değiştir iconuna tıklar
    And İptal icon'una tıklar
    Then Sonuç kodunun dizinin değişmediğini görülür.











