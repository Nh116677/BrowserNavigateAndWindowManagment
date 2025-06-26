package SeleniumRelativeXpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RelativeXpathAssignment {
    //Purpose of the Assessment:
    //
    //
    //By completing this assessment, students will:
    //a. Understand XPath locators: Gain practical experience in using XPath locators to interact with web elements, including text, attributes, and the contains() and starts-with() methods.
    //b. Apply indexing in XPath: Learn how to use XPath indexing to uniquely identify and interact with specific elements on a web page when multiple elements share similar attributes.
    //c. Use multiple conditions with XPath: Practice using operators (e.g., and, or) to locate elements that meet two or more conditions simultaneously.
    //
    //
    //User Story :
    //
    //Fill Out Form Using XPath
    //Given the user navigates to `https://www.syntaxprojects.com/Xpath-homework.php`,
    //When the user enters the necessary information in the form,
    //Then all the necessary key points in the acceptance criteria should be met.
    //
    //
    //Acceptance Criteria:
    //1. The user is able to enter their hobbies using XPath.
    //2. When the user clicks the "Click Here" button using XPath.,
    //   Then the message `"Button clicked:"` should be displayed on the screen.
    //3. The user successfully enters their favorite movie using XPath to find the text boxes.
    //4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
    //5. The user is able to enter the city in the designated field.
    //6. The user must use the **indexing technique** learned in class to enter  email addresses.
    //7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
    //8. The user can use **any XPath technique** to enter the street number and house number.

    public static void main(String[] args) {
        //declare the instance
        WebDriver driver = new ChromeDriver();


        //maximize the screen
        driver.manage().window().maximize();

        //navigate to syntax Xpath homework
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        //Find your hobbies
        //1. The user is able to enter their hobbies using XPath.
        WebElement yourhobbies = driver.findElement(By.xpath("//input[@id=\"yourHobbiesId\"]"));
        yourhobbies.sendKeys("Singing and cruising");

        //Find button and click on it
        //2. When the user clicks the "Click Here" button using XPath.,
       // Then the message `"Button clicked:"` should be displayed on the screen.
        WebElement button = driver.findElement(By.xpath("//button[@id=\"display_text\"]"));
        button.click();
        System.out.println(button);

        //Find favourite movie
        //3. The user successfully enters their favorite movie using XPath to find the text boxes.
        WebElement favouriteMovies = driver.findElement(By.xpath("//input[@id=\"favoriteMoviesId\"]"));
        favouriteMovies.sendKeys("Cinderella, The Lord of the Rings, Toy Story");

        //Find text
        //4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'sit amet consectetur adipisicing elit')]"));
        String textOfString = text.getText();
        System.out.println(textOfString);


        //Find your city
        //5. The user is able to enter the city in the designated field.
        WebElement city = driver.findElement(By.xpath("//input[@id=\"yourCity\"]"));
        city.sendKeys("Toronto");

        //Find Personal, Office and Professional emails
        //6. The user must use the **indexing technique** learned in class to enter  email addresses.
        WebElement personalEmail = driver.findElement(By.xpath("(//form[@id='frm']//input[@type='email'])[1]"));
        personalEmail.sendKeys("personal@gmail.com");

        WebElement officeEmail = driver.findElement(By.xpath("(//form[@id='frm']//input[@type='email'])[2]"));
        officeEmail.sendKeys("office@gmail.com");

        WebElement professionalEmail = driver.findElement(By.xpath("(//form[@id='frm']//input[@type='email'])[3]"));
        professionalEmail.sendKeys("professional@gmail.com");

        //Find client name  and client Id field
        //7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
        WebElement clientName = driver.findElement(By.xpath("//input[@name='clientName' and @id='clientName' and @data-detail='one']"));
        clientName.sendKeys("Nhu Nguyen");

        WebElement clientId = driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId' and @data-detail='two']"));
        clientId.sendKeys("Nh116677");

        //Find street number and house number
        //8. The user can use **any XPath technique** to enter the street number and house number.

        WebElement streetNumber = driver.findElement(By.xpath("//input[@name= 'StreetNo']"));
        streetNumber.sendKeys("23");

        WebElement houseNumber = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("1111");







    }
}
