package AlertAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Master JavaScript Alerts Interaction: Gain experience in handling different types of JavaScript alerts, including simple alerts, confirmation alerts, and prompts using Selenium commands.
    //
    //
    // User Story
    //- **Title**: Verifying JavaScript Alerts Functionality
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/javascript-alert-box-demo-homework.php`
    //- So that I can make sure the alerts functionality is working as expected.
    //
    //
    //
    //Acceptance Criteria
    //
    //1. Birthday Reminder:
    //   - Click on the "Birthday Reminder" button.
    //   - When the alert appears, accept the alert.
    //
    //2. Delete Confirmation:
    //   - Click on the **"Delete File"** button.
    //   - When the confirmation alert appears, **dismiss** the alert.
    //   - Print the status of the action (e.g., "You pressed Cancel!") that appears on the screen, to the console.
    //
    //3. Name Collection:
    //   - Click on the **"Enter Your Name"** button.
    //   - Accept the alert and provide a name.
    //   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.

    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        // Maximize window
        driver.manage().window().maximize();

        //- I want to navigate to https://syntaxprojects.com/javascript-alert-box-demo-homework.php
        //Open browser https://syntaxprojects.com/javascript-alert-box-demo-homework.php
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        //1. Birthday Reminder:
        //   - Click on the "Birthday Reminder" button.
        //   - When the alert appears, accept the alert.
        WebElement birthdayReminderBtn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        birthdayReminderBtn.click();
        Thread.sleep(2000);

        //Accept the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //2. Delete Confirmation:
        //   - Click on the **"Delete File"** button.
        //   - When the confirmation alert appears, **dismiss** the alert.

        WebElement deleteFileBtn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFileBtn.click();
        Thread.sleep(2000);
        alert.dismiss();
        //   - Print the status of the action (e.g., "You pressed Cancel!") that appears on the screen, to the console.
        WebElement confirmMessage = driver.findElement(By.id("confirm-demo"));
        String confirmText = confirmMessage.getText();
        System.out.println("Confirmation Alert Status: " + confirmText);

        //3. Name Collection:
        //   - Click on the **"Enter Your Name"** button.
        //   - Accept the alert and provide a name.

        WebElement nameCollection = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        nameCollection.click();
        alert.sendKeys("Nhu Nguyen");
        Thread.sleep(2000);
        alert.accept();
        //   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.

        WebElement promptMessage = driver.findElement(By.id("prompt-demo"));
        String promptText = promptMessage.getText();
        System.out.println("Prompt Output: " + promptText);






    }
}
