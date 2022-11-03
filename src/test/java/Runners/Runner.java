package Runners;


import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import logs.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;


@CucumberOptions
        (
                tags = "@SmokeTest",
                features = {"src/test/java/FeatureFiles/"},
                glue = {"StepDefinitions"},
                plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
                monochrome = true,
                dryRun = false
        )
@Listeners({ExtentITestListenerClassAdapter.class})
public class Runner extends AbstractTestNGCucumberTests

{
    @BeforeClass(alwaysRun = true)


    @AfterClass
    public void writeExtentReport() {

        ExtentService.getInstance().setSystemInfo("User Name", "Bahadır Kaya");
        ExtentService.getInstance().setSystemInfo("Application Name", "hepsiburada.com");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Hepsiburada.com sitesine gidilir ve üye girişi yapılarak ve üye girişi" +
                " yapılmayarak herhangi bir ürünü 2 farklı satıcıdan sepete ekleyip sepetteki ürünlerin doğruluğu test edilir");
    }
}