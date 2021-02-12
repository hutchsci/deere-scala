import org.scalatest.{FunSpec, Matchers}

class FunctionalScalaTest extends FunSpec with Matchers {

  it("a_shouldReturnEvenNumbers") {
    val numbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evenIntegers = FunctionalScala.evenOnly(numbers)
    print(evenIntegers)
    val expectedInts = List(0, 2, 4, 6, 8)
    expectedInts shouldBe evenIntegers
  }

  it("shouldFailTest") {
    true shouldBe false
  }
}
