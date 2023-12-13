package ScalaExercisePackage

object generatePrime {
  def generatePrimeNo(n: Int): Boolean = {
    if (n <= 1) false
    else if (n <= 2) true
    else {
      var limit = Math.sqrt(n).toInt
      (2 to limit).forall(n % _ != 0)
    }

  }
  def main(args: Array[String]): Unit = {
    println(" please enter the number")
    var num = scala.io.StdIn.readInt()
    println(s" the prime numbers up to $num is :")
    for (i ← 2 to num) {
      if (generatePrimeNo(i)) {
        println(i)
      }
    }

  }

}