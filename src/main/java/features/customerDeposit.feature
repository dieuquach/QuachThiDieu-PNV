Feature: Customer login

  Scenario Outline: Customer deposit done
    Given I opent website http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I click Dep button
    When I type Amount as <numberDep>
    When I click DepositBottom button
    Then I verify Deposit Successful

    Examples:
    |numberDep|
    |2000|