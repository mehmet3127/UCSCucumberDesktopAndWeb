@VeriSetiEkleme
Feature: Veri Setleri Veri Seti Ekleme

  Scenario Outline: Veri Seti Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Veri seti ekle ikonuna tıklar
    And Form alan tipini "<Form Alan Tipi>" seçer
    And Veri tipini "<Veri Tipi>" seçer
    Then Özellikler tabının etkin olduğu görülür
    Then Veriler tabının etkin olduğu görülür
    And Alan adını girer
    And Etiket adını girer
    And Db adını girer
    And Özellikler tabına geçip Maksimum veri uzunluğu girilir
    And Veriler tab'ına geçer
    And Anahtar değer ve görünen değer ekler
    And Kaydet butonuna tıklar.
    Then Veri setinin eklendiğini doğrular
    Examples:
      | Form Alan Tipi | Veri Tipi   |
      | ComboBox       | Karakter    |
      | ComboBox       | Nümerik     |
      | ComboBox       | Nümerik Kod |
      | ComboBox       | Tarih       |
      | ListBox        | Karakter    |
      #| ListBox        | Nümerik     | Bu durumda combobox da ki gibi max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      #| ListBox        |Nümerik Kod|   Bu durumda combobox da ki gibi max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      | ListBox        | Tarih       |
















