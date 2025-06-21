package FireFoxBrowserAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcceptanceCriteria {
    public static void main(String[] args) {
        //create an object of the webdriver interface
        //1.The user should be able to launch a web browser and navigate to
        // the URL `https://www.syntaxprojects.com/`.

        WebDriver driver = new FirefoxDriver();

        //navigate the browser to syntax project website
        driver.get("https://www.syntaxprojects.com");

        //Maximize the window
        //2. The user should be able to maximize the browser window
        driver.manage().window().maximize();
        System.out.println("Broswer window maximized.");


        //3. The current URL should be printed on the console
        // and match `https://www.syntaxprojects.com/`.

        String url = driver.getCurrentUrl();
        System.out.println("The current url is: " + url);

        //4.  The page title retrieved should be printed on the console
        // and match `Syntax - Website to practice Syntax Automation Platform`.

        String title = driver.getTitle();
        System.out.println("The Page title of the website is: " + title);


        //close browser
        //5.The browser should close automatically after retrieving both the URL and title.
        driver.close();


    }
}
