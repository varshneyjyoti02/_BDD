package FeatureForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefForm {
	
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file://ndafile/GLC-G102/BDD/WorkingWithForms.html");
	}

	@When("^Enter the Username,Password,ConfirmPassword,FirstName,LastName,Gender,DateOfBirth,Email,Address,City,Phone and Hobbies$")
	public void enter_the_Username_Password_ConfirmPassword_FirstName_LastName_Gender_DateOfBirth_Email_Address_City_Phone_and_Hobbies() throws Throwable {
		driver.findElement(By.id("txtUserName")).sendKeys("Jyoti02");
		driver.findElement(By.name("txtPwd")).sendKeys("Jyoti123");
		driver.findElement(By.className("Format")).sendKeys("Jyoti123");
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Jyoti");
		driver.findElement(By.name("txtLN")).sendKeys("Varshney");
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		driver.findElement(By.name("DtOB")).sendKeys("10/02/1998");
		driver.findElement(By.name("Email")).sendKeys("jyoti.@gmail.com");
		driver.findElement(By.name("Address")).sendKeys("Talwade");
		Select drpCity=new Select(driver.findElement(By.name("City")));
		drpCity.selectByIndex(1);
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("7218888888");
		driver.findElement(By.cssSelector("input[value='Reading'")).click();
		driver.findElement(By.cssSelector("input[value='Music'")).click();
		Thread.sleep(1000);
	
	}

	@Then("^Reset The credential$")
	public void reset_The_credential() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='myStyle']")).click();
	}

}
