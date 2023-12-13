package ScalaExercisePackage

object reverseOfInteger {
  
  def  main(args: Array[String]): Unit = {
    
    println("enter the integer number")
    var num=scala.io.StdIn.readInt()
    var rev=0
    while(num !=0){
      var digit=num%10
       rev=(rev*10)+digit
       num=num/10
    }
    println("the reverse of the number is : "+rev)
  }
}