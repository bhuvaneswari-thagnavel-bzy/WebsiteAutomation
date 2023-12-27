
Feature: DECD-49 Geography Dropdown listing validation
  I want to valdiate production bug for geography dropdown no of items and content
  
 Scenario Outline: validate DECD-49 Geography Dropdown Listing

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And  Validate Geography Dropdown Items
    Examples: 
      | pagename              |url                                                       |   report|      
      | DocumentListingBlockPage | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-78---documentlistingblock---page  | DECD-49 - validated Geography Dropdown listing|    

      
  
 Scenario Outline: validate DECD-25 educe Padding Across Components

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And  Validate Reduce Padding Across Components
    Examples: 
      | pagename              |url                                                       |   report|      
      | Generic Hero Block Page | https://uat.dxp.beazley.com/en-sg/test-pages/testpage---c-05---genericheroblock---page  | DECD-25 - validated Padding Across Components |    
      