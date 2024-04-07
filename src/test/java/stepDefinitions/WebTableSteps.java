package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSteps {
    WebDriver driver;

    @Given("^User navigates to the web tables page$")
    public void userNavigatesToWebTablesPage() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
    }

    @And("^User clicks on the \"ADD\" button$")
    public void userClicksOnAddButton() {
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
    }

    @And("^User adds a new record$")
    public void userAddsNewRecord() {

    }

    @And("^User edits the added record$")
    public void userEditsAddedRecord() {

    }

    @Then("^User verifies that the added record is successfully updated$")
    public void userVerifiesRecordUpdated() {

        driver.quit();
    }
}
