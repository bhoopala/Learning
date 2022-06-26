$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/homeloancalculator.feature");
formatter.feature({
  "name": "Home loan Calculator",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking the loan calculator working properly using valid inputs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on home page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_lands_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs data to check the functionality of the calculator",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_inputs_data_to_check_the_functionality_of_the_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Reset the given input by clicking start Over button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on home page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_lands_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click start Over button on submitting",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.click_start_over_button_on_submitting()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating the error message on giving incomplete data as input",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on home page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_lands_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs incomplete data and check the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitionFile.user_inputs_incomplete_data_and_check_the_error_message()"
});
formatter.result({
  "status": "passed"
});
});