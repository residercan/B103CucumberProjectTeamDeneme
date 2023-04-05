package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TechProStepDefinition {
    @Given("techpro sayfasina gidilir")
    public void techproSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @When("sayfa basligi yazdirilir")
    public void sayfaBasligiYazdirilir() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }

    @Then("sayfa basliginda Bootcamp yazisi oldugu test edilir")
    public void sayfaBasligindaBootcampYazisiOlduguTestEdilir() {
        assertTrue(Driver.getDriver().getTitle().contains("Bootcamp"));
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}
