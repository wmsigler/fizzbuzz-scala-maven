package wmsigler

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:wmsigler"),
  glue = Array("wmsigler.stepdefs")
)
class FizzBuzzRunnerTest
