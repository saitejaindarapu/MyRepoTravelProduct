Feature: Quote Creation and Policy Issuance

Scenario Outline: Creation of Quote and Issue Policy with different set of data
Given User navigates to dijta login page
When User fills the required field values from given sheetname "<SheetName>" and rownumber <RowNumber>
And User clicks on Download Quote button and Process Payment button
Then Status changes to Issued

Examples:
|SheetName|RowNumber|
|QuoteData|0|
	