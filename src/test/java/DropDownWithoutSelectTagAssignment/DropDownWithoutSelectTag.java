package DropDownWithoutSelectTagAssignment;

import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTag {
//Purpose of the Assessment:
//By completing this assessment, students will:
//
//a. Handle Dropdowns Without the Select Tag: Gain experience in working with dropdown menus that do not utilize the `select` tag, ensuring proper functionality using traversal techniques.
//
//b. Traverse Dropdown Options: Learn how to retrieve and iterate through all options in a dropdown list before selecting the desired option programmatically.
//
//c. Avoid Direct Selection: Understand the importance of avoiding direct selection (e.g., via Xpath) and instead use traversal methods to make selections in dropdown menus.
//
//
//User Story
//- Title: Verifying Dropdown Without Select Tag Functionality
//- **As a user,**
//- I want to navigate to `https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php`
//- So that I can ensure that the dropdown works as expected even without a `select` tag.
//
//
//
//Acceptance Criteria
//
//1. Choose Your Dream Fruit:
//   - Retrieve all options from the "Choose your Dream Fruit" dropdown.
//   - Traverse through the list of options, and select **Mango**.
//   - Ensure that the selection process is done by iterating through the options and not by directly clicking on the option using Xpath or any direct locator to the item.
//
//2. Choose Your Favorite Hobby:
//   - Retrieve all options from the "Choose your Favorite Hobby" dropdown.
//   - Traverse through the list and select **Reading**.
//   - Ensure that the desired option is selected by iterating through the options, not by directly clicking on it using Xpath or any other direct locator to the item.

    public static void main(String[] args) throws InterruptedException {


        //Declare instance
        WebDriver driver = new ChromeDriver();
        // Maximize window
        driver.manage().window().maximize();

        //- I want to navigate to `https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php``
        //Open browser `https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php``
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        //1. Choose Your Dream Fruit:
//   - Retrieve all options from the "Choose your Dream Fruit" dropdown.

        //click to open the dropdown
        WebElement dreamFruitsDropDown = driver.findElement(By.id("dream_fruits"));
        dreamFruitsDropDown.click();

        //get all dropdown options
        List<WebElement> dreamFruitsOptions = driver.findElements(By.cssSelector(".single-dropdown-menu li a"));

        // Traverse through the list of options, and select **Mango**.
        // Ensure that the selection process is done by iterating through the options and not by directly clicking on the option using Xpath or any direct locator to the item.

        for(WebElement option : dreamFruitsOptions){
            if (option.getText().equalsIgnoreCase("Mango")){
                option.click();
                break;
            }
        }

        //2. Choose Your Favorite Hobby:
        //   - Retrieve all options from the "Choose your Favorite Hobby" dropdown.

        //click to open the dropdrop
        WebElement yourFavoriteHobbies = driver.findElement(By.id("favorite_hobbies"));
        yourFavoriteHobbies.click();

        //get all dropdown options
        List<WebElement> favoriteHobbiesOptions = driver.findElements(By.cssSelector(".multi-dropdown-menu li a"));
        //   - Traverse through the list and select **Reading**.
        //   - Ensure that the desired option is selected by iterating through the options, not by directly clicking on it using Xpath or any other direct locator to the item.

        for (WebElement option : favoriteHobbiesOptions){
            if(option.getText().equalsIgnoreCase("Reading")){
                option.click();
                break;
            }
        }





    }
}