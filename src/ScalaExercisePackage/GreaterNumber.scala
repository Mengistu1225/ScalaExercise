package ScalaExercisePackage

object GreaterNumber {
  def  main(args: Array[String]): Unit = {
    val num = List(2, 4, 7, 9, 4, 3, 6, 0, 12, 76, 23, 45)
    var max = num(0)
    var maxPosition = 0
    for (i <- 0 until num.length) {
      if (num(i) >= max) {
        max = num(i)
        maxPosition = i
      }
    }
    println(s"The greatest number is $max at position ${maxPosition + 1}")
  
    
  }  
}