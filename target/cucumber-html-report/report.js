$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("patientMedicalForm/PatientMedicalForm.feature");
formatter.feature({
  "line": 2,
  "name": "PatientMedicalForm - JOTFORM",
  "description": "ETQ user je souhaite m\u0027authentifier",
  "id": "patientmedicalform---jotform",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PatientMedicalForm"
    }
  ]
});
formatter.before({
  "duration": 7752871800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "PatientMedicalForm - JOTFORM",
  "description": "",
  "id": "patientmedicalform---jotform;patientmedicalform---jotform",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@auth"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open applicationform",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "set firstname",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "set lastname",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click login submit",
  "keyword": "And "
});
formatter.match({
  "location": "PatientMedicalFormStepDef.openApplication()"
});
formatter.result({
  "duration": 4160873900,
  "status": "passed"
});
formatter.match({
  "location": "PatientMedicalFormStepDef.setUsername()"
});
formatter.result({
  "duration": 185895100,
  "status": "passed"
});
formatter.match({
  "location": "PatientMedicalFormStepDef.setPassword()"
});
formatter.result({
  "duration": 122438300,
  "status": "passed"
});
formatter.match({
  "location": "PatientMedicalFormStepDef.clickLoginButton()"
});
formatter.result({
  "duration": 721012000,
  "status": "passed"
});
formatter.after({
  "duration": 1686924500,
  "status": "passed"
});
});