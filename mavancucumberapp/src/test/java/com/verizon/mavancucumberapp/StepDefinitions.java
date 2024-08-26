package com.verizon.mavancucumberapp;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
    	Belly belly= new Belly();
    	belly.eat(cukes);
    	
    }

    @When("I wait 1 hour")
    public void allStepDefinitionsAreImplemented() {
    	Belly belly = new Belly();
    	belly.waitStep();
    }

    @Then("my belly should grow")
    public void theScenarioPasses() {
    	Belly belly = new Belly();
    	belly.endProcess();
    }

}
