package DynamicTableAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class DynamicTable {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Master Dynamic Employee Search: Learn how to implement logic that can search for a specific employee ID across multiple pages in a web-based table dynamically.

    //User Story
    //- **Title**: Searching and Deleting an Employee by ID
    //- **As a user,**
    //- I want to navigate to `http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login`
    //- So that I can search for an employee ID in the table and delete it dynamically.

    //Acceptance Criteria

    //1. Look for an Employee ID on Page 3:
    //   take any employee id on page 3 manually.

    //2. Dynamic Search and Deletion:
    //   - Write dynamic code logic that goes to the website, searches for the employee ID across multiple pages , and once found, selects the checkbox associated with that employee.

    //3. Dynamic Logic:
    //   - The code should be **dynamic**, meaning that it should work even if the employee ID is located on other pages (such as 4, 5, 7, etc.) without changing any part of the logic.
    //   - The script should be able to navigate across pages dynamically and locate the employee ID without requiring manual input of page numbers.

    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //Step 1: Login by username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //Step 2: Enter password
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        //Step 3: Click the login button
        driver.findElement(By.id("btnLogin")).click();
        //Step 4: Click on PIM option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //1. Look for an Employee ID on Page 3:
        //   take any employee id on page 3 manually.
        //Step 5: Get column by id
        List<WebElement> allColumnIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        boolean notFound = true;
        while (notFound){
            int count = 1;
            for(WebElement id : allColumnIDs){
                String idNo =id.getText();
                if(idNo.equals("116575A")){
                    System.out.println(count);
                    //2. Dynamic Search and Deletion:
                    //   - Write dynamic code logic that goes to the website, searches for the employee ID across multiple pages , and once found, selects the checkbox associated with that employee.
                    //Find the checkbox and click on it
                    WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr["+ count +"]/td[1]"));
                    checkbox.click();
                    //exit the while loop
                    notFound = false;
                }
                count = count + 1;
            }
            //3. Dynamic Logic:
            //   - The code should be **dynamic**, meaning that it should work even if the employee ID is located on other pages (such as 4, 5, 7, etc.) without changing any part of the logic.
            //   - The script should be able to navigate across pages dynamically and locate the employee ID without requiring manual input of page numbers.
            if (notFound){
                WebElement nextButton = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextButton.click();
                allColumnIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            }
        }
    }
}