Feature: To validate the Padding spacing

  Scenario Outline: Padding spacing should be verified 
  	Given User should navigates to Generic Block Page "<pagename>" "<url>" "<report>"
    Then Verify the CSS Values
    
    Examples:
    | pagename              |url                                                                                     |   report|      
    | Generic Hero Page     | https://uat.dxp.beazley.com/en-gb/test-pages/testpage---c-05---genericheroblock---page | DECD-25 Reduce Padding Across Components|

