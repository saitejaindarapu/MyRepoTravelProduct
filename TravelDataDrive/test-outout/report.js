$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Travel.feature");
formatter.feature({
  "line": 1,
  "name": "Quote Creation and Policy Issuance",
  "description": "",
  "id": "quote-creation-and-policy-issuance",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Creation of Quote and Issue Policy with different set of data",
  "description": "",
  "id": "quote-creation-and-policy-issuance;creation-of-quote-and-issue-policy-with-different-set-of-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to dijta login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User fills the required field values from given sheetname \"\u003cSheetName\u003e\" and rownumber \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Download Quote button and Process Payment button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Status changes to Issued",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "quote-creation-and-policy-issuance;creation-of-quote-and-issue-policy-with-different-set-of-data;",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ],
      "line": 10,
      "id": "quote-creation-and-policy-issuance;creation-of-quote-and-issue-policy-with-different-set-of-data;;1"
    },
    {
      "cells": [
        "QuoteData",
        "0"
      ],
      "line": 11,
      "id": "quote-creation-and-policy-issuance;creation-of-quote-and-issue-policy-with-different-set-of-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Creation of Quote and Issue Policy with different set of data",
  "description": "",
  "id": "quote-creation-and-policy-issuance;creation-of-quote-and-issue-policy-with-different-set-of-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to dijta login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User fills the required field values from given sheetname \"QuoteData\" and rownumber 0",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Download Quote button and Process Payment button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Status changes to Issued",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});