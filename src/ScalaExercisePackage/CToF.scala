package ScalaExercisePackage

object CToF {
  def cTof(t:Double):Double={
    
    var f=9*t/5 +32
    f
  }
  def  main(args: Array[String]): Unit = {
    println("enter the tempreture")
    var temp=scala.io.StdIn.readDouble()
    var result=cTof(temp)
    print(s" the tempreture in faranhit is: $result")
  }
}