package StaticTableAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    //Purpose of the Assessment:
    //By completing this assessment, students will:
    //
    //a. Master Dynamic Table Search: Learn how to dynamically search and filter table data based on specific criteria (e.g., country name), avoiding hard-coded values.
    //
    //User Story
    //- **Title**: Verifying Dynamic Table Search Functionality
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/table-search-filter-demo-homework.php`
    //- So that I can ensure the table fulfills the following criteria dynamically.
    //
    //Acceptance Criteria
    //
    //1. **Print All Entries with the Country "USA"**:
    //   - Dynamically search the table for entries where the country is **"USA"**.
    //   - Print all the rows matching criteria
    //
    //2. **Dynamic Logic**:
    //   - Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
    //   - The code should be flexible enough to accommodate changes in the country name
    //   - If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work, and the output should reflect the correct entries based on the updated country.

    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        //- I want to navigate to ("https://syntaxprojects.com/table-search-filter-demo-homework.php")
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        //1. **Print All Entries with the Country "USA"**:
        //   - Dynamically search the table for entries where the country is **"USA"**.
        //   - Print all the rows matching criteria
        String targetCountry = "USA";
        //Get all the row from the table body
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println("Target country search: " + targetCountry);

        for (WebElement row : rows) {
            //Get all the columns in current row
            List<WebElement> columns = row.findElements(By.tagName("td"));
            if (columns.size() > 0) {
                String country = columns.get(2).getText();//country is in 3rd column(index 2)
                if (country.equalsIgnoreCase(targetCountry)) {
                    //print this particular row
                    System.out.println(row.getText());
                }

            }

        }
    }
}

