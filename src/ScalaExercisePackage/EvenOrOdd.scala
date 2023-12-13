package ScalaExercisePackage

object EvenOrOdd {
  
  def evenOrOdd(num:Int):Boolean={
    if(num%2==0) true else false
  }
  def main(args: Array[String]): Unit = {
    
    println("enter the number")
    var num=scala.io.StdIn.readInt()
    val result=evenOrOdd(num)
    println(result)
   
  }
}