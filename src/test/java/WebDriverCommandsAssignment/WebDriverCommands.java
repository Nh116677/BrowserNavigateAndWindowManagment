package WebDriverCommandsAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) {
        //Declare the instance
        //1.The user successfully opens Chrome and maximizes the window using `window().maximize()`.
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();
        System.out.println("Browser window maximized.");

        //go to www.google.com
        //2.The user navigates to `www.google.com`, and the page title is printed correctly.
        driver.get("https://google.com");
        System.out.println("Page Title (Google): " + driver.getTitle());

        //navigate to syntax project website
        //3.The user navigates to `https://www.syntaxprojects.com/`, and the page title is printed correctly.
        driver.navigate().to("https://www.syntaxprojects.com");
        System.out.println("Page title (Syntax Projects" + driver.getTitle());

        //go back to www.google.com
        //4.The user successfully navigates back to `www.google.com` using `navigate().back()
        driver.navigate().back();
        System.out.println("Navigate back to Google");

        //refresh
        //5.The page at `www.google.com` is refreshed using `navigate().refresh()`.
        driver.navigate().refresh();
        System.out.println("Google page refreshed");

        //closing the browser
        //6.The browser closes after completing all the navigation steps.
        driver.close();
        System.out.println("Browser closed.");


    }

}
