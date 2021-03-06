package Runner;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Framework.ReportsManager;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

/**
 * Unit test for simple App.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"StepDefs"}
		)
public class AppTest 
{
	@BeforeClass
	public static void startUp() throws FileNotFoundException, IOException {
		ReportsManager.getInstance();
	}
	@AfterClass
	public static void rtearDown() {

	}
}
