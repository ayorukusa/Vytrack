package VytrackTestCases.StoreManager;

import Base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateCar extends TestBase {
    @Test
    public void VehiclePage() throws InterruptedException {

        driver.get("https://qa2.vytrack.com/");

        WebElement driver1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        driver1.sendKeys("storemanager215" + Keys.ENTER);

        WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123" + Keys.ENTER);

//    3-Verify user should be able to select Vehicle from Fleet Section.
//        4-Verify user should be able to see all vehicle  informations on the grid

        Thread.sleep(3000);

        WebElement fleet1 = driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1']"));
        fleet1.click();

        Thread.sleep(3000);

        WebElement verifyVehicle1 = driver.findElement(By.xpath("//span[.='Vehicles']"));
        verifyVehicle1.click();

//        //5-Verify user should be able to click on the ""Create Car"" button to create a car

        Thread.sleep(3000);
        WebElement createCar = driver.findElement(By.xpath("//a[@title='Create Car']"));
        createCar.click();
        Thread.sleep(3000);
        Faker faker =new Faker();

        String licensePlate=faker.hipster().word();
        Thread.sleep(3000);
        System.out.println("licensePlate = " + licensePlate);


    }}
