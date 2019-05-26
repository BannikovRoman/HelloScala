package lesson_10_ОбобщенныеМетоды

import scala.annotation.tailrec

/**
  * Методы могут иметь параметры типа
  * Параметры можно использовать в типах параметров или возвращаемого значения
  * Такие методы можно переиспользовать для разных типов
  *   def ifThenElse[A](cond: Boolean, t: => A, e: => A): A = if (cond) t else e
  *
  * Если компилятор может вывести параметры типа на основе входных параметров, их можно не указывать
  *
  * Их удобно использовать для методов принимающих функции в качестве параметров
  *   def combineOn[A, B](comb: (B, B) => B)
  *                      (f: A => B, g: B => A)
  *                      : (A, A) => A =
  *       (x, y) => g(comb(f(x), f(y))
  *
  *   val sumStrings = combineOn[String, Int](_ + _)(_.toInt, _.toString)
  *   sumStrings("123", "32")
  */
object Main extends App {
  /* Реализуйте эффективное вычисление числа Фибоначчи, используя хвостовую рекурсию. */
  @tailrec
  def fibs(n: Int, prev: BigInt = 0, next: BigInt = 1):BigInt = n match {
    case 0 => prev
    case _ => fibs(n - 1, next, next + prev)
  }

  println(fibs(100))

  /* напишите обобщенный метод middle возвращающий средний элемент из любого экземпляра Iterable[T].
   Если элементов четное число, необходимо выбрать элемент с бОльшим порядковым номером. */
  def middle[A](data: => Iterable[A]) = {
    val half = (data.size / 2)
    if (half != 0) data.splitAt(half)._2.head else Unit
  }

  println(middle("Scala"))
  println(middle(Seq(1, 7, 5, 9)))
}
