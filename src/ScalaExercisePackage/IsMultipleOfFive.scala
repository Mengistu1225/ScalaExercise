package ScalaExercisePackage

object IsMultipleOfFive {
  def isMultiFiveAndSeven(num:Int):Boolean={
    if(num %5==0 && num %7 ==0) true else false
  }
  
  def  main(args: Array[String]): Unit = {
    println("enter the number")
    var num=scala.io.StdIn.readInt()
    /*if(num %5 ==0)
      println(s"$num is multiple of five")
    else
      println(s"$num is not multiple of five")
*/  
    var result=isMultiFiveAndSeven(num)
    println(result)
  }
}