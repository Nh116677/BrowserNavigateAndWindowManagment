package IframeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Master Iframe Handling: Learn how to interact with web elements inside iframes using different iframe-handling techniques (such as switching by index, name, or WebElement) taught in class.
    //
    //
    //
    // User Story
    //- **Title**: Handling Iframe Interactions for Form Submission
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/handle-iframe-homework.php`
    //- So that I can enter the username, select a city, and click on the age checkbox while correctly handling iframes.
    //
    //
    //
    //Acceptance Criteria
    //
    //1. Select Age Checkbox:
    //   - Select the **Age** checkbox.
    //
    //2. **Select City**:
    //   - Select any city from the dropdown.
    //
    //3. **Enter Username**:
    //   -enter your username in the **Username** field.

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to the page
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        // === Acceptance Criterion 3: Enter Username ===
        // The username field lives in the 1st iframe: name="textfield-iframe" (index 0)
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("Nhu Nguyen");

        // === Acceptance Criterion 2: Select City ===
        // The dropdown is also within the same iframe (dropdown-iframe)
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdown-iframe");
        //now we deal with dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel = new Select(dropdown);
        sel.selectByValue("NewYork");

        // === Acceptance Criterion 1: Select Age Checkbox ===
        // The checkbox is inside the 2nd iframe: name="dropdown-iframe" (index 1)
        //locating the third frame by WebElement
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.className("cb1-element")).click();
    }
}
