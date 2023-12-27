Feature: ODP_69_View_of_risk_navigation

	#ODP924 AC1,AC2,AC3,AC4,AC5,AC5a,AC6
  @beazley
  Scenario Outline: ODP_69_View_of_risk_navigation
    Given User need to be on "" "ODP_69_View_of_risk_navigation"
    When User validates logged in navigation
    When User validates navigation for standard user
    When User validates navigation for client administrator
    When User validates design
    And User validates VoR primary navigation
    And User validates VoR navigation beazley logo
    
    