package ScalaExercisePackage

object CircuAndAreaOfCircle {
  val  pi=3.214
  def circuCircle(r:Int):Double={
    var circuCircle=2*pi*r
    circuCircle
  }
  def areaCircle(r:Int):Double={
    var areaCircle=pi*r*r
    areaCircle
  }
  def  main(args: Array[String]): Unit = {
    println("enter the rudias of the circle")
    var radius=scala.io.StdIn.readInt()
    var circumstance=circuCircle(radius)
    println("the circumstance of the cercle is: "+circumstance)
    var area=areaCircle(radius)
    println("the area of the circle is :"+area)
  }
  
}