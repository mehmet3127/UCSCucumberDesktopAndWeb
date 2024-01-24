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
    And Alan adını "Alan_" girer
    And Etiket adını "Etiket_" girer
    And Db adını "Db_" girer
    And Özellikler tabına geçip Maksimum veri uzunluğunu 20 girilir
    And Veriler tab'ına geçer
    And 2 adet anahtar değer ve görünen değer ekler
    And Kaydet butonuna tıklar.
    Then Veri setinin eklendiğini doğrular
    Examples:
      | Form Alan Tipi | Veri Tipi   |
      #| ComboBox         | Karakter    |
      #| ComboBox       |  Nümerik  |
      |                | Nümerik Kod |
      #| ComboBox         | Tarih       |
      #| ListBox          | Karakter    |
      #| ListBox          | Nümerik     |
      ##Bu durumda max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      #| ListBox          | Nümerik Kod |
      ##Bu durumda max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      #| ListBox          | Tarih       |
      #| TextBox        | Karakter  |
      #| TextBox          | Nümerik     |
      #| TextBox          | Nümerik Kod |
      #| TextBox          | Tarih       |
      #| MultilineTextBox | Karakter    |
      #| CheckBox         | Nümerik Kod |

     #Note:Veri titpi tarih seçiince max veri uzunluğu defoult olarak 10 geliyor
     #     ama anahtar değer 10 karakterde fazla girince uyarı vermiyor














