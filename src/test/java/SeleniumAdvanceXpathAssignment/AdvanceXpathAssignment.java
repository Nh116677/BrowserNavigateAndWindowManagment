package SeleniumAdvanceXpathAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathAssignment {
    public static void main(String[] args) {
        //Purpose of the Assessment:
        //
        //
        // a. Master Advanced Xpath Techniques: Gain hands-on experience in using advanced Xpath selectors such as parent, following-sibling, and preceding-sibling to navigate and interact with complex web elements.
        //
        //
        //User Story
        //- Title: Filling Form Using Advanced Xpath Selectors
        //- As a user,
        //- I want to navigate to `https://syntaxprojects.com/advanceXpath-homework.php`
        //- So that I can fill in specific details in the form using advanced Xpath selectors.
        //
        //
        //Acceptance Criteria
        //1.The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
        //2. The user should enter the name of their favorite book using advanced Xpath.
        //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
        //4. The form should submit successfully only if all fields are filled out correctly using the appropriate advanced Xpath expressions.(to be removed)


        //declare the instance
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        //navigate to syntax https://syntaxprojects.com/advanceXpath-homework.php homework
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
    }
}
