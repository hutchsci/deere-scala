import org.scalatest.{FunSpec, Matchers}

class FunctionalScalaTest extends FunSpec with Matchers {

  it("a_shouldReturnEvenNumbers") {
    val numbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evenIntegers = FunctionalScala.evenOnly(numbers)
    val expectedInts = List(0, 2, 4, 6, 8)
    expectedInts shouldBe evenIntegers
  }

  it("b_shouldMapStringsToIntegers") {
    val numberStrings = List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val numberInts = FunctionalScala.mapToIntegers(numberStrings)
    val expectedInts = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    expectedInts shouldBe numberInts
  }

  it("c_shouldMapStringsToEvenIntegers") {
    val numberStrings = List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val evenIntegers = FunctionalScala.mapToEvenIntegers(numberStrings)
    val expectedInts = List(0, 2, 4, 6, 8)
    expectedInts shouldBe evenIntegers
  }

  it("d_shouldReturnSquaresOfOddIntegers") {
    val numberStrings = List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val squares = FunctionalScala.squareOdd(numberStrings)
    val expectedInts = List(1, 9, 25, 49, 81)
    expectedInts shouldBe squares
  }

  it("e_shouldNormalizeStrings") {
    "1199AAFF" shouldBe FunctionalScala.normalizeColor("1199AAFF")
    "1199AAFF" shouldBe FunctionalScala.normalizeColor("0x1199AAFF")
    "1199AAFF" shouldBe FunctionalScala.normalizeColor("#1199AAFF")
    "1199AAFF" shouldBe FunctionalScala.normalizeColor("0x1199AA")
    "1199AAFF" shouldBe FunctionalScala.normalizeColor("#1199AA")
    "1199AAFF" shouldBe FunctionalScala.normalizeColor("1199AA")
  }
}

