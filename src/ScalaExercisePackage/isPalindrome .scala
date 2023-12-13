package ScalaExercisePackage

object isPalindrome  {
  //method 1
  def isPalindorme1(str:String):Boolean={
     val reversed=str.reverse
     str.equalsIgnoreCase(reversed)
  }
  //mothod 2
  def isPalindorme(text:String):Boolean={
    if(text.isEmpty) return true
    var left=0
    var right=text.length -1
    while(left < right){
      if(text(left).toLower !=text(right).toLower){
       return false
      }
      left += 1
      right -= 1
    }
    true
  }
  def  main(args: Array[String]): Unit = {
    println(" enter the the text to check")
    val text=scala.io.StdIn.readLine()
    
    println(" is  palindorm : "+isPalindorme(text))
    println(" is palindorm : "+isPalindorme1(text))
   
    
  }
  
}