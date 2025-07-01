package RadioButtonsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Learn Radio Button Interaction: Gain practical experience in interacting with radio buttons using Selenium, ensuring the correct options are selected in various sections.
    //
    //b. Traverse Radio Button Lists: Understand how to retrieve, iterate, and programmatically select specific radio buttons from a list, applying conditional logic to target specific choices.
    //
    //c. Handle Disabled and Hidden Elements: Develop skills to interact with disabled and hidden radio buttons by enabling and displaying them dynamically using Selenium commands.
    //
    //
    //
    //User Story
    //- Title: Verifying Radio Button Functionality
    //- As a user,
    //- I want to navigate to `https://syntaxprojects.com/basic-radiobutton-demo-homework.php`
    //- So that I can check if all radio buttons are working as expected.
    //
    // Acceptance Criteria
    //
    //1. Choose Your Favorite Beverage:
    //   - Select the Juice radio button from the list of favorite beverages.
    //
    //2. Preferred Working Environment:
    //   - Retrieve all radio buttons in the Preferred Working Environment section.
    //   - Traverse through the list of radio buttons in code and select the Hybrid option.
    //
    //
    //3. Choose Your Favorite Season:
    //   - If the Spring radio button is disabled, click on the "Enable Buttons" button.
    //   - Ensure that the Spring option is now enabled, then select it.
    //   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
    //   - Verify that the Winter option is displayed after clicking and is available for selection.
    //
    //4. Choose Your Favorite Meal:
    //   - Select the Lunch radio button from the list of favorite meals.

    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        // Maximize window
        driver.manage().window().maximize();

        //- I want to navigate to `https://syntaxprojects.com/basic-radiobutton-demo-homework.php`
        //Open browser `https://syntaxprojects.com/basic-radiobutton-demo-homework.php`
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        //1. Choose Your Favorite Beverage:
        //   - Select the Juice radio button from the list of favorite beverages.
        WebElement juiceradio = driver.findElement(By.xpath("//input[@value='Juice' and @name='beverage']"));
        juiceradio.click();
        System.out.println("Select Favourite Beverage: Juice");

        //2. Preferred Working Environment:
        //   - Retrieve all radio buttons in the Preferred Working Environment section.
        //   - Traverse through the list of radio buttons in code and select the Hybrid option.
        List<WebElement> workEnvironmentRadios = driver.findElements(By.name("working_enviroment"));
        for (WebElement radio : workEnvironmentRadios) {
            if (radio.getAttribute("value").equalsIgnoreCase("hybrid")) {
                radio.click();
                System.out.println("Selected working environment: Hybrid");
                break;
            }
        }


        //3. Choose Your Favorite Season:
        //   - If the Spring radio button is disabled, click on the "Enable Buttons" button.
        WebElement springRadio = driver.findElement(By.xpath("//input[@value='spring']"));
        if (!springRadio.isEnabled()) {
            System.out.println("Spring is disabled.  Enabling it...");
            WebElement enableBtn = driver.findElement(By.id("enabledFruitradio"));
            enableBtn.click();
            Thread.sleep(1000);
        }

        //   - Ensure that the Spring option is now enabled, then select it.

        if (springRadio.isEnabled()) {
            springRadio.click();
            System.out.println("Select favourite season: Spring");
        }
        //   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.

        WebElement winterRadio = driver.findElement(By.xpath("//input[@value='winter']"));
        if (!winterRadio.isDisplayed()) {
            System.out.println("Winter radio is hidden.  Revealing it...");
            WebElement showRadioBtn = driver.findElement(By.id("showRadioButtons"));
            showRadioBtn.click();
            Thread.sleep(1000);
        }
        //   - Verify that the Winter option is displayed after clicking and is available for selection.
        if (winterRadio.isDisplayed() && winterRadio.isEnabled()) {
            winterRadio.click();
            System.out.println("Selected favourite season: Winter");
        }
        //4. Choose Your Favorite Meal:
        //   - Select the Lunch radio button from the list of favorite meals.
        WebElement lunchRadio = driver.findElement(By.xpath("//input[@value='lunch']"));
        lunchRadio.click();
        System.out.println("Favorite Meal Selected: Lunch");
    }
}




