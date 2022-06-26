package VytrackTestCases.TruckDriver;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VehicleCostPage extends TestBase {

    @BeforeMethod

    public void setUp(){
        driver.get("https://qa2.vytrack.com/");
        WebElement driver1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        driver1.sendKeys("user180" + Keys.ENTER);

        WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123" + Keys.ENTER);



    }
    @Test
    public void costPage() throws InterruptedException {
//        Given the driver is on a Quick Launchpad page
//        When the driver clicks on Fleet tab
//        And navigate to vehicles Cost sub-tab
//        Then you will be able to see Vehicle Costs page
        WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleet.click();
  Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Vehicle Costs']")).click();
//        And you should be able to click on Create Vehicle Cost
//        And you opened the Create Vehicle Cast page
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();
//        Then you should be able to click Cancel
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn back icons-holder-text ']")).click();
//        And check text "Vehicle Costs" is Displayed.
        WebElement textCost =driver.findElement(By.cssSelector("div[class='pull-left']>h1"));
        System.out.println("Text cost is displayed = " + textCost.isDisplayed());


        driver.findElement(By.xpath("(//table[@class='grid table-hover table table-bordered table-condensed']//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Type'])[1]")).click();

//        And you will click to "Add attachment " icon .
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='btn icons-holder-text no-hash'])[1]")).click();
//       And click choose file and choose file , enter a comment
       // driver.findElement(By.xpath("//input[@id='oro_attachment_file_file-uid-62a389c5a1c1d']")).click();

        Thread.sleep(3000);
  // WebElement chooseFile =driver.findElement(By.xpath("\"//input[@type='file']\""));

        //Upload File;

//        Thread.sleep(3000);
//        WebElement chooseFile= driver.findElement(By.xpath("//*[@id=\"oro_attachment_file_file-uid-62a3e782e5d7f\"]"));
      //chooseFile.sendKeys(path);
//        And click save button
//        Then you will see chosen file isDisplayed in Attachments.
       // driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/a")).click();

        Thread.sleep(3000);
        //    driver.findElement(By.xpath("//input[@id='oro_attachment_file_file-uid-62a38ee65db2c']")).click()

        //Upload File;
        String path= "/Users/ahmetyoruk/Desktop/deneme.png";
        Thread.sleep(5000);
        WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
        chooseFile.sendKeys(path);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        Thread.sleep(3000);
    }
}


