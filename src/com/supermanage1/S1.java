package com.supermanage1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class S1 {

	@Test
	public static void main(String[] args) throws Exception{

		WebDriver driver = new ChromeDriver();

		String url = "https://dev.business.supermanage.in/auth/mobile-login";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='floatingInput']")).sendKeys("7814434323");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#otp")).sendKeys("111111");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)")).click();
		Thread.sleep(3000); // go to "Employee" section

		driver.findElement(By.cssSelector("div[class='primary-add-div ms-3'] span")).click();// click on the add employee
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("som Banerjee");
		Thread.sleep(3000); // Enter the name

		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("9500427865");
		Thread.sleep(3000); // Enter the mobile number of 10 digit

		WebElement dateBox = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));
		dateBox.sendKeys("05/01/2024");
		Thread.sleep(3000); // Choose the date

		WebElement Designation = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
		Designation.sendKeys("Backend Developer");
		Thread.sleep(3000); // enter the designation

		WebElement emp = driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.hor-content > div.dashboard > div > form > div.employee-page > div:nth-child(2) > div.card-body.p-4 > div.row.g-3.mt-2 > div.col-md._empTypeWrapper_dc3iw_1 > div:nth-child(2) > button"));
		emp.click();
		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("Associate");
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click(); 
		Thread.sleep(3000); // enter the employee type

		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);

		WebElement salary = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));
		salary.sendKeys("23000"); // enter the salary
		Thread.sleep(3000);

		WebElement leave = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
		leave.sendKeys("1"); // enter the leave 
		Thread.sleep(3000);

		WebElement shift = driver.findElement(By.cssSelector("#shifts\\[0\\]\\.shift_name"));
		shift.clear();
		shift.sendKeys("Day Shift");// enter the shift name


		WebElement intime = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
		intime.sendKeys("09:00");// select in-time
		Thread.sleep(4000);

		WebElement outtime = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input:nth-child(1)"));
		outtime.sendKeys("18:00"); // select out-time
		Thread.sleep(4000);
		
		// Finally click on the "Create" button
        WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
        createButton.click();
		Thread.sleep(4000);
		
		// Scroll to top of the page
		jse.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(2000);
		
		// Go to the attendance section
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[1]/div[1]/div/div[1]/div/div/nav/ul/li[3]/div/span[2]/p")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.hor-content > div.dashboard > div > div.dashboard-card.mx-4 > div.custom-data-grid-container.table-div.table-responsive > div > div > div.MuiDataGrid-virtualScroller.css-frlfct > div > div > div:nth-child(1) > div:nth-child(5) > div > div:nth-child(1) > div:nth-child(1)")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.hor-content > div.dashboard > div > div.dashboard-card.mx-4 > div.table-header > div.d-flex.w-100.justify-content-end > button")).click();
		// mark the attendance for Ajay.
		
		// Go to the Overtime section
		try {


            // Click on the Employee tab
            driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.hor-content > div.sidebar-custom-test > div.MuiBox-root.css-1hii8fc > div > div.pro-sidebar-inner > div > div > nav > ul > li.pro-menu-item.active > div > span.pro-item-content > p")).click();
            Thread.sleep(2000);

            // Click on the element to open the search field
            driver.findElement(By.cssSelector("div[class='primary-add-div ms-3'] span")).click();
            Thread.sleep(2000);

            // Wait until the search field is visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > div:nth-child(1) > input:nth-child(2)")));

            // Enter the name to search
            searchField.sendKeys("Argha");

            // Wait for the suggestions to appear
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='table-header'] ul li")));

            // Get the list of suggestions
            List<WebElement> suggestions = driver.findElements(By.cssSelector("div[class='table-header'] ul li"));

            // Loop through the suggestions to find the one you want
            for (WebElement suggestion : suggestions) {
                if (suggestion.getText().equals("Argha")) {
                    suggestion.click();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
        
		driver.close();
	}
}
