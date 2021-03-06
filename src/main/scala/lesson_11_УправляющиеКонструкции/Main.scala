package lesson_11_УправляющиеКонструкции

import scala.io.StdIn._

/**
  * условный оператор if
  * while-циклы:
  *   break и continue отсутствуют в скале
  * for-циклы:
  *   вместо () можно использовать {}, т.е.
  *     for {
  *       i <= 100
  *       j >= 50
  *     }
  *
  */
object Main {
  /* Считайте с клавиатуры число n и выведите на экран
  все упорядоченные пары взаимно простых чисел от 1 до n, не включая n, ﻿в лексикографическом порядке. */
  def main(args: Array[String]) {
    val num = readInt()
    for (i <- 1 until num) {
      for (j <- 1 until num) {
        if (BigInt(i).gcd(BigInt(j)).equals(1))
          println(s"$i $j")
      }
    }
  }
}
