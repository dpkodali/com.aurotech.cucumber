$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SimpleWebApp.feature");
formatter.feature({
  "line": 3,
  "name": "Test SimpleWebApp smoke scenario",
  "description": "",
  "id": "test-simplewebapp-smoke-scenario",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7917285333,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Title of your scenario",
  "description": "",
  "id": "test-simplewebapp-smoke-scenario;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Launch Firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.launch_Firefox_and_start_application()"
});
formatter.result({
  "duration": 556565333,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 238781128,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 982747487,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.application_should_be_closed()"
});
formatter.result({
  "duration": 925021127,
  "status": "passed"
});
});