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
//  def main(args: Array[String]) {
//    val index = readLine().split(" ")
//    val str = readLine()
//
//    val result = str.substring(0, index.head.toInt) +
//      str.substring(index.head.toInt, index.last.toInt + 1).reverse + str.substring(index.last.toInt + 1)
//
//    println(result)
//  }


  /**
    * Ваша задача - определить, является ли переданная строка input записанной в snake-case стиле.
    *
    *  Требовая snake-case к строке:
    *
    * Должна содержать только строчные латинские буквы и символ подчёркивания
    * Символ подчёркивания не должен стоять в начале и в конце строки
    * Два символа подчёркивания не могут стоять рядом
    *  Считайте из стандартного потока ввода строку и напечатайте true, если она удовлетворяет требованиям выше, false ﻿иначе.
    */
    def main(args: Array[String]) {
      val pattern = "\\b[a-z]+(_[a-z]+)*\\b"
      val str = readLine()

      println(str.matches(pattern))
    }
}
