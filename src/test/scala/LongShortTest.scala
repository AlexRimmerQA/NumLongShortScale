/**
  * Created by Administrator on 18/07/2017.
  */

import org.scalatest.{FlatSpec, Matchers}

class LongShortTest extends FlatSpec with Matchers {
  val longShort = new LongShort()

  "The parsing of a number < 10^3 to short" should "return the number with short notation" in {
    longShort.parseValue("123", longShort.shortNotation) shouldBe "123"
  }
  "The parsing of a number < 10^6 to short" should "return the number with short notation" in {
    longShort.parseValue("123456", longShort.shortNotation) shouldBe "123 Thousand 456"
  }
  "The parsing of a number < 10^9 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789", longShort.shortNotation) shouldBe "123 Million 456 Thousand 789"
  }
  "The parsing of a number < 10^12 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123", longShort.shortNotation) shouldBe "123 Billion 456 Million 789 Thousand 123"
  }
  "The parsing of a number < 10^15 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456", longShort.shortNotation) shouldBe "123 Trillion 456 Billion 789 Million 123 Thousand 456"
  }
  "The parsing of a number < 10^18 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456789", longShort.shortNotation) shouldBe "123 Quadrillion 456 Trillion 789 Billion 123 Million 456 Thousand 789"
  }
  "The parsing of a number < 10^21 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456789123", longShort.shortNotation) shouldBe "123 Quintillion 456 Quadrillion 789 Trillion 123 Billion 456 Million 789 Thousand 123"
  }
  "The parsing of a number < 10^24 to short" should "return the number with short notation" in {
    longShort.parseValue("123456789123456789123456", longShort.shortNotation) shouldBe "123 Sextillion 456 Quintillion 789 Quadrillion 123 Trillion 456 Billion 789 Million 123 Thousand 456"
  }

  "The parsing of a number < 10^3 to long" should "return the number with long notation" in {
    longShort.parseValue("123", longShort.longNotation) shouldBe "123"
  }
  "The parsing of a number < 10^6 to long" should "return the number with long notation" in {
    longShort.parseValue("123456", longShort.longNotation) shouldBe "123 Thousand 456"
  }
  "The parsing of a number < 10^9 to long" should "return the number with long notation" in {
    longShort.parseValue("123456789", longShort.longNotation) shouldBe "123 Million 456 Thousand 789"
  }
  "The parsing of a number < 10^12 to long" should "return the number with long notation" in {
    longShort.parseValue("123456789123", longShort.longNotation) shouldBe "123 Milliard 456 Million 789 Thousand 123"
  }
  "The parsing of a number < 10^15 to long" should "return the number with long notation" in {
    longShort.parseValue("123456789123456", longShort.longNotation) shouldBe "123 Billion 456 Milliard 789 Million 123 Thousand 456"
  }
  "The parsing of a number < 10^18 to long" should "return the number with long notation" in {
    longShort.parseValue("123456789123456789", longShort.longNotation) shouldBe "123 Billiard 456 Billion 789 Milliard 123 Million 456 Thousand 789"
  }
  "The parsing of a number < 10^21 to long" should "return the number with long notation" in {
    longShort.parseValue("123456789123456789123", longShort.longNotation) shouldBe "123 Trillion 456 Billiard 789 Billion 123 Milliard 456 Million 789 Thousand 123"
  }
  "The parsing of a number < 10^24 to long" should "return the number with long notation" in {
    longShort.parseValue("123456789123456789123456", longShort.longNotation) shouldBe "123 Trilliard 456 Trillion 789 Billiard 123 Billion 456 Milliard 789 Million 123 Thousand 456"
  }
}
