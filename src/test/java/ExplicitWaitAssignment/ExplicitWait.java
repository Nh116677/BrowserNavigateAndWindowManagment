package ExplicitWaitAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. **Master Synchronization with Explicit Waits**: Learn how to apply explicit waits to handle elements that load or change after specific interactions, ensuring synchronization before taking further actions.
    //
    //
    //
    //User Story
    //- **Title**: Verifying Synchronization Using Explicit Waits
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/synchronization-explicit-wait-homework.php`
    //- So that I can ensure the text, button, and checkbox functionalities work as expected using appropriate wait times.
    //
    //
    //
    //Acceptance Criteria
    //
    //1. **Change Text**:
    //   - Click on the button **"Click me to change text!"**.
    //   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console.
    //
    //2. **Enable Button**:
    //   - Click on the button **"Click me to enable button"**.
    //   - Wait for the button to be enabled, and once it's enabled, click on it.
    //
    //3. **Checkbox Checked Based on Click**:
    //   - Click on the button **"Click me to check the checkbox"**.
    //   - Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.

    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        // Maximize window
        driver.manage().window().maximize();


        //- I want to navigate to ("https://syntaxprojects.com/synchronization-explicit-wait-homework.php")
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");

        //1. **Change Text**:
        //   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console.
        //   - Click on the button **"Click me to change text!"**.
        WebElement changetextbtn = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changetextbtn.click();
        //Wait until text becomes Ssyntaxtechs


        //Wait until the text is changed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"), "Ssyntaxtechs"));
        WebElement textMsg = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textMsg.getText());

        //2. **Enable Button**:
        //   - Click on the button **"Click me to enable button"**.

        WebElement EnableBtn = driver.findElement(By.xpath("//button[@id='enable_button']"));
        EnableBtn.click();
        //   - Wait for the button to be enabled, and once it's enabled, click on it.
        //wait until the button is enabled
        WebElement ButtonEnabled = driver.findElement(By.xpath("//div[@class='card-body']/button"));
        ButtonEnabled.click();
        System.out.println("Button was enabled and clicked");


        //3. **Checkbox Checked Based on Click**:
        //   - Click on the button **"Click me to check the checkbox"**.

        WebElement CheckboxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        CheckboxBtn.click();
        //   - Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(checkbox));
        System.out.println("Checkbox is Selected: " + checkbox.isSelected());


    }
}





