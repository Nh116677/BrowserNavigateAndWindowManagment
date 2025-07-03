package ImplicitWaitAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. **Master Synchronization Techniques**: Learn how to effectively use Implicit waits to handle elements that load after a delay, ensuring that checkboxes appear before interaction.
    //
    //
    //
    //
    //User Story
    //- **Title**: Verifying Checkbox Selection Using Synchronization
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/synchronization-waits-homework.php`
    //- So that I can verify the functionality of selecting **Option 1** in the checkbox after the appropriate wait time.
    //
    //
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

    }
}
