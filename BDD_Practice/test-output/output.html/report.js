$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/LogIn_Test.feature");
formatter.feature({
  "name": "Login Action",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Username",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_Enters_Username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_Enter_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
});