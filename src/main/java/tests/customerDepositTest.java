package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customerDepositTest {

    customerDepositTest customerDepTest;

    @When("^I click Dep button$")
    public void clickDepTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        customerDepTest.clickDepTopBtn();
    }

    @When("^I type Amount as (.*)$")
    public void inputAmountDep(String numberDep) throws InterruptedException {
        Thread.sleep(3000);
        customerDepTest.inputAmountDep(numberDep);
    }

    @When("^I click DepositBottom button$")
    public void clickDepBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        customerDepTest.clickDepBottomBtn();
    }


}
