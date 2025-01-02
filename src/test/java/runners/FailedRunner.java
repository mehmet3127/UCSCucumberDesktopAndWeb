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
        features = "@target/failed_scenarios.txt",//.txt dosya path
        glue = "stepDefinitions",
        dryRun = false  //true olursa sayfayi acip calistirmadan eksiklik varsa onlari bize gosterir.
)
public class FailedRunner {

}
