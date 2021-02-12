object FunctionalScala {

  def evenOnly(numbers: List[Int]): List[Int] = numbers.filter(x => (x & 1) == 0) // can't use _ precendence requires ()

  def mapToIntegers(numberStrings: List[String]): List[Int] = numberStrings.map(_.toInt)

  def mapToEvenIntegers(numberStrings: List[String]): List[Int] = evenOnly(mapToIntegers(numberStrings))

  def squareOdd(numberStrings: List[String]): List[Int] = mapToIntegers(numberStrings).filter(x => (x & 1) == 1).map(x => x * x)

  def normalizeColor(source: String): String = {
    val src = if(source.startsWith("0x")) source.substring(2) else source
    val src2 = if(src.startsWith("#")) src.substring(1) else src
    return if(src2.size == 8) src2 else src2 + "FF"
  }

  def main(args: Array[String]) = {
  }
}
