package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;


public class StepDefinitions {
	
	
	public static WebDriver driver;
	


	
/*Given("^User should launch the chrome browser and able to open the Swapi website$")
	public void user_should_launch_the_chrome_browser_and_able_to_open_the_swapi_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Assignment Workspace\\SeleniumAssignment\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://swapi.dev/");
		driver.manage().window().fullscreen();
	}

	@Then("^Enter the valid URL$")
	public void enter_the_valid_url() {
		System.out.println("SWAPI is open");
		 		
	}

	@Then("^User navigated to the SWAPI website$")
	public void user_navigated_to_the_swapi_website() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		//Assert.assertEquals("SWAPI", title);
    	
		
	} */
	
	
	
	
	
	
	@Given("^User should launch the chrome browser and is able to open the Swapi.dev website$")
	public void user_should_launch_the_chrome_browser_and_is_able_to_open_the_swapi_dev_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\New Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://swapi.dev/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
        System.out.println("swapi Page title ::"+ title);
        
	}

	@Then("^enter the valid request URL in the search box to get the list of all the Star Wars characters$")
	public void enter_the_valid_request_url_in_the_search_box_to_get_the_list_of_all_the_star_wars_characters() {
		WebElement search= driver.findElement(By.xpath("//input[@id='interactive']"));
		search.sendKeys("people/");
	}

	@Then("^Click Request$")
	public void click_request() {
		driver.findElement(By.xpath("//button[contains(text(),'request')]")).click();	
	}

	
	
	
	
	@Given("^User should open the chrome and is able to open the Swapi.dev website$")
	public void user_should_open_the_chrome_and_is_able_to_open_the_swapi_dev_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\New Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://swapi.dev/");
		driver.manage().window().maximize();
	}

	@Then("^User should enter the invalid API request in search box$")
	public void user_should_enter_the_invalid_api_request_in_search_box() {
	    WebElement search= driver.findElement(By.xpath("//input[@id='interactive']"));
	    search.sendKeys("invalid");
	}

	@Then("^Click on the Request button$")
	public void click_on_the_request_button() {
		driver.findElement(By.xpath("//button[contains(text(),'request')]")).click();
	}

	
	
	
	
	
	
	
	
	@Given("^User should launch the chrome browser and enter the URL of Swapi website$")
	public void user_should_launch_the_chrome_browser_and_enter_the_url_of_swapi_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\New Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://swapi.dev/");
		driver.manage().window().maximize();
	}

	@Then("^Enter the correct API URL for the specified Star Wars Character$")
	public void enter_the_correct_api_url_for_the_specified_star_wars_character() {
		WebElement search= driver.findElement(By.xpath("//input[@id='interactive']"));
	    search.sendKeys("people/1/");
	}

	@Then("^Click on Request bttn$")
	public void click_on_request_bttn() {
		driver.findElement(By.xpath("//button[contains(text(),'request')]")).click();
	}

	
	
	
	
	
	
	
	@Given("^User should open the chrome browser and enter the URL of Swapi website$")
	public void user_should_open_the_chrome_browser_and_enter_the_url_of_swapi_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\New Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://swapi.dev/");
		driver.manage().window().maximize();
	}

	@Then("^Enter the invalid API URL for the specified Star Wars Character$")
	public void enter_the_invalid_api_url_for_the_specified_star_wars_character() {
		WebElement search= driver.findElement(By.xpath("//input[@id='interactive']"));
	    search.sendKeys("invalid/1/");
	}

	@Then("^Click on the Request bttn$")
	public void click_on_the_request_bttn() {
		driver.findElement(By.xpath("//button[contains(text(),'request')]")).click();
	}

	
	
	
	
	
	
	@Given("^User should launch the chrome browser and able to enter the Swapi website$")
	public void user_should_launch_the_chrome_browser_and_able_to_enter_the_swapi_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\New Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://swapi.dev/");
		driver.manage().window().maximize();
	}

	@Then("^Enter the valid SWAPI URL to search for the details of a planet$")
	public void enter_the_valid_swapi_url_to_search_for_the_details_of_a_planet() {
		WebElement search= driver.findElement(By.xpath("//input[@id='interactive']"));
	    search.sendKeys("planets/3/");
	}
	
	@Then("^Click the Request bttn$")
	public void click_the_request_bttn() {
		driver.findElement(By.xpath("//button[contains(text(),'request')]")).click();
}
}
	
	
	
	


