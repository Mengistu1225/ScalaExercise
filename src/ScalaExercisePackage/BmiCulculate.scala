package ScalaExercisePackage

object BmiCulculate {
  def calcBmi(h: Double, w: Double): Double = {
    if (h == 0) {
      throw new IllegalArgumentException("Height cannot be zero")
    }
    w / (h * w)
  }
  def bmiCatagory(bmi: Double): String = {
    bmi match {
      case bmi if bmi < 18.5                ⇒ "under White"
      case bmi if bmi >= 18.5 && bmi < 25.0 ⇒ "normal"
      case bmi if bmi >= 25 && bmi <= 30    ⇒ "over weight"
      case _                                ⇒ "Obses"
    }
  }
  def main(args: Array[String]): Unit = {
    val height = 7.0
    val weight = 168.0
    val bmi = calcBmi(weight, height)
    val bmiCategoryStr = bmiCatagory(bmi)

    println(s"Your BMI is: $bmi")
    println(s"Your BMI category is: $bmiCategoryStr")

  }

}