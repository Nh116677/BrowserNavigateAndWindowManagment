package MultiSelectSelectDropDownAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectSelectDropDown {
//Purpose of the Assessment:
//By completing this assessment, students will:
//
//a. Master Single-Select Dropdowns: Gain practical experience in using the **Select** class to select specific options from a dropdown and retrieve all available options for validation.
//
//b. Work with Multi-Select Dropdowns: Learn how to verify if a dropdown allows multiple selections, select multiple options using the **Select** class, and dynamically deselect an option after a delay.
//
//
// User Story
//- **Title**: Verifying Dropdown and Multi-Select Functionality
//- **As a user,**
//- I want to navigate to `https://syntaxprojects.com/basic-select-dropdown-demo-homework.php Links to an external site.`
//- So that I can verify that users can select the correct options from both single and multi-select dropdowns.
//
//
//
//Acceptance Criteria
//
//1. Select List Demo:
//   - Use the **Select** class to select the option **"Pear"** from the dropdown.
//   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
//   - Use the **getAllOptions** method to retrieve all options from the dropdown and print them on the console.
//
//2. Select Multiple Options:
//   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
//   - Using the **Select** class, make the following selections:
//     - **Traveling**
//     - **Cooking**
//     - **Gardening**
//   - Click the **"Get All Selected"** button and print the result on the console.
//   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
//   - Click the **"Get All Selected"** button again and print the result on the console.
//
//


    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Go to browser https://syntaxprojects.com/basic-select-dropdown-demo-homework.php
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        //1. Select List Demo:
//   - Use the **Select** class to select the option **"Pear"** from the dropdown.
//   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
//   - Use the **getAllOptions** method to retrieve all options from the dropdown and print them on the console.

        //Find the dropdown
        //make sure that u are writing down the select tag
        WebElement favoriteFruitDD = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select selfruit = new Select(favoriteFruitDD);
        //Select the option 'Pear'
        selfruit.selectByVisibleText("Pear");
        //Print all the available Option

        List<WebElement> fruitOptions = selfruit.getOptions();
        System.out.println("Available fruits: ");
        for (WebElement option : fruitOptions) {
            System.out.println("- " + option.getText());
        }


//2. Select Multiple Options:
//   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
//   - Using the **Select** class, make the following selections:
//     - **Traveling**
//     - **Cooking**
//     - **Gardening**

        WebElement DDMulti = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selmulti = new Select(DDMulti);
        boolean MultiOption = selmulti.isMultiple();
        System.out.println("Multi Option Favorite Hobbies is Selected:");
        selmulti.selectByVisibleText("Traveling");
        selmulti.selectByValue("Cooking");
        selmulti.selectByIndex(4);



//   - Click the **"Get All Selected"** button and print the result on the console.
//   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
//   - Click the **"Get All Selected"** button again and print the result on the console.

        //Click " Get All Selected" button
        driver.findElement(By.id("get_all")).click();

        //Print select options
        List<WebElement> alloptions = selmulti.getAllSelectedOptions();
        for (WebElement option : alloptions) {
            System.out.println(option.getText());
        }
        //Wait for 5 seconds
        Thread.sleep(5000);
        selmulti.deselectByVisibleText("Traveling");

        //Click the **"Get All Selected"** button again and print the result on the console.

        driver.findElement(By.id("get_all")).click();

        //Print selected options after deselection
        alloptions = selmulti.getAllSelectedOptions();
        System.out.println("Selected hobbies after deselecting 'Traveling':");
        for (WebElement selected : alloptions) {
            System.out.println("- " + selected.getText());
        }


    }
}