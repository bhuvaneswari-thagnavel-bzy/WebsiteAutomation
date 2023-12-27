Feature: To validate Title text is visible

  Scenario Outline: Visibility of title text and.
    Given User should navigate to quotecarouselblock Page "<pagename>" "<url>" "<report>"
    Then Verify the page heading
    Then Verify the nextpage

    Examples: 
      | pagename           | url                                                                                                   | report                                      |
      | quotecarouselblock | https://uat.dxp.beazley.com/en-US/test-pages/qa-test-page/testpage---c-43---quotecarouselblock---page | DECD-389  Add Title field to Quote Carousel |
