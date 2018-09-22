package cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserTest {
    private WebDriver driver;

    @Given("^type codersguru$")
    public void type_codersguru() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "/home/marcin/IdeaProjects/Zadanie/src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://men-men-s-01.codersguru.pl/");

    }

    @Then("^Goto add new user$")
    public void goto_add_new_user() throws Throwable {
        driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]")).click();

    }

    @When("^type in to \"([^\"]*)\"$")
    public void type_in_to(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_email\"]")).sendKeys(arg1);

    }

    @When("^type username$")
    public void type_username() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_name\"]")).sendKeys("username12");

    }

    @When("^type Last Name$")
    public void type_Last_Name() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_lastname\"]")).sendKeys("dasda");

    }

    @When("^Password$")
    public void password() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_first\"]")).sendKeys("username12");

    }

    @When("^Repeat password$")
    public void repeat_password() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_second\"]")).sendKeys("username12");

    }

    @When("^Type City Name$")
    public void type_City_Name() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"form_city\"]")).sendKeys("username12");
//throw new PendingException();

    }

    @When("^Type Zip-Code$")
    public void type_Zip_Code() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"form_postal_code\"]")).sendKeys("54-100");

    }

    @When("^Type Street Name$")
    public void type_Street_Name() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"form_street\"]")).sendKeys("username12");

    }

    @When("^Type Home Number$")
    public void type_Home_Number() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"form_number\"]")).sendKeys("username12");

    }

    @When("^Click \"([^\"]*)\"$")
    public void click(String arg1) throws Throwable {
        driver.findElement(By.xpath("/html/body/div/div/div/form/div[12]/input ")).click();

    }

    @When("^Click register$")
    public void click_register() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"register-submit-btn\"]")).click();

    }

}


///home/marcin/IdeaProjects/Zadanie/src/main/resources/