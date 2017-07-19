/**
  * Created by Alex Rimmer on 18/07/2017.
  */

class ShortTest extends BaseTest {
  longShort.printShort("123456789123456789123456")

  "The parsing of a number < 10^3 to short" should "return the number with short notation" in {
    longShort.parseValue("123", longShort.shortNotation) shouldBe
      "123"
  }
  "The parsing of a number < 10^6 to short" should "return the number with short notation" in {
    longShort.parseValue("123456", longShort.shortNotation) shouldBe
      "123 Thousand 456"
  }
  "The parsing of a number < 10^9 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789", longShort.shortNotation) shouldBe
      "123 Million 456 Thousand 789"
  }
  "The parsing of a number < 10^12 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123", longShort.shortNotation) shouldBe
      "123 Billion 456 Million 789 Thousand 123"
  }
  "The parsing of a number < 10^15 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456", longShort.shortNotation) shouldBe
      "123 Trillion 456 Billion 789 Million 123 Thousand 456"
  }
  "The parsing of a number < 10^18 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456789", longShort.shortNotation) shouldBe
      "123 Quadrillion 456 Trillion 789 Billion 123 Million 456 Thousand 789"
  }
  "The parsing of a number < 10^21 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456789123", longShort.shortNotation) shouldBe
      "123 Quintillion 456 Quadrillion 789 Trillion 123 Billion 456 Million 789 Thousand 123"
  }
  "The parsing of a number < 10^24 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456789123456", longShort.shortNotation) shouldBe
      "123 Sextillion 456 Quintillion 789 Quadrillion 123 Trillion 456 Billion 789 Million 123 Thousand 456"
  }
}