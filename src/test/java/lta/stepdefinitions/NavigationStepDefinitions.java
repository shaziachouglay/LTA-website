package lta.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lta.actions.navigations.Navigate;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;

import java.util.List;

public class NavigationStepDefinitions {
    @Steps
    Navigate navigate;
    TitleBanner titleBanner;

    @When("he/she is on the LTA home page")
    public void sheIsOnTheLTAHomePage() {
        navigate.toTheLTAHomePage();
    }

    @Then("he/she should be able to navigate to the foll section through the top level menu")
    public void sheShouldBeAbleToNavigateToTheFollSectionThroughTheTopLevelMenu(List<String> sections) {
        sections.forEach(
                section->{
                    navigate.toTheSection(section);
                    Assertions.assertThat(titleBanner.title()).isEqualTo(section);

                }
        );
    }
}
