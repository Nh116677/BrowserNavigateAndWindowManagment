package IntroductionToLocatorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmissionUsingLocators {

    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //a.Familiarize with Selenium locators: Get hands-on experience with various
    // Selenium locators (id, name, tagname, linktext, partial linktext) to interact with form elements.

    //b.Work with form automation: Learn how to automate form-filling processes by locating
    // and interacting with input fields and buttons.

    //User Story
    //- Title:Form Submission Using Locators
    //- As a user,
    //- I want to fill out and submit a form on `https://www.syntaxprojects.com/locator-homework.php`
    // using different locators
    //- So that I can verify that the form is submitted successfully and displays the entered information.

    //Acceptance Criteria
    //1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
    //2. If the email address is not in the correct format (i.e., it doesn't contain an `@` sign),
    // the form should not be submitted, and an error message should be displayed.
    //3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
    //4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.

    public static void main(String[] args) {
        //declare the instance
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        //navigate to syntax products
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        //send the firstname to the text box
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("John");

        //send the lastname

        WebElement lastName = driver.findElement((By.name("last_name")));
        lastName.sendKeys("Smith");

        //send by email

        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("nhu116677@gmail.com");

        //press the button submit
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        //click on the first link
        WebElement link1 = driver.findElement(By.linkText("Click Here."));
        link1.click();

        // click on second link
        WebElement link2 = driver.findElement(By.partialLinkText("Link"));
        link2.click();

        // If the email address is not in the correct format (i.e., it doesn't contain an `@` sign),
        // the form should not be submitted, and an error message should be displayed.


    }
}







