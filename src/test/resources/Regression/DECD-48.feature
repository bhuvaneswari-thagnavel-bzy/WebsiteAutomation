@tag
Feature: Document Validation

  Scenario Outline: To validate the document item is visible under Content Type Dropdown.
    Given User should navigate to the "<pagename>" "<url>" "<report>"
    And User should find the Content Type Dropdown
    When User clicks on the Content Type Dropdown
    Then User should see the Document item under the dropdown

    Examples: 
      | pagename                      | url                                                                             | report                               |
      | Searchresult (London)         | https://uat.dxp.beazley.com/en-001/uat3-pages/uat4-sl/search-results/?q=&from=0 | DECD-48 validated Search Result page |
      | Searchresult (United Kingdom) | https://uat.dxp.beazley.com/en-gb/uat3-pages/uat4-sl/search-results/?q=&from=0  | DECD-48 validated Search Result page |
      | Searchresult (USA)            | https://uat.dxp.beazley.com/en-us/uat3-pages/uat4-sl/search-results/?q=&from=0  | DECD-48 validated Search Result page |
      | Searchresult (Switzerland)    | https://uat.dxp.beazley.com/en-ch/uat3-pages/uat4-sl/search-results/?q=&from=0  | DECD-48 validated Search Result page |
      | Searchresult (Asia Pacific)   | https://uat.dxp.beazley.com/en-sg/uat3-pages/uat4-sl/search-results/?q=&from=0  | DECD-48 validated Search Result page |
      | Searchresult (Canada)         | https://uat.dxp.beazley.com/en-ca/uat3-pages/uat4-sl/search-results/?q=&from=0  | DECD-48 validated Search Result page |
