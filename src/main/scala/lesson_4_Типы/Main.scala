package lesson_4_Типы

/**
  * Any - все типы являются подтипом Any (A <: Any)
  * AnyRef - любой ссылочный тип является подтипом AnyRef (A <: AnyRef)
  * AnyVal - любой примитивный тип является подтипом AnyVal (A <: AnyVal)
  * Nothing - любой тип надтипом Nothing (Nothing <: A) - тип, который используется для ошибок
  *
  * Примитивные типы:
  * * Byte, Short, Int, Long - целые числа
  * * Float, Double - дробные числа
  * * Char - символы
  * * Boolean - булевые значения
  * * Unit - единичный тип (который ничего не возвраает, если использовать в функции (работает как void в Java))
  */
object Main {
  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    (1 / (sigma * Math.sqrt(2 * Math.PI))) * Math.exp(- Math.pow(x - mu, 2) / (2 * Math.pow(sigma, 2)))
  }
}
