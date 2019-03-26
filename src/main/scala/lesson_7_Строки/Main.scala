package lesson_7_Строки

import scala.io.StdIn._

/**
  * "Hello " + "world!" - сложение
  * s"Hello $name!" - интерполяция строк
  * """|hello
  *    |world
  * """.stripMargin - переносы строк
  */
object Main {


  /**
    * Cчитайте из консоли два числа: startIndex и endIndex. Считайте строку str.
    * Напечатайте в ответ входную строку, обратив порядок символов от startIndex до endIndex ﻿включительно.
    */
  def main(args: Array[String]) {
    val index = readLine().split(" ")
    val str = readLine()

    val result = str.substring(0, index.head.toInt) +
      str.substring(index.head.toInt, index.last.toInt + 1).reverse + str.substring(index.last.toInt + 1)

    println(result)
  }


}
