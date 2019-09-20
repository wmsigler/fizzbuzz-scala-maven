package wmsigler.stepdefs

import cucumber.api.PendingException
import cucumber.api.scala.{EN, ScalaDsl}
import io.cucumber.datatable.DataTable

class FizzBuzzStep extends ScalaDsl with EN {
  Given("""no parameters are specified"""){ () =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  When("""FizzBuzz is calculated""") { () =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""the first {int} results should be:""") { (numLines: Int, table: DataTable) =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""the last {int} results should be:""") { (numLines: Int, table: DataTable) =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }
}
