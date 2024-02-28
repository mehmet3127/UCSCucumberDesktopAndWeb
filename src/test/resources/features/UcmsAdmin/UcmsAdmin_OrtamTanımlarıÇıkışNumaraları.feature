@OrtamTanımlarıÇıkışNumaraları
Feature: Ortam Tanımları Çıkış Numaraları

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Ortam Tanımları butonuna tıklar
    And Çıkış Numaraları sekmesine tıklar



  @TelNoBoşBırakarakÇıkışNumarasıEkleme
  Scenario:TC_002 Ekle modalını boş bırakarak kaydetmeye çalışma

    And Ekle ikonuna tıklar
    And Açılan ekle modalına telefon "" no girer
    And Kaydet butonuna tıklar
    Then Telefon numarası boş geçilemez uyarısını görür


  @VarOlanTelNoİleÇıkışNumarasıEkleme
  Scenario:TC_001 Var olan tel no ile çıkış numarası ekleme

    And Ekle ikonuna tıklar
    And Açılan ekle modalına var olan telefon "14142992494" no girer
    And Kaydet butonuna tıklar
    Then Aynı telefon numarasyla zaten bir kayıt var uyarısını görür


  @ÇıkışNumarasıEklemeGeçersizKarakter
  Scenario:TC_003 Ekle modalına geçersiz karakter girilerek kaydetmeye çalışma

    And Ekle ikonuna tıklar
    And Açılan ekle modalına geçersiz karakter olan telefon "abcdf.<=?" no girer
    And Kaydet butonuna tıklar
    Then Telefon numarası boş geçilemez uyarısını görür


  @ÇıkışNumarasıEklemeKapatButton
  Scenario:TC_005 Ekle modalındaki Kapat butonu ile modal kapatma

    And Ekle ikonuna tıklar
    And Açılan ekle modalına telefon "5554443321" no girer
    And Kapat butonuna tıklar
    Then Modalın kapandığı ve ekleme yapılmadığı görülür.


  @ÇıkışNumarasıEkleme
  Scenario:TC_001 Ekle modalını kullanarak çıkış numarası ekleme

    And Ekle ikonuna tıklar
    And Açılan ekle modalına telefon "5554443321" no girer
    And Kaydet butonuna tıklar
    Then Telefon numarası eklendi uyarısını görür


  @ÇıkışNumarasıArama
  Scenario:TC_001-TC_002 Çıkış numaralarını arama

    And İçerik ara searchbox ına tıklar
    And En az üç basamaklı telefon no "5327555" değeri girer
    Then Çıkış numarasının "5327555" listede oldugu görülür.
    And En az üç basamaklı id değeri girer
    Then Çıkış numarasının "5327555" listede oldugu görülür.


  @ÇıkışNumarasıGüncelleme
  Scenario:TC_001 Güncelle modalını kullanarak çıkış numarası güncelleme

    And Var olan bir çıkış numarasının "55544433215554443333" düzenle iconuna tıklanır
    And Açılan ekle modalına telefon "5554443333" no girer
    And Güncelle butonuna tıklar
    Then Telefon numarası güncellendi uyarısını görür


  @TelNoBoşBırakarakÇıkışNumarasıGüncellme
  Scenario:TC_002 Güncelle modalını boş bırakarak güncellemeye çalışma

    And Var olan bir çıkış numarasının "5554443333" düzenle iconuna tıklanır
    And Açılan ekle modalına telefon "" no girer
    And Güncelle butonuna tıklar
    Then Telefon numarası boş geçilemez uyarısını görür
    #Otomasyon ile güncelleme yaparken tel No boş bırakınca "Telefon numarası boş geçilemez uyarısı"
    #yerine "Aynı isimde telefon numarası var" uyarısı veriyor


  @ÇıkışNumarasıGüncellemeGeçersizKarakter
  Scenario:TC_003 Güncelle modalına geçersiz karakter girilerek kaydetmeye çalışma

    And Var olan bir çıkış numarasının "5554443333" düzenle iconuna tıklanır
    And Açılan ekle modalına geçersiz karakter olan telefon "abcdf.<=?" no girer
    And Güncelle butonuna tıklar
    Then Telefon numarası boş geçilemez uyarısını görür
    #Otomasyon ile güncelleme yaparken tel No'ya geçersiz karakter girince "Aynı isimde telefon numarası var" uyarısı veriyor


  @ÇıkışNumarasıGüncellemeKapatButton
  Scenario:TC_005 Güncelle modalındaki Kapat butonu ile modal kapatma

    And Var olan bir çıkış numarasının "5554443333" düzenle iconuna tıklanır
    And Açılan ekle modalına telefon "5554443344" no girer.
    And Kapat butonuna tıklar
    Then Modalın kapandığı ve ekleme yapılmadığı görülür.


  @VarOlanTelNoİleÇıkışNumarasıGüncelleme
  Scenario:TC_004 Güncelle modalına var olan bir çıkış numarası değeri girip kaydetmeye çalışma

    And Var olan bir çıkış numarasının "5554443333" düzenle iconuna tıklanır
    And Açılan ekle modalına var olan telefon "14142992494" no girer
    And Güncelle butonuna tıklar
    Then Aynı telefon numarasyla zaten bir kayıt var uyarısını görür


  @ÇıkışNumarasıSilmeVazgeç
  Scenario:TC_002 Çöp kutusu iconu ile çıkış numarasını silmekten vazgeçme

    And Var olan bir çıkış numarasının "05443211245" sil iconuna tıklanır
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Çıkış numarasının "05443211245" silinmediği dogrular


  @ÇıkışNumarasıSilme
  Scenario:TC_001 Çıkış numarası silme

    And Var olan bir çıkış numarasının "05443211245" sil iconuna tıklanır
    And Onay butonuna tıklar
    Then Çıkış numarasının "05443211245" silindiği dogrular











