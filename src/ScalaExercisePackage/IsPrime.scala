package ScalaExercisePackage

object IsPrime {
  def isPrime(n:Int):Boolean={
    if(n<=1) false
    else if (n<=2) true
    else {
      val limit=math.sqrt(n).toInt
      (2 to limit).forall(n%_!=0)
    }
    
  }
  def  main(args: Array[String]): Unit = {
    println(" enter the number ")
    var num=scala.io.StdIn.readInt()
    if(isPrime(num)){
      println(s" $num is prime number")
    }else{
      println(s" $num is not prime number")
    }
    
  }
}