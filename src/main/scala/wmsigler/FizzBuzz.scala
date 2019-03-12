package wmsigler

object FizzBuzz {
  private def compute(fizz: Int, buzz: Int): Unit = {
    //TODO: Replace stub
    println(s"Fizz: $fizz")
    println(s"Buzz: $buzz")
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      println("Wrong number of arguments. Please specify Fizz and Buzz values.")
      System.exit(1)
    }

    // TODO: Add parameter checking
    val fizz = args(0).toInt
    val buzz = args(1).toInt
    compute(fizz, buzz)
  }
}
