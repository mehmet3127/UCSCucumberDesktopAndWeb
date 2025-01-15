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
  Scenario Outline: UCMS-TC-314: IVR Akışı Kaydet,UCMS-TC-321: OB Akışı Kaydet

    Given Islem yapilacak olan "<KAMPANYA KANAL TIPI>" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Anons ekle noduna tiklanir
    And Transfer ekle noduna tiklanir
    And Veri girisi ekle noduna tiklanir
    And Kaydet butonuna tıklanir
    And Akis tasariminin kaydedildigi gorulur

    Examples:
      | KAMPANYA KANAL TIPI |
      | IVRDEMOTEST         |
      | OBOTOMASYONTEST     |


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
    And "IVR" Tasarim ekranini uzaklastir butonuna tiklanir
    And "IVR" Tasarim ekranini yakinlastir butonuna tiklanir
    And "IVR" Tasarim ekranini normal boyutta goster butonuna tiklanir


  @IVRAkisiAraVeOzelliklerButonu
  Scenario: UCMS-TC-318: IVR Akışı Ara Butonu, UCMS-TC-317: IVR Akışı Özellikler Butonu

    Given Islem yapilacak olan "IVRDEMOTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Akistaki bir node "Form1" tiklanir
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
  Scenario: UCMS-TC-599: Akış Tasarımı Node'lar Arasına Bağlantı Ekleme, UCMS-TC-326

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Baglanti kurulacak formlar "Form1" "Javascript2" secilir
    Then Baglanti kur butonuna tiklanir
    And Kaydet butonuna tıklanir
    And Akis tasariminin kaydedildigi gorulur


  @OBNodelarArasiBaglantiSılme
  Scenario:UCMS-TC-600: Akış Tasarımı Node'lar Arasındaki Bağlantıyı Silme, UCMS-TC-327

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Silinecek olan baglanti "Varsayılan Akış" secilir
    And Baglanti sil butonuna tiklanir
    And Onay penceresinde Evet butonuna tiklar
    And Kaydet butonuna tıklanir
    Then Akis tasariminin kaydedildigi gorulur


  @FormNodunaVeriSetiEkleme
  Scenario:UCMS-TC-174: Designer Akış Tasarımı'nda Form Node'una Veri Seti Ekleme

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Veri seti ekrani acilir
    And Veri seti alanina sag tiklanir
    And Ekle butonuna tıklanir
    And Arama metnine veri seti degiskeni ismi "ST_TEXTBOX_TARIH" yazilir
    And Sec butonuna tıklanır
    And Akis Tasarim penceresine tiklanir
    #And Form ekle noduna tiklanir
    And Eklenen node'a "Form1" cift tiklanir
    And Eklenen veri seti sag tarafa suruklenir
    #Then Standart alanlar basligi altinda veri seti degiskenlerine tiklanarak sag ekrana suruklenir


  @OBAkisiKontrolEtPozıtıf
  Scenario:UCMS-TC-487: Outbound Akışı Kontrol Et - Pozitif

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Kontrol Et butonuna tiklanir
    Then Tasarim hatasiz bilgi pop-up gorunur


  @OBAkisiKontrolEtNegatif
  Scenario:UCMS-TC-322: OB Akışı Kontrol Et, UCMS-TC-488: Outbound Akışı Kontrol Et - Negatif

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Kontrol Et butonuna tiklanir
    Then Tasarimda hata tespit edildi uyarisinin geldigi gorulur
    Then Hata mesajlarini goruntuler
    #IVRAkisiKontrolEtNegatif ve IVRAkisiKontrolEt pozıtıf senaryoları aynı
    #sadece hata olmayan bır kampan secıp devam edılırse pozıtıf senaryo elde edılmıs olur


  @AkışıInboundaKopyala
  Scenario:UCMS-TC-328: OB Akışı Inbounda Kopyala Butonu

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Inbound'a kopyala butonuna tiklanir
    And Onay penceresinde Evet butonuna tiklar
    And Tamam butonuna tıklar


  @OBAkisiAraVeOzelliklerButonu
  Scenario:UCMS-TC-325: OB Akışı Ara Butonu, UCMS-TC-324: OB Akışı Özellikler Butonu

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And Akistaki bir node "Form1" tiklanir
    And Ozellikler butonuna tıklanır
    Then Ozellikler penceresinin acildigi gorulur


  @OBAkisiUzaklastirYakinlastir
  Scenario:UCMS-TC-323: OB Akışı Uzaklaştır/Yakınlaştır Butonları

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Akis Tasarim penceresine tiklanir
    And "OB" Tasarim ekranini uzaklastir butonuna tiklanir
    And "OB" Tasarim ekranini yakinlastir butonuna tiklanir
    And "OB" Tasarim ekranini normal boyutta goster butonuna tiklanir


  @HariciKampanyaAdiGirme
  Scenario:UCMS-TC-671: Harici Kampanya Adı

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And CRM tabi acilir
    And Harici kampanya adi girilir

  @DosyaKaynaklarıUygunOlmayanFormatıIçeAl
  Scenario:UCMS-TC-337: Dosya Kaynakları Uygun Olmayan Formatı İçe Al

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Dosya kaynaklari sekmesine tiklanir
    And Dosya turu "XML Liste Kaynagi" secilir
    And Ice al butonuna tiklanir
    And Eklenecek dosya secilir "C:\Users\demir\OneDrive\Masaüstü\TestData\XMListeKaynagiZip.zip"
    Then Ice alim dosyasinin gecersiz oldugu uyarisi gorulur
    #Dışa verme dosyası oluşturuldu.

  @DosyaKaynaklarıIçeAl
  Scenario:UCMS-TC-304: Dosya Kaynakları İçe Al

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Dosya kaynaklari sekmesine tiklanir
    And Dosya turu "XML Liste Kaynagi" secilir
    And Ice al butonuna tiklanir
    And Eklenecek dosya secilir "C:\_UcsDemo\TestData\UCMSCampaignResource-673-0.zip"
    Then Kampanya dosyalari ice alindi uyari gorulur


  @DosyaKaynaklarıDisaVer
  Scenario:UCMS-TC-303: Dosya Kaynakları Dışa Ver

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Dosya kaynaklari sekmesine tiklanir
    And Dosya turu "XML Liste Kaynagi" secilir
    And Disa ver butonuna tiklanir
    And Tamam butonuna tıklar
    Then Dışa verme dosyası oluşturuldu uyarisi gorulur
    And Tamam butonuna tıklar


  @DosyaKaynaklarıEkleNegative
  Scenario Outline:UCMS-TC-144, UCMS-TC-146, UCMS-TC-148: Dosya Kaynakları-Ekle (Resim)-Negative

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Dosya kaynaklari sekmesine tiklanir
    And Dosya turu "<Dosya Turu>" secilir
    And Ekle butonuna tıklanir
    And Eklenecek dosya secilir "<Dosya Path>"
    Then Desteklenmeyen dosya formati uyarisi gorulur

    Examples:
      | Dosya Turu        | Dosya Path                                          |
      | Resim             | C:\Users\demir\OneDrive\Masaüstü\TestData\resim.dmr |
      | Ses Dosyasi       | C:\Users\demir\OneDrive\Masaüstü\TestData\ses.dmr   |
      | XML Liste Kaynagi | C:\Users\demir\OneDrive\Masaüstü\TestData\xxx.dmr   |


  @SmokeTest2
    @DosyaKaynaklarıEklePozitive
  Scenario Outline:UCMS-TC-140, UCMS-TC-145, UCMS-TC-147: Dosya Kaynakları-Ekle(Resim,Ses Dosyasi,XML Liste Kaynagi)-Positive

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Dosya kaynaklari sekmesine tiklanir
    And Dosya turu "<Yuklenecek Dosya>" secilir
    And Ekle butonuna tıklanir
    And Eklenecek dosya secilir "<Dosya Path>"
    And Kaydet butonuna tıklanir

    Examples:
      | Yuklenecek Dosya  | Dosya Path                             |
      | Resim             | C:\UcsDemo\TestData\resim.png          |
      | Ses Dosyasi       | C:\UcsDemo\TestData\sesdosyası.wav     |
      | XML Liste Kaynagi | C:\UcsDemo\TestData\XMListeKaynagi.xml |


  @DosyaKaynaklariOngorunum
  Scenario Outline:UCMS-TC-301, UCMS-TC-302, UCMS-TC-335: Dosya Kaynakları Öngörüm (Resim,Ses Dosyasi,XML Liste Kaynağı)

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Dosya kaynaklari sekmesine tiklanir
    And Dosya "<Dosya Turu>" secilir
    And Ongorum butonuna tiklanir
    And Acilan ongorum dosyasi kapatilir

    Examples:
      | Dosya Turu        |
      | Resim             |
      | Ses Dosyasi       |
      | XML Liste Kaynagi |


  @SmokeTest2
    @DosyaKaynaklariSil
  Scenario Outline:UCMS-TC-149, UCMS-TC-150, UCMS-TC-151: Dosya Kaynakları-Sil (Resim,Ses Dosyası,XML Liste Kaynağı)

    Given Islem yapilacak olan "OBOTOMASYONTEST" kampanya secilir
    And Kampanya modu secilir
    And Dosya kaynaklari sekmesine tiklanir
    And Dosya "<Dosya Turu>" secilir
    And Sil butonuna tiklanir
    And Onay penceresinde Evet butonuna tiklar

    Examples:
      | Dosya Turu        |
      | Resim             |
      | Ses Dosyasi       |
      | XML Liste Kaynagi |
