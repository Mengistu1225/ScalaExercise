package ScalaExercisePackage

object AreaAndPermTriangle {
  def permOfTriangle(side1:Double,side2:Double,side3:Double):Double={
    var perm=(side1+side2+side3)/2.0
    perm
  }
  def areaOfTriangel(a:Double,b:Double,c:Double):Double={
		  var s=permOfTriangle(a, b, c)
      var area=Math.sqrt(s*(s-a)*(s-b)*(s-c))
      area
      }
  
  def  main(args: Array[String]): Unit = {
    println("please enter side1: ")
    var side1=scala.io.StdIn.readDouble()
    println("please enter side2: ")
    var side2=scala.io.StdIn.readDouble()
    println("please enter side3: ")
    var side3=scala.io.StdIn.readDouble()
    var perm=permOfTriangle(side1, side2, side3)
    println("perimererof the triangle is: "+perm)
    var area=areaOfTriangel(side1, side2, side3)
    println("the area of triangle is :"+area)
    
  }
}