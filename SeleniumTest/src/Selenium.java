import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Memilih website yang akan dilakukan testing
		driver.get("https://www.w3schools.com/");
		
		//Melakukan perintah klik pada navbar tutorial
		WebElement tutorial=driver.findElement(By.id("navbtn_tutorials"));
		tutorial.click();
		
		//Melakukan pemilihan tutorial Javascript
		Thread.sleep(1000);
		WebElement navJS=driver.findElement(By.cssSelector("[href='/js/default.asp\']"));
		navJS.click();
		
		//Melakukan test button "start learning JS now"
		Thread.sleep(1000);
		WebElement startJS=driver.findElement(By.cssSelector("[href='js_intro.asp']"));
		startJS.click();
		
		//Melakukan test button "try it yourself"
		Thread.sleep(1000);
		WebElement tryJS=driver.findElement(By.cssSelector("[href='tryit.asp?filename=tryjs_intro_inner_html']"));
		tryJS.click();
		
		//Melakukan testing pada tab baru
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
		//Testing kembali pada homepage w3school"
		Thread.sleep(1000);
		WebElement clickMe=driver.findElement(By.cssSelector("[href='https://www.w3schools.com']"));
		clickMe.click();
		
	}

}