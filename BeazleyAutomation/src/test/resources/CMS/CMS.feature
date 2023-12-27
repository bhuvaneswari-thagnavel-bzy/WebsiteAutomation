@tag
Feature: Validate CMS Feature
    
	Scenario Outline: CMS Navigation and validation
		When CMS Application Login "<pagename>" "<url>" "<report>"
		And Navigate to respective pages
		
		Examples: 
      | pagename              |url                      |   report|      
      | CMS | https://qa.dxp.beazley.com/EPiServer/CMS/ | validate CMS |  
	