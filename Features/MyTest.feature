Feature: Realizacion de caso ongresando nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion
Given Abrir Chrome
When ingresa Username "user" y Password "user"
then iniciar sesion


You can implement missing steps with the snippets below:
	 
@Given("Abrir Chrome")
public void abrir_Chrome() {
	//White code here that turns the phrase above into concrete actions
	throw new cucumber.api.PendingException();
}

@When("ingresa Username {string} y Password {string}")
public void ingresa_Username_y_Password(String string, String string2){
	//White code here that turns the phrase above into concrete actions
	throw new cucumber.api.PendingException();
}

@Then("iniciar sesion")
public void iniciar_sesion() {
	//White code here that turns the phrase above into concrete actions
	throw new cucumber.api.PendingException();
}