package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",//Bu plagin ile ayri bir raporlama aliyoruz Runner dan calistirmak gerekiyor,target'in altinda cucumber-reports.html'e cift tiklayinca yada sag tiklatipv open in->Explorer deyince aciliyor
                "json:target/json-reports/cucumber.json",//Bu plagin ile json formatinda rapor aliriz target'in altinda json-reports klasorunun altinda verir Ctrl-Alt-L yapmak gerek
                "junit:target/xml-report/cucumber.xml",//Bu plagin ile xml formatinda rapor aliriz target'in altinda xml-report klasorunun altinda verir Ctrl-Alt-L yapmak gerek
                "rerun:target/failed_scenarios.txt"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@HappyPathUcmsAdmin and not ignor", // iki tag'ı aynı anda çalıştırmak isterseniz "@gp1 or @gp2"
        dryRun = false  //true olursa sayfayi acip calistirmadan eksiklik varsa onlari bize gosterir.
)
public class Runner {
    /*
     Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senaryolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde
    features : Runeer dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder
    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.
   */
}