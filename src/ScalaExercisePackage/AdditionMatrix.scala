package ScalaExercisePackage

object AdditionMatrix {
  def addMatrix(matrix1: Array[Array[Int]], matrix2: Array[Array[Int]]): Array[Int] = {
    val numRows = matrix1.length
    val numCols = matrix1(0).length

    val result = new Array[Array[Int]](numRows)
    for (i <- 0 until numRows) {
      result(i) = new Array[Int](numCols)
    }

    for (i <- 0 until numRows) {
      for (j <- 0 until numCols) {
        result(i)(j) = matrix1(i)(j) + matrix2(i)(j)
      }
    }
    result

  }

  def main(args: Array[String]): Unit = {
    val matrix1 = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    val matrix2 = Array(Array(9, 8, 7), Array(6, 5, 4), Array(3, 2, 1))
    val result = addMatrix(matrix1, matrix2)

    for (row <- result) {
      for (ele <- row) {
        print(ele + " ")
      }
      println()
    }
  }
}
