Feature: ODP_90_Risk_score_indicator

	#ODP654 AC1,AC2,AC5,AC6,AC6a,AC7
  @beazley
  Scenario Outline: ODP_90_Risk_score_indicator
    Given User need to be on "" "ODP_90_Risk_score_indicator"
    When User checks the status
    When User checks there are totally 5 bands and can click on it
    When User click on each band and validates the window popup presence
    And User checks the colors in popup window of each band and validates the presence of description in popup
    
    
