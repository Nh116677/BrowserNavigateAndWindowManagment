package CheckBoxesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Master Checkbox Interaction: Gain practical experience in checking the status of checkboxes (enabled/disabled, displayed/hidden) and selecting them based on conditions.
    //
    //b. Traverse and Select Checkboxes: Learn how to retrieve, traverse, and select specific checkboxes from a list, based on criteria such as hobbies or interests.
    //
    //c. Handle Hidden Elements: Understand how to handle and interact with hidden checkboxes by revealing them dynamically through user actions, like clicking on "Show Checkboxes."
    //
    //d. Manage Disabled Checkboxes: Practice enabling and selecting checkboxes that are initially disabled, ensuring proper form functionality.
    //
    //---
    //User Story
    //-Title: Verifying Checkbox Functionality
    //- As a user,
    //- I want to navigate to `https://syntaxprojects.com/basic-checkbox-demo-homework.php`
    //- So that I can ensure all the checkbox functionality is working as expected.
    //
    //
    //
    //Acceptance Criteria
    //
    //1. Subscribe to Newsletter:
    //   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
    //
    //2. Select Your Hobbies:
    //   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
    //   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.
    //
    //3. Select Your Interests:
    //   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
    //   - Click on the "Show/Hide interests section" button, and then select the **Music** checkbox.
    //
    //4. Preferences:
    //   - Verify that the **Receive Notifications** checkbox is disabled.
    //   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.

    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open browser https://syntaxprojects.com/basic-checkbox-demo-homework.php
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //1. Subscribe to Newsletter:
        //   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
        WebElement newsLetterCheckBox = driver.findElement(By.id("newsletter"));
        if (newsLetterCheckBox.isEnabled()) {
            newsLetterCheckBox.click();
            System.out.println("Subscribe to Newsletter checkbox is enable");
        } else {
            System.out.println("Subscribe to Newsletter checkbox is not enabled");
        }
        //2. Select Your Hobbies:
        //   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
        //   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.

        List<WebElement> HobbiesCheckboxes = driver.findElements(By.cssSelector("input.cb-element"));
        for (WebElement checkbox : HobbiesCheckboxes) {
            String value = checkbox.getAttribute("value");
            if (value.equalsIgnoreCase("reading") || value.equalsIgnoreCase("cooking")) {
                checkbox.click();
                System.out.println("Selected Hobbiest: " + value);

            }
        }
        //3. Select Your Interests:
        //   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
        //   - Click on the "Show/Hide interests section" button, and then select the **Music** checkbox.

        List<WebElement> interestHiddenCheckboxes = driver.findElements(By.cssSelector(".interest_section  input[type='checkbox']"));
        for (WebElement interest : interestHiddenCheckboxes) {
            if (!interest.isDisplayed()) {
                System.out.println("Interest'" + interest.getAttribute("value") + "' is initially hidden.");
            }
        }
        //   - Click on the "Show/Hide interests section" button, and then select the **Music** checkbox.
        WebElement toggleInterests = driver.findElement(By.id("toggleCheckboxButtons"));
        toggleInterests.click();
        Thread.sleep(1000);

        //Select Music checkbox
        WebElement musicCheckbox = driver.findElement(By.xpath("//input[@value='Music']"));
        if (musicCheckbox.isDisplayed()) ;
        musicCheckbox.click();
        System.out.println("Music interest is selected.");


        //4. Preferences:
        //   - Verify that the **Receive Notifications** checkbox is disabled.

        WebElement receiveNotifCheckbox = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        if (!receiveNotifCheckbox.isEnabled()) {
            System.out.println("'Receive Notifications' checkbox is initially disabled.");
        }
        //   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox
        WebElement enableButton = driver.findElement(By.id("enabledcheckbox"));
        enableButton.click();
        Thread.sleep(500); // Allow UI update

        if (receiveNotifCheckbox.isEnabled()) {
            receiveNotifCheckbox.click();
            System.out.println("'Receive Notifications' checkbox enabled and selected.");
        }
    }
}
