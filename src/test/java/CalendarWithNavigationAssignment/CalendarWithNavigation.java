package CalendarWithNavigationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarWithNavigation {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. **Master Dynamic Date Picker Interaction**: Learn how to dynamically interact with a jQuery date picker and select both "From" and "To" dates using flexible code.
    //
    //
    // User Story
    //- **Title**: Verifying Dynamic Date Selection in the jQuery Date Picker
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/jquery-date-picker-demo-homework.php`
    //- So that I can ensure the correct "To" and "From" dates are selected from the calendar.
    //
    //
    //
    //Acceptance Criteria
    //
    //1. **Select "From" and "To" Dates**:
    //   - Select the **From** date and the **To** date in the jQuery date picker.
    //   - The code logic should be **dynamic**, meaning it should work with any selected dates without requiring any changes to the core logic.
    //   - The selection should not rely on hard-coded date values and should be adaptable if the date range changes.
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        //Click on the calendar
        driver.findElement((By.id("from_date"))).click();
        //Get the month
        boolean nofound = true;
        while (nofound) {
            WebElement month = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']"));
            String currentMonth = month.getText();
            if (currentMonth.equals("July")) {
                //select the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : allDates) {
                    String requiredDate = date.getText();
                    if (requiredDate.equals("25")) {
                        date.click();
                    }
                }
                //break the loop
                nofound = false;
            }
            if (nofound) {
                //click on next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }

        //Click on the calendar
        driver.findElement((By.id("to_date"))).click();
        //Get the month
        boolean nofound1 = true;
        while (nofound1) {
            WebElement month = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']"));
            String currentMonth = month.getText();
            if (currentMonth.equals("September")) {
                //select the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : allDates) {
                    String requiredDate = date.getText();
                    if (requiredDate.equals("5")) {
                        date.click();
                    }
                }
                //break the loop
                nofound1 = false;
            }
            if (nofound1) {
                //click on next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }
    }
}



