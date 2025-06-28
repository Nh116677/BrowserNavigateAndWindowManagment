package CSSAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.Callable;

public class CSSAssignment {

    public static void main(String[] args) {
        //Purpose of the Assessment:
        //
        //By completing this assessment, students will:
        //a. Master CSS Selectors: Gain practical experience in using CSS selectors to accurately target and interact with web elements, ensuring precise selection for form input fields.
        //
        // User Story
        //- Title: Form Submission Using Unique CSS Selectors
        //- As a user,
        //- I want to navigate to `https://syntaxprojects.com/cssSelector-homework.php`
        //- So that I can successfully fill the form using appropriate CSS selectors.
        //
        //Acceptance Criteria
        //1. The user should fill in all the text boxes in the form using*CSS selectors that are unique and return only one element (1/1).
        //

        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize Screen
        driver.manage().window().maximize();

        //Navigate to https://syntaxprojects.com/cssSelector-homework.php
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        //Find User ID using id = Tagname#value
        WebElement userId = driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("Nhu116677");

        //Find UserName using id = Tagname#value
        WebElement userName = driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("Nhu Nguyen");

        //Find Intro to Lecture using contains = Tagname[attribute*='value']
        WebElement introToLecture = driver.findElement(By.cssSelector("input[name*=LectureIntro]"));
        introToLecture.sendKeys("CSS Selector");

        //Find Feedback from Ray  classname = Tagname.value
        WebElement rayFeedback = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        rayFeedback.sendKeys("Learning CSS is simple as learning ABC.");

        //Find Feedback from Ducky using classname = Tagname.value
        WebElement duckyFeedback = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        duckyFeedback.sendKeys("Learning CSS is not so hard, consistency and repetition will master the art of CSS selector.");

        //Find Client ID using ends-with = Tagname[attribute$='value']
        WebElement clientID = driver.findElement(By.cssSelector("input[data-ends^='CSSModuleconclientID']"));
        clientID.sendKeys("Nh109034");

        //Find email using contains = Tagname[attribute*='value']

        WebElement email = driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("nhu116677@gmail.com");


        //Find Course Topic using starts-with = Tagname[attribute^='value']

        WebElement courseTopic = driver.findElement(By.cssSelector("input[name^='CourseTopic']"));
        courseTopic.sendKeys("CSS for beginners");


    }
}







