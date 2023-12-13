package ScalaExercisePackage

object MultipleOf3 {
  def  main(args: Array[String]): Unit = {
    println(" multiples of three between 10 and 50 ")
    for( i← 10 to 50){
      if(i%3==0){
        println(i)
      }
    }
  }
  
}