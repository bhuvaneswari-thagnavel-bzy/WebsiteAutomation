package org.testRunner;

public class ScenarioDetails {
	
	boolean status;
    String faiureMessage;
    public ScenarioDetails(boolean status,
                           String faiureMessage)
    {
        this.status = status;
        this.faiureMessage = faiureMessage;
    }

}
