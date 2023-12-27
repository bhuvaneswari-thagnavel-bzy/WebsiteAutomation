
Feature: VOR Risk Score Comparision
  I want to validate risk score in dashboard


Scenario Outline: Dashboard RiskScore Comparision
     When User	viewing Dashboard and Risk score band "<pagename>" "<url>" "<report>"    
     #And Validate RiskScore API
     Then Validate DashboardUI

    Examples: 
      | pagename    |url              			 															 |   report|      
      | Dashboard   |https://qa.dxp.beazley.com/en-US/vor/dashboard				 | ODP-91 AC-1 To 8 Validated Risk Score Comparision|  
