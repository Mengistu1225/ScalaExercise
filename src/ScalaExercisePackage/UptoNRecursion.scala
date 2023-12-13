package ScalaExercisePackage

object UptoNRecursion {
  def printNumber(n:Int):Unit={
    if(n>=0) {
     println(n+" " )
     printNumber(n-1)
    }
    else 
      println(" the number is not positive number")
  }
  def  main(args: Array[String]): Unit = {
    println("enter the number")
    var num=scala.io.StdIn.readInt()
    println(s"the numbers between 0 and $num is:")
    printNumber(num)
  }
  
}