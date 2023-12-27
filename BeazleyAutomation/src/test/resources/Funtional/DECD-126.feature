Feature: To validate the  personalactionplan quiz form

  Scenario Outline: Valiation of personalactionplanquizblock page
    Given User should navigate to personalactionplanquizblock Page "<pagename>" "<url>" "<report>"
    Then Fill the requied fields in the quiz
    And Click on the quiz submit button.
    Then verify whether the text doesnt leak from the container.
    Then click on retake button is functional

    Examples: 
      | pagename                    | url                                                                                       | report                                                                    |
      | personalactionplanquizblock | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-83---personalactionplanquizblock---page | DECD-126  Quiz output to be generated for ESG/ alternative business lines |

      
  #Scenario Outline: Valiation of personalactionplanquizblock page
    #Given User should navigate to personalactionplanquizblock Page "<pagename>" "<url>" "<report>"
    #Then Fill the requied fields in the quiz page
    #And Click on the quiz submit button.
    #Then verify whether the text doesnt leaked from the container.
#
    #Examples: 
      #| pagename                    | url                                                                                       | report                                                                    |
      #| personalactionplanquizblock | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-83---personalactionplanquizblock---page | DECD-126  Quiz output to be generated for ESG/ alternative business lines |
  