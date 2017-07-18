
/**
  * Created by Alex Rimmer on 18/07/2017.
  */

class LongShort {
  val shortNotation = List("", " Thousand ", " Million ", " Billion ", " Trillion ", " Quadrillion ", " Quintillion ", " Sextillion ")
  val longNotation = List("", " Thousand ", " Million ", " Milliard ", " Billion ", " Billiard ", " Trillion ", " Trilliard ")

  def parseValue(number: String, notation: List[String]): String = {
    val stage = 0

    def iter(number: String, stage: Int): String = {
      val rightNumbers = number.takeRight(3) + notation(stage)
      if (number.length > 3) {
        iter(number.dropRight(3), stage + 1) + rightNumbers
      }
      else {
        rightNumbers
      }
    }
    iter(number, stage)
  }

  def print(number : String): Unit = {
    Console.println("Short scale: " + parseValue(number, shortNotation))
    Console.println("Long scale: " + parseValue(number, longNotation))
  }
}
