package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class ButtonClickSteps {
    private WebDriver driver;

    @Given("I am on the DemoQA Elements page")
    public void iAmOnTheDemoQAElementsPage() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
    }

    @When("I click on the {string} element")
    public void iClickOnTheElement(String elementName) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + elementName + "']"));
        element.click();
    }

    @When("I click the {string} button")
    public void iClickTheButton(String buttonName) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        button.click();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        WebElement messageElement = driver.findElement(By.id("output"));
        String actualMessage = messageElement.getText();
        assertEquals(expectedMessage, actualMessage);
        driver.quit();
    }
}
