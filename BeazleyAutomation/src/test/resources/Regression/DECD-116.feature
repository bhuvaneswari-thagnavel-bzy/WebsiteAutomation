Feature: To validate the rich text

  Scenario Outline: validating the bild text is visible.
    Given User should navigate to infoboxblock Page "<pagename>" "<url>" "<report>"
    Then Verify the rich text

    Examples: 
      | pagename     | url                                                                                             | report                                 |
      | infoboxblock | https://uat.dxp.beazley.com/en-US/test-pages/qa-test-page/testpage---c-39---infoboxblock---page | DECD-116  C39 - Info Box - Improvement |
