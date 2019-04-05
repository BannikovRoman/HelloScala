package lesson_9_Функции

/**
  * Функцмя - это значение, которое может быть использовано как метод
  * Максимальное количество параметров у функции - 22
  * Значения для функций можно задавать через лямбда-синтаксис:
  *   val addOne: Int => Int = x => x + 1
  *   val plus: (Int, Int) => Int = (x, y) => x + y
  *
  * Можно указывать тип параметров прямо в лямбда-абстракции:
  *   val addOne = (x: Int) => x + 1
  *   val plus = (x: Inr, y: Int) => x + y
  *
  * Вместо именованных параметров, если они встречаются один раз в выражении, можно использовать
  *   запись с подчеркиваниями:
  *     val addOne: Int => Int = _ + 1
  *     val plus = (_: Int) + (_: Int)
  *
  * Также методы можно превращать в функции (эта-конверсия). Сделать это можно, поставив подчеркивание после метода:
  *   def addOne(x: Int) = x + 1
  *   val add1 = addOne _
  *
  * Функции можно передавать в качестве параметроа и возвращать из методов и функций в качестве значений:
  *   def graterOr(f: Int => Int): (Int, Int) => Boolean = (x, y) => f(x) > f(y)
  *
  *   val greaterOnOnes = greaterOn(x => x % 10)
  *   greaterOnOnes(23, 45) //false
  *
  * Каррирование: можем представить функцию многих параметров, как последовательность функций от одного параметра,
  *   возвращающих функцию:
  *     def plus: Int => Int => Int = x => y => x + y
  *     plus(1)(2) //3
  *
  * Можно преаратить функцию многих параметров в каррированный вариант с помощью метода curried:
  *   val plus3 = (x: Int, y: Int, z: Int) => x + y + z
  *   val plus3c: Int => Int => Int => Int = plus3.carried
  *   plus3c(1)(2)(3)
  *
  * Композиция: функции, состоящие из последовательного вызова других функций,  можно
  *   задавать композицией с помощью методов andThen и compose:
  *     val plus1 = (_: Int) + 1
  *     val mul3 = (_: Int) * 3
  *
  *     val plusThenMul = plus1 andThen mul3
  *     val plusBeforeMul = plus1 compose mul3
  *
  *     plusThenMul(5) // mul3(plus1(5)) = 18
  *     plusBeforeMul(5) //plus1(mul3(5)) = 16
  *
  *
  */
object Main extends App{
  val add1 = (_: Int) + 1

  val calc42 = (f: Int => Int) => f(42)

  calc42(add1)

  calc42(_ + 7)

  def sumTo(x: Int): Int = if (x == 0) 0 else x + sumTo(x - 1)

  calc42(sumTo)

  def fix(f: (=> Int => Int) => Int => Int): Int => Int = f(fix(f))

  calc42(fix(rec => x => if (x == 0) 0 else x + rec(x - 1)))
}
