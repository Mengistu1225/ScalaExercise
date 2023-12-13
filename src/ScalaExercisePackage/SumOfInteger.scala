package ScalaExercisePackage

object SumOfInteger {
  def  main(args: Array[String]): Unit = {
    println("enter the number")
    var x=scala.io.StdIn.readInt()
    var sum=0
    while(x!=0){
      var digit=x%10
      sum=sum +digit
      x=x/10
    }
    println("the sum of integer is :"+sum)
    
  }
  
}