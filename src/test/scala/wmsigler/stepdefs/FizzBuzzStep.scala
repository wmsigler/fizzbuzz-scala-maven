package wmsigler.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import io.cucumber.datatable.DataTable
import wmsigler.FizzBuzz.fizzbuzz

import scala.collection.JavaConverters._
import collection.mutable.{Buffer => MutableBuffer}

class FizzBuzzStep extends ScalaDsl with EN {
  object DefaultValues extends Enumeration {
    var FizzVal : Value = Value(3)
    val BuzzVal : Value = Value(5)
    val Limit : Value = Value(100)
  }

  private var fizzVal = DefaultValues.FizzVal.id
  private var buzzVal = DefaultValues.BuzzVal.id
  private var limit = DefaultValues.Limit.id
  private var actual = MutableBuffer[String]()

  Given("""no parameters are specified"""){ () =>
    fizzVal = DefaultValues.FizzVal.id
    buzzVal = DefaultValues.BuzzVal.id
    limit = DefaultValues.Limit.id
    actual = MutableBuffer[String]()
  }

  When("""FizzBuzz is calculated""") { () =>
    for (i <- 1 to limit) {
      actual += fizzbuzz(i, fizzVal, buzzVal)
    }
  }

  Then("""the first {int} results should be:""") { (numLines: Int, table: DataTable) =>
    val expected = table.asList.asScala
    assert(expected.equals(actual.take(numLines)))
  }

  Then("""the last {int} results should be:""") { (numLines: Int, table: DataTable) =>
    val first = limit - numLines
    val expected = table.asList.asScala
    assert(expected.equals(actual.slice(first, limit)))
  }
}
