package Utilities;

import Runners.Runner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    public static WebDriver driver;
    public static WebDriver getDriver()
    {
        if (driver == null)
        {
            Locale.setDefault(new Locale("EN"));
            System.setProperty("user.language", "EN");

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--allow-insecure-localhost");
            options.addArguments("--acceptInsecureCerts");
            options.addArguments("--diable-blink-features=AutomationControlled");
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
        }
        return driver;
    }
    public static void quitDriver()
    {
        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        if (driver != null)
        {
            driver.quit();
            driver = null;
        }
    }

    public static void Bekle(int saniye)
    {
        try
        {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
