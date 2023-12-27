Feature: Validate "Reputational Risk Wording - UK"

  Scenario Outline: To validate Reputational Risk Wording - UK text not present in Webpage.
    Given User should navigate to "<pagename>" "<url>" "<report>"
    When clicking the Geopgraphy dropdown
    And Select the United Kingdom and click see results
    Then Validate Reputational Risk Wording - UK is not presented in web page

    Examples: 
      | pagename              | url                                                                                        | report                                   |
      | Document Listing Page | https://uat.dxp.beazley.com/en-SG/test-pages/testpage---c-78---documentlistingblock---page | DECD-71 PROD Example documents cannot be deleted |

      
      