@SonucKodlarıSayfası
Feature:Sonuc Kodları Sayfası

  Background:

    Given Kullanıcı ucmsadmin sayfasına gider
    When Kullanıcı ucmsadmin için geçerli username girer
    And Kullanıcı ucmsadmin için geçerli password girer
    And Kullanıcı giriş butonuna tıklar
    And Sonuç kodları butonuna tıklar
    And Sonuç kodları sekmesine tıklar


  @KodGrubuEkleme
  Scenario Outline:TC_001-TC_002 Kod Grubu Ekleme

    And Kod grubu ekle ıkon a tıklar
    And CRM ıd girilir
    And Grup adı "<grupAdi>" ekler
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Kod grubunun eklendigini dogrular
    Examples:
      | grupAdi |
      | KG_     |


  @AltGrupEkleme
  Scenario: TC_001 Alt Grup Ekleme

    And Eklenen kod grubunun alt grup ekle ikonuna tıklar
    And Geçerli bir başlık girilir.
    And Kaydet butonuna tıklanır.
    Then Başarılı bir şekilde kaydedildiği doğrulanır.


  @BaşlıkEklemedenAltGrupEkleme
  Scenario:TC_002 Başlık Eklemeden Alt Grup Ekleme


    And Eklenen kod grubunun alt grup ekle ikonuna tıklar
    And Alt grup ekle modalı açılır.
    And Kaydet butonunun aktif olmadığı görülür


  @AltGrupPenceresiKapat
  Scenario:TC_003 Alt Grup Penceresi Kapatma


    And Eklenen kod grubunun alt grup ekle ikonuna tıklar
    And Alt grup ekle modalı açılır.
    And Kapat butonuna tıklanarak menü kapatılır.


  @KodGrubuGüncelleme
  Scenario: TC_001 Bilgileri değiştirerek kod grubu güncelleme

    And Güncellemek istediği kod grubunun "" grup güncelle ıkonuna tıklar
    And Açılan pencereden grup adı "KG_GuncelVersiyon_" ve crmId "crmId" alanını günceller
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Kod grubunun güncellendiğini doğrular


  @ignore
  @BoşBırakarakKodGrubuGüncelleme
  Scenario: TC_001 Bilgileri değiştirerek kod grubu güncelleme

    And Güncellemek istediği kod grubunun "" grup güncelle ıkonuna tıklar
    And Açılan pencereden bilgileri siler
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Zorunlu alanları doldurunuz uyarısını doğrular
    #otomasyon da crm ıd ve grup adı silinince Kaydet button pasif olduğu için
    # Kaydet buttona tıklama yapılamıyor ve "Zorunlu alanları doldurunuz uyarısını" cıkmıyor



  @KodGrubuVersiyonDeğiştirme
  Scenario: TC_001 Kod grubu versiyon değiştirme

    And Versiyon degiştirmek istediği kod grubunun "" grup güncelle ıkonuna tıklar
    And Açılan pencereden grup adı "KG_GuncelVersiyon_" ve crmId "crmId" alanını günceller
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    Then Kod grubunun güncellendiğini doğrular
    And Güncellenen sonuç kodu grubunun versiyon ikonuna tıklar
    And Açılan pencerede tipi Oluşturma olan satırın Bu versiyonlar devam et ikonuna tıklar
    And Kaydet butonuna tıklar
    And Onay butonuna tıklar
    And Kod grubunun versiyonunun degistigini doğrular


  @SonuçKoduEkleme
  Scenario:Sonuç Kodu Ekleme

    And Eklenen kod grubunun sonuç kodu ekle ikonuna tıklar
    And Başlık bilgisi "automation_closed_resultcode" girilir
    And Varsa Bilgilendirme notu bilgisi girilir
    And Varsa Aciklama bilgisi girilir
    And CRM sonuc kodu "automation_closed_resultcode" girilir
    And Aksiyon tipi "Kaydı Kapat" secilir
    And Genel özellikler tabına geçer
    And Başarı durumu "Kriter Dışı" secilir
    And Musteriye ulasilma durumu "Müşteriye Ulaşılamadı" secilir
    And Musteriye temas durumu "Müşteriye Temas Edildi" secilir
    And Varsa CTI sonuc kodu "Cevaplandı (33) " secilir
    And Kaydete tıklar
    Then Sonuç kodunun eklendiğini görür


  @SonuçKoduOlanKodGrubuSilme
  Scenario: TC_002 Sonuç Kodu Olan Kod Grubunu Silme

    And Silmek istediği "Sonuc Kodu olmayan" kod grubunun sil ıkonuna tıklar
    Then Kod grubunun silinemediğini doğrular


  @ignore
  @İçeriktenSonuçKoduArama
  Scenario: TC_002 İçerik den Sonuç Kodu Arama

    And İçerik ara searchbox ına tıklar
    And Var olan sonuç kodunun ismini girer
    And Var olan sonuç kodunun olduğunu doğrular
    #Eklenen sonuç kodunu sayfaya hemen yazınca sayfa yüklenmesi bekleniyor ve
    #sayfa yükendikten sonra yazılı element çıkmıyır



  @SonuçKoduVersiyonDeğiştirme1
  Scenario:TC_001 Güncellenen sonuç kodunun ilk versiyonuna dönme

    And Güncellemek istediği sonuç kodunun "" tıklar
    And Güncellemek istediği "" güncelle ıkonuna tıklar
    And Açılan pencereden Başlık alanını günceller
    And Güncelle butonuna tıklar
    Then Sonuç kodunun güncellendiğini doğrular
    And Güncellenen sonuç kodunun versiyon ikonuna tıklar
    And Açılan pencerede tipi Oluşturma olan satırın Bu versiyonlar devam et ikonuna tıklar
    And Açılan pencerede tüm alanların pasif geldiğini görür
    And Versiyonu değiştir butonuna tıklar
    And Onay butonuna tıklar
    And Sonuç kodu veriyonunun güncellendiğini doğrular


  @SonucKoduDevreDısıBırakma
  Scenario:Sonuç kodunu devre dışı bırakma

    And Devre dışı bırakmak istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Devre dışı bırakmak istediği sonuç kodunun "SK_KG_710101032" devre dışı bırak iconuna tıklar
    And Sonuç kodunun devre dışı oldugunu dogrular


  @PasifSonuçKoduTaşımaVazgeç
  Scenario:TC_005 Dizin değiştir iconu kullanılarak pasif sonuç kodu taşıma Onay penceresine vazgeç dendiğinde

    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    And Değiştirmek istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Değiştirmek istediği sonuç kodunun "SK_KG_710101032" dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun "KG_090585314" buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Sonuç kodunun dizinin değişmediğini görülür.


  @PasifSonuçKoduTaşımaİptal
  Scenario: TC_006 Dizin değiştir iconu kullanılarak pasif sonuç kodunu taşıma iptal butonu kontrolu

    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    And Değiştirmek istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Değiştirmek istediği sonuç kodunun "SK_KG_710101032" dizin değiştir iconuna tıklar
    And İptal icon'una tıklar
    Then Sonuç kodunun dizinin değişmediğini görülür.


  @PasifSonuçKoduTaşımaEvet
  Scenario: TC_004	Dizin değiştir iconu kullanılarak pasif sonuç kodunu taşıma Onay penceresine evet dendiğinde

    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    And Değiştirmek istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Değiştirmek istediği sonuç kodunun "SK_KG_710101032" dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun "KG_090585314" buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde evet e tıklanır
    Then Sonuç kodunun dizinin değiştiği görülür.


  @SonucKoduDevreDevreyeAlma
  Scenario:Devre dışı bırakılan sonuç kodunu devreye alma

    And Devreye almak istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    And Devreye almak istediği sonuç kodunun "SK_KG_710101032" devreye al iconuna tıklar
    And Sonuç kodunun aktif oldugunu dogrular

  @ignore
  @SonuçKoduTaşımaVazgeç1
  Scenario: TC_002	Dizin değiştir iconu kullanılarak sonuç kodu taşıma Onay penceresine vazgeç dendiğinde

    And Değiştirmek istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Değiştirmek istediği sonuç kodunun "SK_KG_710101032" dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun "KG_090585314" buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde vazgeç e tıklanır
    Then Sonuç kodunun dizinin değişmediğini görülür.


  @ignore
  @SonuçKoduTaşımaİptal1
  Scenario: TC_003	Dizin değiştir iconu kullanılarak sonuç kodu taşıma iptal butonu kontrolu

    And Değiştirmek istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Değiştirmek istediği sonuç kodunun "SK_KG_710101032" dizin değiştir iconuna tıklar
    And İptal icon'una tıklar
    Then Sonuç kodunun dizinin değişmediğini görülür.


  @SonuçKoduTaşımaEvet
  Scenario: TC_001	Dizin değiştir iconu kullanılarak sonuç kodu taşıma Onay penceresine evet dendiğinde

    And Değiştirmek istediği sonuç kodunun kod grubuna "KG_710101032" tıklar
    And Değiştirmek istediği sonuç kodunun "SK_KG_710101032" dizin değiştir iconuna tıklar
    And Taşımak istediği kod grubunun "KG_090585314" buraya taşı iconuna tıklar
    And Açılan uyarı penceresinde evet e tıklanır
    Then Sonuç kodunun dizinin değiştiği görülür.

  @SonuçKoduOlmayanKodGrubuSilme
  Scenario: TC_001 Sonuç Kodu Olmayan Kod Grubunu Silme

    And Silmek istediği "Sonuc Kodu olan" kod grubunun sil ıkonuna tıklar
    Then Kod grubunun silindiğini doğrular


  @DevreDışıBırakılanSonuçKodlarınınListelenmesi
  Scenario: TC_001 Devre Dışı Bırakılan Sonuç Kodlarının Listelenmesi,TC_002 Devre Dışı Bırakılan Sonuç Kodlarını Listeden Çıkarma

    And Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.
    Then Kod grupları hiyerarşisi altında devre dışı bırakılan sonuç kodlarının da üstü çizili olarak listelendiği görülür
    Then Tekrar devre dışı bırakılanlar iconuna tıklandığında, devre dışı bırakılmış sonuç kodlarının listelenmediği  görülür











