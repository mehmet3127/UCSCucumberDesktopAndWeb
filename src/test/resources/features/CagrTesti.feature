@PreviewModdaÇağrıCikma
Feature: Cagri Cikma


  @DesignerIcerVeriTransferi
  Scenario:UCMS-TC-101, UCMS-TC-102, UCMS-TC-160, UCMS-TC-173, UCMS-TC-205

    Given Designer uygulamasina gidilir
    When Gecerli username girilir
    And Gecerli password girilir
    And Login butonuna tıklanir
    And Islem yapilacak olan "OTOMASYON_59" kampanyaya sag tiklanir
    And Kampanya duzenle butonuna tiklanir
    And Versiyon "1" satırına tıklanir
    And Tamam butonuna tıklar
    And Kampanya modu secilir
    And Listeler'e tiklanir
    And Iceri veri transferi tab'ina tiklanir
    And Veri kaynagi tipine tiklanir ve veri kaynagi tipi "Ağ Yolundaki Dosya" secilir
    And Dosya yolu secilir "C:\UcsDemo\TestData\dataİmportList.xlsx"
    And Ayrac ";" secilir
    And Dosya formati "UTF-8" secilir
    And Yukle butonuna tiklanir
    And Sonraki butonuna tiklanir
    And Sonraki butonuna tiklanir
    And Kaynak hedef alan eslestirme sayfasinda Tlf tipi secilir
    And "Tel" ile deger adi "Cep" alani eslestirilir
    And Musteri bilgileri modulune tiklanir
    And "MüşteriNo" ile deger adi "No" alani eslestirilir
    And "MüşteriAdı" ile deger adi "Ad" alani eslestirilir
    And "MüşteriSoyadı" ile deger adi "Soyadı" alani eslestirilir
    And Veri transferi sayfasina gecilir
    And Kaynaktaki mukerrer kayitlari iceri aktar checkBox'ina tiklanir
    And Batch Id durumu "Aktif" secilir
    And Gecerlilik tarihi "Ayin son gunune" secilir
    And Kontrol ettim checkbox'ı işaretlenir
    And Transferi baslat butonuna tiklanir
    And Onay penceresinde Evet butonuna tiklar
    Then Yukleme talebi alindi mesajinin geldigi gorulur