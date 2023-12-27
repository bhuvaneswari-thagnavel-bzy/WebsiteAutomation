Feature: To validate the form

  Scenario Outline: Validation of each mandatory fields in a form
    Given User should navigate to optiforms Page "<pagename>" "<url>" "<report>"
    Then fill the mandatory fields.
    And click the Submit button.
    Then verify whether the form is successfully submitted.
    
  Examples: 
      | pagename  | url                                                               | report                                                                       |
      | optiforms | https://uat.dxp.beazley.com/en-US/test-pages/sprint-5/opti-forms/ | DECD-37  Investigate implementation of Opti forms OOTB + proceed if possible |
    
	Scenario Outline: Validation of errors in mandatory fields in a form
    Given User should navigate to optiforms Page1 "<pagename>" "<url>" "<report>"
    Then Click on submit button
    Then Verify the mandatory errors

    Examples: 
      | pagename  | url                                                               | report                                                                       |
      | optiforms | https://uat.dxp.beazley.com/en-US/test-pages/sprint-5/opti-forms/ | DECD-37  Investigate implementation of Opti forms OOTB + proceed if possible |
    