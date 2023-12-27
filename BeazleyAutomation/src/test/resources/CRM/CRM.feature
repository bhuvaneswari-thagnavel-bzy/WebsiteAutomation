@tag
Feature: Validate CRM Feature
    
	Scenario Outline: CRM create contacts validation
		When User Logs in to application "<pagename>" "<url>" "<report>"
		And Provide Beazley Login
		When User Lands on CRM Home page
		Then Create New Contact For Existing Organization
		
		Examples: 
      | pagename              |url                                                                                                       |   report|      
      | CRM | https://org4f8b62b6.crm11.dynamics.com.mcas.ms/main.aspx?appid=c5aed797-0b30-eb11-a813-0022481b0419&pagetype=dashboard&type=system&_canOverride=true | validate CRM |  
	
#Scenario Outline: CRM create digital account
#		When User Logs in to application "<pagename>" "<url>" "<report>"
#		And Provide Beazley Login
#		When User Lands on CRM Home page
#		Then Add New DXP Digital Account
#		
#		Examples: 
      #| pagename              |url                                                                                                       |   report|      
      #| CRM | https://org4f8b62b6.crm11.dynamics.com.mcas.ms/main.aspx?appid=c5aed797-0b30-eb11-a813-0022481b0419&pagetype=dashboard&type=system&_canOverride=true | validate CRM |  
#	
#	
	
#	Scenario Outline: CRM Add New DXP Application
#		When User Logs in to application "<pagename>" "<url>" "<report>"
#		And Provide Beazley Login
#		When User Lands on CRM Home page
#		Then Add Add New DXP Application
#		And Add Application Permission
#		
#		Examples: 
      #| pagename              |url                                                                                                       |   report|      
      #| CRM | https://org4f8b62b6.crm11.dynamics.com.mcas.ms/main.aspx?appid=c5aed797-0b30-eb11-a813-0022481b0419&pagetype=dashboard&type=system&_canOverride=true | validate CRM |  
#	