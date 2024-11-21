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
    And Baglanti kurulacak formlar "Anons1" "Transfer2" secilir
    Then Baglanti kur butonuna tiklanir
    And Kaydet butonuna tıklanir
    And Akis tasariminin kaydedildigi gorulur


  @IVRAkisTasarimiBaglantiSıl
  Scenario: UCMS-TC-320: IVR Akışı Arama Penceresinde Bağlantı Silme

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Silinecek olan baglanti "<Varsayılan Akış>" secilir
    Then Baglanti sil butonuna tiklanir
    Then Onay penceresinde Evet butonuna tiklar
    And Kaydet butonuna tıklanir
    Then Akis tasariminin kaydedildigi gorulur


  @OBAkışaFormEkleme
  Scenario: UCMS-TC-90:Akışa Form Ekleme

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Form ekle noduna tiklanir
    And Eklenen node'a "Form1" cift tiklanir
    Then Standart alanlar basligi altinda veri seti degiskenlerine tiklanarak sag ekrana suruklenir

  @OBAkışaJavaScriptEkleme
  Scenario: UCMS-TC-95: JavaScript Ekleme

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And JavaScript ekle noduna tiklanir
    And Eklenen node "Javascript2" acilir
    And Javascript menusu acilir ve js kodu girilir
    And Sonuc kodu tabina tiklanir
    And Varsayilan sonuc kodu "Mesgul" secilir
    And Tamam butonuna tıklar
    And Kaydet butonuna tıklanir
    Then Akis tasariminin kaydedildigi gorulur


  @OBAkışaScriptEkleme
  Scenario: UCMS-TC-96: Script Ekleme

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Script ekle'ye tiklanir
    And Eklenen node "Script1" acilir
    And Script tabi acilir
    And Veri seti degiskeni "'|E08-CustKey|'" secilip ekle'ye tiklanir
    And Donus degerlerinin yazilacagi veri seti degiskenleri alanina tiklanir
    And Karar nesnesini secer
    And Tamam butonuna tıklar


  @OBAkışaRestfulWebServiceEkleme
  Scenario:UCMS-TC-97: Restful Web Service Ekleme (http)

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Web service ekle noda tiklanir
    And Eklenen node "WebService1" acilir
    And Web service tabi acilir
    And Test endpointi eklenir
    And Preprod endpointi eklenir
    And Prod endpointi eklenir
    And Ornek JSON kodu girilir
    And Yukle butonuna tiklanir
    And Request tabina gecilir
    And Alan eslestirme tabina tiklanir
    #hata alindigi icin burdan sonra devam edilecek

  @OBAkışaSOAPWebServiceEkleme
  Scenario: UCMS-TC-158: SOAP Web Service Ekleme (http)

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Web service ekle noda tiklanir
    And Eklenen node "WebService1" acilir
    And Web service tabi acilir
    And Sol alt combobox'tan SOAP secilir
    And Url alanina tiklanir ve Url "http://teres.ucs.pvt:3080/testWS/test.asmx" girilir
    And Sag taraftaki yesil butona tiklanir
      #hata alindigi icin burdan sonra devam edilecek


  @OBCagridanVeriOkuma
  Scenario: UCMS-TC-92: Çağrıdan Veri Okuma Ekranı

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Session dan deger oku noduna tiklanir
    And Eklenen node "Çağrıdan Veri Oku1" acilir
    And Session dan deger oku tabi acilir
    And Veri seti degiskeni listBox'ina tiklanir
    And Tamam butonuna tıklar

  @OBCagridanVeriOkumaSonucKoduEkleme
  Scenario: UCMS-TC-93: Sonuç Kodu Seçme

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Session dan deger oku noduna tiklanir
    And Eklenen node "Çağrıdan Veri Oku1" acilir
    And Session dan deger oku tabi acilir
    And Veri seti degiskeni listBox'ina tiklanir
    And Tamam butonuna tıklar
    And Ozellikler butonuna tıklanır
    And Sonuc kodu tabina tiklanir
    And Varsayilan sonuc kodu "Mesgul" secilir
    Then Tamam butonuna tıklar


  @AkışBaslangicFormuSecimi
  Scenario:UCMS-TC-94: Genel Düzenleme - Akış Başlangıç Formu Seçimi

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Form ekle noduna tiklanir
    And Eklenen node "Form1" acilir
    And Akis baslangic formu secilir


  @OBNodelarArasiBaglantiEkleme
  Scenario: UCMS-TC-599: Akış Tasarımı Node'lar Arasına Bağlantı Ekleme

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Baglanti kurulacak formlar "Form1" "Javascript2" secilir
    Then Baglanti kur butonuna tiklanir
    And Kaydet butonuna tıklanir
    And Akis tasariminin kaydedildigi gorulur


  @OBNodelarArasiBaglantiSılme
  Scenario:UCMS-TC-600: Akış Tasarımı Node'lar Arasındaki Bağlantıyı Silme

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Silinecek olan baglanti "Varsayılan Akış" secilir
    And Baglanti sil butonuna tiklanir
    And Onay penceresinde Evet butonuna tiklar
    And Kaydet butonuna tıklanir
    Then Akis tasariminin kaydedildigi gorulur







