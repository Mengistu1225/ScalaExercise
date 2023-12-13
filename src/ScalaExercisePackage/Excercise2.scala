package ScalaExercisePackage

object Excercise2 {
  def main(args: Array[String]): Unit = {
    for (i <- 100 to 150) {
      val sumOfDigits = i.toString.map(_.toInt).sum
      if (sumOfDigits % 2 == 0) {
        println(i)
      }
    }

  }

}