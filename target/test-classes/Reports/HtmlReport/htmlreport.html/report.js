$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/loginWithDataTable.feature");
formatter.feature({
  "name": "TO validate the login by using Data Table",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The User should launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsLoginWithDataTable.the_User_should_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TO validate the application - With Header 1D",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User clicks on the sign-in button",
  "keyword": "When "
});
formatter.match({
  "location": "StepsLoginWithDataTable.user_clicks_on_the_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Sign-in again",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLoginWithDataTable.user_clicks_on_the_Sign_in_again()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username and password by using withHeader oneD",
  "rows": [
    {
      "cells": [
        "username",
        "sasi"
      ]
    },
    {
      "cells": [
        "password",
        "sasi1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepsLoginWithDataTable.user_enters_the_username_and_password_by_using_withHeader_oneD(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button in sign-account page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLoginWithDataTable.user_clicks_on_login_button_in_sign_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get into the application \"using withHeader oneD\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsLoginWithDataTable.user_get_into_the_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});