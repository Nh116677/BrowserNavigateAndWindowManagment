package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CommonMethods {

    public void OpenBrowserAndLaunchApplication(String browserName, String url) {
        WebDriver driver;

        String browserName = ConfigReader.read("browser");
        switch (browserName) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "fireFox":

                driver = new FirefoxDriver();
                break;
            case "edge":

                driver = new EdgeDriver();
                break;

            default:
                throw new RuntimeException("Invalid Browser Name")
        }

        driver.manage().window().maximize();
        driver.get(url);
    }
}
