@VeriSetileri
Feature: Veri Setleri

  @SmokeTest2
  @VeriSetiEkleme
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
    And Db adını "<dB Adi>" girer
    And Özellikler tabına geçip Maksimum veri uzunluğunu 38 girilir
    And Veriler tab'ına geçer
    And 2 adet anahtar değer ve görünen değer ekler
    And Kaydet butonuna tıklar.
    Then Veri setinin eklendiğini doğrular

    Examples:
      | Form Alan Tipi | Veri Tipi | dB Adi |
      #| ComboBox       | Karakter  | Db     |
      #| ComboBox       | Nümerik     | Db*_   |
      #| ComboBox       | Nümerik Kod | 7Dbş_  |
      #| ComboBox       | Tarih       | Db    |
      #| ListBox        | Karakter    | DB_    |
      #| ListBox          | Nümerik     |        |
      ##Bu durumda max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      #| ListBox          | Nümerik Kod |        |
      ##Bu durumda max veri uzunluğu aktif olması gerekirken pasif gelmekte Task açıldı beklemede
      #| ListBox          | Tarih       |        |
      | TextBox        | Karakter  | Db     |
      | TextBox        | Nümerik   | Db     |
      #| TextBox        | Nümerik Kod | Db     |
      #| TextBox        | Tarih     | Db     |
      #| MultilineTextBox | Karakter  | Db*    |
      #| CheckBox         | Nümerik Kod |   Db     |

     #Note:Veri titpi tarih seçiince max veri uzunluğu defoult olarak 10 geliyor
     #     ama anahtar değer 10 karakterde fazla girince uyarı vermiyor


  @AlanEtiketDbAdıAynıVeriSetiEkleme
  Scenario Outline: Alan Adı Etiket Adı ve  Db Adı Aynı olan Veri Seti Ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Veri seti ekle ikonuna tıklar
    And Form alan tipini "<Form Alan Tipi>" seçer
    And Veri tipini "<Veri Tipi>" seçer
    And Alan adını "AynıAlanAdi" girer
    And Etiket adını "AynıEtiketAdi1" girer
    And Db adını "AyniDbAdi1" girer
    And Kaydet butonuna tıklar.
    Then Aynı isimde Etiket Adı Obje Adı veya Db Adı bulunmakta uyarısını görür
    Examples:
      | Form Alan Tipi | Veri Tipi   |
      | CheckBox       | Nümerik Kod |


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
    And Veri setinin "" Aktif-Pasif et iconuna tıklanır
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
    And Veri setinin "" Aktif-Pasif et iconuna tıklanır
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
    And Aktif yada Pasif etmek istediği veri setinin "Etiket_317435321" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular


  @CheckBoxİleBirdenFazlaVeriSetiniAktifPasifEtme
  Scenario:TC_001-TC_002 Check Box İle Birden Fazla Veri Setini Aktif-Pasif Etme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir
    And Aktif yada Pasif etmek istediği veri setlerinin "Etiket_197837176" "Etiket_082855152" checkboxına tıklar
    And Sağ üst köşede beliren aktif_pasif iconuna tıklanır
    Then Kayıt güncellendi yazısnı doğrular


  @VeriSetiKontrolEkleme
  Scenario:TC_001 Veri seti kontrol ekleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Kontrol eklemek istediği veri setinin "Etiket_871202480" kontrol ıkonuna tıklar
    And Kontrol tipini "" seçer
    And Mesaj alanına içerik "Lütfen zorunlu alanı doldurunuz" girilir
    And Kaydet ikonuna tıklar
    And Kapat butonuna tıklar
    #Kontrol eklendi popUp olursa doğrulama için

  @VeriSetiKontrolSilme
  Scenario:TC_002 Veri seti kontrol silme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Kontrol eklemek istediği veri setinin "Etiket_197837176" kontrol ıkonuna tıklar
    And Sil ıkonuna tıklar
    And Kapat butonuna tıklar
    #Kontrol eklendi popUp olursa doğrulama için


  @VeriSetiGüncelleme
  Scenario:Veri seti güncelleme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Güncellemek istediği veri setinin "EtiketCopy_162340272" düzenle ikonuna tıklar
    And Alan adını "GüncelAlan_" girer
    And Etiket adını "GüncelEtiket_" girer
    And Kaydet butona tıklar
    Then Veri setinin güncellendiğini doğrular


  @VeriSetiVersiyonDeğiştir
  Scenario:TC_001 Güncellenen veri setinin ilk versiyonuna dönme

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Güncellenen veri setinin "Db082036206" versiyon ikonuna tıklar
    And Açılan pencerede tipi Oluşturma olan satırın Bu versiyonlar devam et ikonuna tıklar
    And Versiyon geri al butonuna tıklar
    And Onay butonuna tıklar
    #Versiyon geri al Evet deyince "Alan Adı boş" geçilemez. Uyarısı veriyor


  @VeriSetiKopyalama
  Scenario:Veri seti kopyalama

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Veri setleri butonuna tıklar
    And Veri setleri Menüsüne tıklar
    And Kopyalamak istediği veri setinin "Etiket_218598467" kopyala ikonuna tıklar
    And Alan adını "AlanCopy_" girer
    And Etiket adını "EtiketCopy_" girer
    And Db adını "DbCopy_" girer
    And Kopyala butonuna tıklar
    Then Veri setinin kopyalandığını görür


  @ignore
  @TümAktifPasifVeriSetleriniListeleme
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





























