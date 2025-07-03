package ImplicitWaitAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. **Master Synchronization Techniques**: Learn how to effectively use Implicit waits to handle elements that load after a delay, ensuring that checkboxes appear before interaction.
    //
    //User Story
    //- **Title**: Verifying Checkbox Selection Using Synchronization
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/synchronization-waits-homework.php`
    //- So that I can verify the functionality of selecting **Option 1** in the checkbox after the appropriate wait time.
    //
    //Acceptance Criteria
    //
    //1. **Button Click and Checkbox Selection**:
    //   - Click on the button labeled **"Click me"**.
    //   - Use an appropriate wait method to wait until the checkbox options appear.
    //   - Once the checkboxes are visible, select **Option 1** from the list of checkboxes.
    public static void main(String[] args) {

        //Declare instance
        WebDriver driver = new ChromeDriver();
        // Maximize window
        driver.manage().window().maximize();

        //- I want to navigate to ("https://syntaxprojects.com/synchronization-waits-homework.php")
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");

        //1. **Button Click and Checkbox Selection**:

        //   - Use an appropriate wait method to wait until the checkbox options appear.
        //Global wait implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //   - Click on the button labeled **"Click me"**.
        WebElement clickMeBtn = driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        clickMeBtn.click();

        //   - Once the checkboxes are visible, select **Option 1** from the list of checkboxes.
        WebElement RadioButton1 = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        RadioButton1.click();

    }
}
