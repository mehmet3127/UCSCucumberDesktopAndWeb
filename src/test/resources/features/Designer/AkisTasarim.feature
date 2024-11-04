@AkisTasarimEkrani
Feature: Akis Tasarim Ekrani

  Background: Designer Login Steps

    Given Designer uygulamasina gidilir
    When Gecerli username girilir
    And Gecerli password girilir
    And Login butonuna tıklanir


  @AkisTasarimEkraniGoruntuleme
  Scenario: UCMS-TC-655: Akış Tasarımı Ekranını Görüntüleme

    Given Islem yapilacak olan "OTOMASYON_59" kampanyaya sag tiklanir
    And Kampanya duzenle butonuna tiklanir
    And Versiyon "1" satırına tıklanir
    And Tamam butonuna tıklar
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir


  @IVRAkışaNoduEkleme
  Scenario: UCMS-TC-305,306,307,308,309,310,311,312,313: IVR Akışa Node Ekleme

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Anons ekle noduna tiklanir
    And Veri girisi ekle noduna tiklanir
    And Menu ekle noduna tiklanir
    And Transfer ekle noduna tiklanir
    And Cagridan veri oku noduna tiklanir
    And Cagriya veri yaz noduna tiklanir
    And Gorusmeyi bitir noduna tiklanir
    And Web service ekle noduna tiklanir
    And Script ekle noduna tiklanir


  @AkisTasarimiKaydet
  Scenario: UCMS-TC-314: IVR Akışı Kaydet

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Anons ekle noduna tiklanir
    And Transfer ekle noduna tiklanir
    And Veri girisi ekle noduna tiklanir
    And Kaydet butonuna tıklanir
    And Akis tasariminin kaydedildigi gorulur


  @IVRAkisiKontrolEtPozıtıf
  Scenario: UCMS-TC-315: IVR Akışı Kontrol Et Pozıtıf

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Kontrol Et butonuna tiklanir
    Then Tasarim hatasiz bilgi pop-up gorunur


  @IVRAkisiKontrolEtNegatif
  Scenario: UCMS-TC-315: IVR Akışı Kontrol Et Negatif

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Kontrol Et butonuna tiklanir
    Then Tasarimda hata tespit edildi uyarisinin geldigi gorulur
    Then Hata mesajlarini goruntuler
    #IVRAkisiKontrolEtNegatif ve IVRAkisiKontrolEt pozıtıf senaryoları aynı
    # sadece hata olmayan bır kampan secıp devam edılırse pozıtıf senaryo elde edılmıs olur


  @IVRAkisiUzaklastirYakinlastir
  Scenario: UCMS-TC-316: IVR Akışı Uzaklaştır/Yakınlaştır Butonları

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Tasarim ekranini uzaklastir butonuna tiklanir
    And Tasarim ekranini yakinlastir butonuna tiklanir
    And Tasarim ekranini normal boyutta goster butonuna tiklanir


  @IVRAkisiOzelliklerButonu
  Scenario: UCMS-TC-318: IVR Akışı Ara Butonu, UCMS-TC-317: IVR Akışı Özellikler Butonu

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Akistaki bir forma tiklanir
    And Ozellikler butonuna tıklanır
    Then Ozellikler penceresinin acildigi gorulur


  @IVRAkisTasarimiBaglantiEkle
  Scenario: UCMS-TC-319: IVR Akışı Arama Penceresinde Bağlantı Ekleme

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Baglanti kurulacak formlar secilir
    Then Baglanti kur butonuna tiklanir
    And Kaydet butonuna tıklanir
    And Akis tasariminin kaydedildigi gorulur

  @IVRAkisTasarimiBaglantiSıl
  Scenario: UCMS-TC-320: IVR Akışı Arama Penceresinde Bağlantı Silme

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Silinecek olan baglanti secilir
    Then Baglanti sil butonuna tiklanir
    Then Onay penceresinde Evet butonuna tiklar
    And Kaydet butonuna tıklanir
    And Akis tasariminin kaydedildigi gorulur

