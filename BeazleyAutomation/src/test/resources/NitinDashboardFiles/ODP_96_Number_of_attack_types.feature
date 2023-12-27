Feature: ODP_96_Number_of_attack_types

	#ODP660 AC1,AC1a,AC2
  @beazley
  Scenario Outline: ODP_96_Number_of_attack_types
    Given User need to be on "" "ODP_96_Number_of_attack_types"
    When User checks title and count of risk attack cyber types
    #And User can see all cyber attack CTA and navigate to other page on click