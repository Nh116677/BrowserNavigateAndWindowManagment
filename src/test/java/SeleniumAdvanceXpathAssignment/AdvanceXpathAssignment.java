package SeleniumAdvanceXpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathAssignment {
    public static void main(String[] args) throws InterruptedException {
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

        //1.The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
        //Identify the 'least favourite book in reverse order

        WebElement input1 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        input1.sendKeys("You Become What You Think");

        //identify the second least favourite book
        WebElement input2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        input2.sendKeys("Read People Like A Book");

        //identify the first least favourite
        WebElement input3 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        input3.sendKeys("Atomic Habits");

        //2. The user should enter the name of their favorite book using advanced Xpath.

        WebElement input4 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        input4.sendKeys("Can\'t Hurt Me: Master Your Mind and Defy the Odds");

        WebElement input5 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        input5.sendKeys("Master Your Emotions");

        WebElement input6 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        input6.sendKeys("Think Faster Talk Smarter");

        //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
        WebElement grandparent = driver.findElement(By.xpath("//div[@id='familyTree']/input[1]"));
        grandparent.sendKeys("Grandfather name is Harry");

        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/input[1]/following-sibling::input[1]"));
        parent.sendKeys("Mother name is Mary");

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/input[1]/following-sibling::input[2]"));
        child.sendKeys("Child name is Jacob");

        //4. The form should submit successfully only if all fields are filled out correctly using the appropriate advanced Xpath expressions.(to be removed)

        Thread.sleep(5000);

        grandparent.clear();
        parent.clear();
        child.clear();

        driver.navigate().refresh();









    }
}
