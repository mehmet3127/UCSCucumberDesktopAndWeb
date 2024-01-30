@VeriSetileri
Feature: Veri Setleri

  @VeriSetiEkle
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
    And Özellikler tabına geçip Maksimum veri uzunluğunu 38 girilir
    And Veriler tab'ına geçer
    And 2 adet anahtar değer ve görünen değer ekler
    And Kaydet butonuna tıklar.
    Then Veri setinin eklendiğini doğrular
    Examples:
      | Form Alan Tipi | Veri Tipi |
      #| ComboBox       | Karakter  |
      #| ComboBox       |  Nümerik  |
      #| ComboBox       | Nümerik Kod |
      | ComboBox       | Tarih     |
      #| ListBox          | Karakter    |
      #| ListBox          | Nümerik     |
      ##Bu durumda max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      #| ListBox          | Nümerik Kod |
      ##Bu durumda max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      #| ListBox          | Tarih       |
      #| TextBox        | Karakter  |
      #| TextBox        | Nümerik   |
      #| TextBox          | Nümerik Kod |
      #| TextBox          | Tarih       |
      #| MultilineTextBox | Karakter  |
      #| CheckBox       | Nümerik Kod |

     #Note:Veri titpi tarih seçiince max veri uzunluğu defoult olarak 10 geliyor
     #     ama anahtar değer 10 karakterde fazla girince uyarı vermiyor


  @VeriSetiArama
  Scenario: TC_002	Var olan veri setini ismi ile içerikten arama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And İçerik ara searchbox ına tıklar
    And Aramak istediği veri setinin "" ismini girer
    Then Veri setinin olduğunu doğrular


  @VeriSetiPasifEtme
  Scenario: TC_002 Devre dışı bırak iconu kullanarak aktif veri setini pasif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Aktif olan veri setinin "" Aktif-Pasif et iconuna tıklanır
    Then Veri setinin aktif-Pasif edildiğini doğrular


  @VeriSetiAktifEtme
  Scenario:TC_001 Aktif et iconu kullanarak pasif veri setini aktif etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Aktif olan veri setinin "" Aktif-Pasif et iconuna tıklanır
    Then Veri setinin aktif-Pasif edildiğini doğrular


  @CheckBoxİleVeriSetiPasifEtme
  Scenario:TC_001 Checkbox ile aktif olan veri setini seçip pasif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Aktif yada Pasif etmek istediği veri setinin "" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular


  @CheckBoxİleVeriSetiAktifEtme
  Scenario:TC_001 Checkbox ile pasif olan veri setini seçip aktif hale getirme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Aktif yada Pasif etmek istediği veri setinin "" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular


  @ignore
  #@PasifVeriSetleriniListeleme
  Scenario: TC_001 Tüm(aktif/pasif) veri setlerini listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    Then İnaktif veri setilerinin listelendiği görülür


  @AktifVeriSetleriniListeleme
  Scenario: TC_002 Yalnızca Aktif veri setlerini listeleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Açılan Devre dışı bırakılanlar toggle'ı kapatılır
    Then Yalnızca aktif veri setlerinin listelendiği görülür


  @VeriSetiKopyalama
  Scenario: TC_001 Form Alanı tipi TextBox ve Veri tipi Numerik olan Veri seti kopyalama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Kopyalamak istediği veri setinin "Etiket_768572171" kopyala ikonuna tıklar
    And Alan adını "AlanCopy_" girer
    And Etiket adını "EtiketCopy_" girer
    And Db adını "DbCopy_" girer
    And Kopyala butonuna tıklar
    Then Veri setinin kopyalandığını görür


  @EkleGüncellePenceresiDrAggableOlması
  Scenario:TC_014 Ekle ve güncelle işlemlerinde açılan pencerenin draggable olması.

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Veri seti ekle ikonuna tıklar
    And Açılan pencereyi tutup sürükler





























