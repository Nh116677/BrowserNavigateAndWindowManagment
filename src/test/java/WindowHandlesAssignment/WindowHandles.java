package WindowHandlesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Master Window Handling: Learn how to handle multiple windows opened by buttons using Selenium commands, including switching between windows and verifying content.
    //
    //
    //
    //User Story
    //- **Title**: Verifying Window Popup Modal Functionality for Buttons B1 and B2
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/window-popup-modal-demo-homework.php`
    //- So that I can verify the functionality of Buttons B1 and B2.
    //
    //
    //
    //Acceptance Criteria
    //
    //1. Click on Button B1:
    //   - Ensure that clicking on the **B1** button opens a new window.
    //   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.
    //
    //2. Click on Button B2:
    //   - Ensure that clicking on the **B2** button opens a new window.
    //   - Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.

    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        // Maximize window
        driver.manage().window().maximize();

        //- I want to navigate to https://syntaxprojects.com/window-popup-modal-demo-homework.php
        //Open browser https://syntaxprojects.com/window-popup-modal-demo-homework.php
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        //1. Click on Button B1:
        //   - Ensure that clicking on the **B1** button opens a new window.
        //   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.

        WebElement B1 = driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
        WebElement B2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));

        B1.click();
        B2.click();

        //get the window handle of the main page
        String mainPageHandle = driver.getWindowHandle();
        System.out.println("The handle of the main page is" + mainPageHandle);

        //Switch the focus of the driver to the page B2
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles){
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            if(url.equals("https://syntaxprojects.com/b2-page.php")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        //Switch the focus to main page

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getCurrentUrl());


    }
}
