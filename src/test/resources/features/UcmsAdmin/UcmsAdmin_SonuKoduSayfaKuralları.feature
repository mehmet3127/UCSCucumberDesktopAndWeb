Feature: Sonuç Kodu Sayfa Kuralları


  Scenario: TC_001	Sonraki arama davranışı alanı check box kurallarının kontrolü

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar
    And Güncellemek istediği sonuç kodunun "Kod Grubuna" tıklar
    And Güncellemek istediği "sonuç kodu" güncelle ıkonuna tıklar
    And Açılan pencereden Randevuyu Sistem Belirlesin sekmesine tıklar
    And Açılan Randevu Özellikleri alanındaki Randevu Tipi combosunda Otomatik Grup Randevu işaretlenir
    And Dakika alanına süre girilir.
    And Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box seçilemez olduğu görülür.
    And Sonraki arama davranışı alanında Bir Sonraki Kontağa Geç check box işaretlenir.
    And Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box seçilebilir olduğu görülür.
    And Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box işaretlenir.
    And Sonraki arama davranışı alanında Bir Sonraki Kontağa Geç  check box işareti kaldırılır.
    And Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box seçilemez olduğu ve işaretinin kaldırıldığı görülür.
    And Güncelle butonuna tıklar
    And Sonuç kodunun güncellendiğini doğrular
















