package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
}

public class StepDefs {
    private String today;
    private String actualAnswer;

    private Hello hello;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @Given("I have set up my environment")
    public void i_have_set_up_my_environment() {
        // Write code here that turns the phrase above into concrete actions
        hello = new Hello();
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @When("I say hello")
    public void i_say_hello() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = hello.sayHi();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Then("I hear {string}")
    public void i_hear(String message) {
        Assertions.assertEquals(actualAnswer, message);
    }
}
