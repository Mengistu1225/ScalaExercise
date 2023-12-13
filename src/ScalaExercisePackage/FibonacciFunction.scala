package ScalaExercisePackage

object FibonacciFunction {
  def fibonacci(n: Int): BigInt = {
    if (n <= 1) return n
    else n + fibonacci(n-1) 
  }
  def main(args: Array[String]): Unit = {
    val n = 10
    val result = fibonacci(n)
    println(s"The $n th Fibonacci number is $result")

  }

}