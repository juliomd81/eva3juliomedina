package StepDefinitio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {	
	
	WebDriver driver;
	
@Given("Abrir Chrome")
public void abrir_Chrome() {
	//White code here that turns the phrase above into concrete actions
	System.out.println("En este paso abre el navegador google chrome");
	System.setProperty("webdriver.chrome.driver", "c:\\Users\\Iplacex-pc\\Dowloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ced.iplacex/login/index.php");
}

@When("ingresa Username {string} y Password {string}")
public void ingresa_Username_y_Password(String string, String string2){
	//White code here that turns the phrase above into concrete actions
	System.out.println("En este paso ingresa las credenciales de usuario");
	System.out.println("Este paso ingresa el nombre de usuario y contraseña en la pagina de login");
	driver.findElement(By.id("username")).sendKeys(String);
	driver.findElement(By.id("password")).sendKeys(String);
}

@Then("iniciar sesion")
public void iniciar_sesion() {
	//White code here that turns the phrase above into concrete actions
	System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo Mytest.feature");
	driver.findElement(By.id("loginbtn")).click();	
}

}