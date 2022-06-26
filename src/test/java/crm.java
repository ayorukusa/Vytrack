import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class crm extends TestBase {
    @Test
    public void Credentials() throws InterruptedException {
        driver.get("https://login2.nextbasecrm.com/");

        //AND help desk user is on the login page.
        //WHEN user fills username and password fields.
        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys("helpdesk55@cybertekschool.com");
        driver.findElement(By.cssSelector("input[name='USER_PASSWORD']")).sendKeys("UserUser");
        //AND user clicks on login button.
        driver.findElement(By.cssSelector("input[class='login-btn']")).click();
        //THEN user should be able to see search box button in dashboard page.


        WebElement isDisplayed = driver.findElement(By.cssSelector("input[id='search-textbox-input']"));
        System.out.println("isDisplayed.isDisplayed() = " + isDisplayed.isDisplayed());

        //AND user clicks on the search button
        //  user able to search documents,emp,post,etc..
        driver.findElement(By.cssSelector("input[id='search-textbox-input']")).sendKeys("employee");

        //AND user able to see information Company Structure

        Thread.sleep(3000);

    }
}