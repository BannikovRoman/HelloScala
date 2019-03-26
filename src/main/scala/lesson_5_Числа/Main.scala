package lesson_5_Числа

import scala.io.StdIn._

object Main1 extends App {
  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    ((weight - weight * potatoWaterRatio) / (1 - crispsWaterRatio)).setScale(5, BigDecimal.RoundingMode.HALF_UP)
  }

  println(crispsWeight(90.0, 0.9, 0.1))

}

/**
  * Посчитайте число единиц в битовой записи числа, считанного с клавиатуры, и выведите на экран.
  */
object Main2 {
  def main(args: Array[String]): Unit = {
    println(readInt().toBinaryString.filter(_.equals('1')).length)
  }
}