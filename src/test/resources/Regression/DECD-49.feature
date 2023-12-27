@tag
Feature: Validate the Feature
    
	Scenario Outline: Germany and Switzerland not showing in Geography drop downs
		When User Logs in to application "<pagename>" "<url>" "<report>"
		And Select geography dropdown
		
		Examples: 
      | pagename              |url                                                                                                       |   report|      
      | Documentlistingblock | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-78---documentlistingblock---page | DECD-49 validated Document listing Block-Geography Dropdown|  
	
