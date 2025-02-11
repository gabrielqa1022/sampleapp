package projeto.ui.sampleapp.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		tags = "@test",
		glue = "projeto.ui.sampleapp.steps",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-reports.html"}
		)
public class Executa {

}
