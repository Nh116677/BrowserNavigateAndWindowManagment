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
        WebElement firstName = driver.findElement(By.id("fullName"));
        firstName.sendKeys("John");

        //send by email
        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("nhu116677@gmail.com");

        //send by Client Id

        WebElement clientId = driver.findElement(By.id("ClientId"));
        clientId.sendKeys("");

        //send by Client FeedBack

        WebElement clientFeedback = driver.findElement(By.id("ClientfeedbackId"));
        clientFeedback.sendKeys("");

        //send by Project Name
        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("");

        //send by Project Deadline Time
        WebElement projectDeadlineTime = driver.findElement(By.id("ProjectTimeId"));
        projectDeadlineTime.sendKeys("");

        //send by Current Address

        WebElement currentAddress = driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("");

        //send by Permanent Adress
        WebElement permanentAddress = driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("");

        //click on the first link
        WebElement link1 = driver.findElement(By.linkText("Click Here."));
        link1.click();

        //press the button submit
        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();


        // If the email address is not in the correct format (i.e., it doesn't contain an `@` sign),
        // the form should not be submitted, and an error message should be displayed.


    }
}







