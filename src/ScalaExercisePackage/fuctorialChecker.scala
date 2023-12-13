package ScalaExercisePackage

object fuctorialChecker {
  def fuctorial(n:Int):Int={
    if(n==0) 
      1
    else
     
      n*fuctorial(n-1)
    
      
  }
  def  main(args: Array[String]): Unit = {
    println("enter the number")
    var num=scala.io.StdIn.readInt()
    println(s"fucntorial of $num is : "+fuctorial(num))
  }
}