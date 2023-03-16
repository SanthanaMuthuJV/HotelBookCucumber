$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/facebookExcel.feature");
formatter.feature({
  "name": "To check login Functionality of fb appln",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check invalid user and password in filed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@cell"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to load the fb url",
  "keyword": "When "
});
formatter.match({
  "location": "FbExcelSheet.userHasToLoadTheFbUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the username in email filed by using excelsheeet",
  "keyword": "And "
});
formatter.match({
  "location": "FbExcelSheet.userHasToPassTheUsernameInEmailFiledByUsingExcelsheeet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the passsword in pass filed by using excelsheet",
  "keyword": "When "
});
formatter.match({
  "location": "FbExcelSheet.userHasToPassThePassswordInPassFiledByUsingExcelsheet()"
});
formatter.result({
  "error_message": "java.lang.AssertionError:  verify the password \r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.stepdefinition.FbExcelSheet.userHasToPassThePassswordInPassFiledByUsingExcelsheet(FbExcelSheet.java:32)\r\n\tat ✽.user has to pass the passsword in pass filed by using excelsheet(src/test/resources/feature/facebookExcel.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to click the login button in submit filed",
  "keyword": "When "
});
formatter.match({
  "location": "FbExcelSheet.userHasToClickTheLoginButtonInSubmitFiled()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});