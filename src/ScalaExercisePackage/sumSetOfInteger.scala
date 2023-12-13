package ScalaExercisePackage

object sumSetOfInteger {
   def main(args: Array[String]): Unit = {
     println("enter cout of numbers")
     var count=scala.io.StdIn.readInt()
     var sum=0
     var prod=1
     for(i ←0 to count){
       var num=scala.io.StdIn.readInt()
       sum +=num
       prod *=num
     }
     println("the sum is: "+sum)
     var avarage :Double =(sum/count).toDouble
     println("the avarage is : "+avarage)
     println("the product is :"+prod)
     
    
  }
  
}