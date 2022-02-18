package StepDefs;

import Framework.ReportsManager;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
		
	
	@Before
	public void newScenario(Scenario scenario) {
		ReportsManager.startNewTest(scenario.getName());
	}
	@After
	public void endScenario(Scenario  scenario) {
		ReportsManager.endTest();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
