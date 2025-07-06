package CalendarWithNavigationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

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
        driver.findElement(By.xpath("//input[@id='from_date']")).click();
        //Get the month

        WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String currentMonth = month.getText();
        // Find the next button
        WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        boolean notMonth = true;
        while (notMonth) {
            //Check if we are at the desired month
            if (currentMonth.equals("July")) {
                //selection of the date
                List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
                for(WebElement date : dates){
                    String currentDate = date.getText();
                    if(currentDate.equals("6")){
                        date.click();
                    }
                }
                notMonth = false;
            }
            //click on next
            else {
                nextButton.click();
                currentMonth = month.getText();
            }


        }
    }
}




