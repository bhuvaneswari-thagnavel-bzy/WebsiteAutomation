Feature: To validate the rich text is visible

  Scenario Outline: validate rich text
    Given User should navigate to contentcardsblock Page "<pagename>" "<url>" "<report>"
    Then verify the rich text in contentcardsblock

    Examples: 
      | pagename          | url                                                                                                  | report                                              |
      | contentcardsblock | https://uat.dxp.beazley.com/en-US/test-pages/qa-test-page/testpage---c-22---contentcardsblock---page | DECD-44  Allow for rich text input on Content Cards |
