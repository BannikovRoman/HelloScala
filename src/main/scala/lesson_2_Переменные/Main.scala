package lesson_2_Переменные

import scala.io.StdIn._

/**
  * val - именованное значение, вычисляется сразу (не можем менять ее значение)
  * def - переменные вычисляются каждяый раз, когда на них ссылаются
  * lazy val - вычисляется при первом требовании
  * def/lazy val - не будут вычислены, если на них не ссылаются
  * var - может менять значение
  */
object Main extends App {
  println(readInt * readInt() * readInt())
}
