package WebElementCommandsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Practice retrieving and verifying element attributes, such as custom text and title attributes, using Selenium commands.
    //
    //b.Understand how to interact with checkboxes, ensuring that elements are enabled before clicking and verifying disabled elements.
    //
    //c. Learn to reveal and interact with hidden elements (like the "Art Exhibition" option) by clicking on a "Show More Options" link.
    //
    //d. Gain experience in clearing and sending keys to input fields
    //
    //
    // User Story
    //- Title: Completing Actions on Form Using Selenium Commands
    //- As a user,
    //- I want to navigate to `https://syntaxprojects.com/selenium_commands_selector-homework.php`
    //- So that I can complete all the necessary actions mentioned in the acceptance criteria using Selenium commands.
    //
    //Acceptance Criteria
    //1. Retrieve Attribute:
    //   - Retrieve the text "inspect me to view my custom attribute" from the element and print it on the console, ensuring the text is correct.
    //
    //2. Meal Preference:
    //   - Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it.
    //   - Ensure that the option for "Tech Talk" is disabled.
    //   - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.
    //
    //3. Mystery Message:
    //   - Retrieve the value of the attribute `title` from the element containing the text "Hover me to reveal the secret" and print it on the console.
    //
    //Option Box:
    //   - If "Checkbox 1" is enabled, click on it.
    //   - Ensure that "Checkbox 2" is disabled.---
    //
    //5. Input Field:
    //   - clear the text in the input box and send the text "here is the custom text entered" using selenium commands.

    public static void main(String[] args) throws InterruptedException{
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Navigate to https://syntaxprojects.com/selenium_commands_selector-homework.php
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        //1. Retrieve Attribute:
        // - Retrieve the text "inspect me to view my custom attribute" from the element and print it on the console, ensuring the text is correct.
        WebElement retrieveAttribute = driver.findElement(By.xpath("//div[@id='textattr']"));
        String text = retrieveAttribute.getText();
        System.out.println("The text in the Selenium Commands is: " +  text );

        //2. Meal Preference:
        //   - Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it.

        WebElement checkboxMusicalFestival = driver.findElement(By.xpath("//input[@value='music_festival']"));
       if(checkboxMusicalFestival.isEnabled()) {
           checkboxMusicalFestival.click();
           System.out.println("The checkbox Musical Festival is enabled and click.");
       }else{
           System.out.println("The checkbox Musical Festival is not enabled");
       }

        //   - Ensure that the option for "Tech Talk" is disabled.
        WebElement checkboxTechTalk = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateofTechTalk = checkboxTechTalk.isEnabled();
        System.out.println("The checkbox Tech Talk is enabled: " + stateofTechTalk);

        //   - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.
        WebElement showMoreOptions = driver.findElement(By.xpath("//button[@onclick ='toggleHiddenRadio(event)']"));
        showMoreOptions.click();
        Thread.sleep(2000);

        WebElement checkboxArtExhibition = driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']"));
        if(checkboxArtExhibition.isDisplayed()){
        checkboxArtExhibition.click();
            System.out.println("Art Exhibition checkbox is now displayed and clicked");
        }

        //3. Mystery Message:
        //   - Retrieve the value of the attribute `title` from the element containing the text "Hover me to reveal the secret" and print it on the console.
        WebElement mysteryMessage = driver.findElement(By.xpath("//div[@title='Hover over me to reveal the secert']"));
        String text1 = mysteryMessage.getText();
        System.out.println("The text in the WebElement is: " + text1);

        //Option Box:
        //   - If "Checkbox 1" is enabled, click on it.
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value ='CheckboxFirst']"));
        if(checkbox1.isEnabled());{
            checkbox1.click();
            System.out.println("Checkbox 1 is enabled and clicked");
        }
        //   - Ensure that "Checkbox 2" is disabled.---
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value ='disabledCheckbox']"));
        if(!checkbox2.isEnabled()){
            System.out.println("Checkbox 2 is disabled as expected");
        }

        //5. Input Field:
        //   - clear the text in the input box and send the text "here is the custom text entered" using selenium commands.
        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");
        System.out.println("The text 'here is the custom text entered' is entered in the Input Field.");



    }
}
