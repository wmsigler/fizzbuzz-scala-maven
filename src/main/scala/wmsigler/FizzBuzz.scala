package wmsigler

import java.io.File

object FizzBuzz {
  private val FIZZ = "Fizz"
  private val BUZZ = "Buzz"
  private val FIZZBUZZ = s"$FIZZ$BUZZ"

  def fizzbuzz(n: Int, fizzVal: Int, buzzVal: Int): String = (n % fizzVal, n % buzzVal) match {
    case(0, 0) => FIZZBUZZ
    case(0, _) => FIZZ
    case(_, 0) => BUZZ
    case _ => n.toString
  }

  def printUsage(): String = {
    val jarName = new File(FizzBuzz.getClass.getProtectionDomain.getCodeSource.getLocation.getPath).getName
    s"""Usage:
       |java -jar $jarName <fizz> <buzz> [limit]
       |e.g. java -jar $jarName 3 5 100
    """.stripMargin
  }

  // TODO: Default to 3, 5 values if no args found
  // TODO: Add parameter checking
  def main(args: Array[String]): Unit = {
    var limit = 100

    if (args.length < 2 || args.length > 3) {
      printUsage()
      System.exit(1)
    } else if (args.length == 3) {
      limit = args(2).toInt
    }

    val fizzVal = args(0).toInt
    val buzzVal = args(1).toInt

    (1 to limit).map(i => fizzbuzz(i, fizzVal, buzzVal)).foreach(println)
  }
}
