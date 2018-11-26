Feature:Test Scenario

Scenario: Test Login with the valid credentials
Given I am on Login page
When i enter username and password
And i click submit button
Then i should be shown inbox page
