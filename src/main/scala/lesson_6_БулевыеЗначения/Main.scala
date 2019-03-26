package lesson_6_БулевыеЗначения

object Main extends App {
  //val s3 = "bar"; val s1 = "foo" + s3; val s2 = "foo" + s3; println(s1 == s2) //true
  //val s1 = "foo"; val s2 = "foo"; println(s1 == s2) //true
  //val s1 = "foo"; val s2 = "foo"; println(s1 eq s2) //true
  //val s3 = "bar"; val s1 = "foo" + s3; val s2 = "foo" + s3; println(s1 eq s2) //false

  /**
    * Релизуйте метод isCapital , который проверяет, является ли заглавной буква, стоящая на позиции pos: Int переданной строки word: String.
    */
  def isCapital(word: String, pos: Int): Boolean = {
    word.charAt(pos).isUpper
  }

  println(isCapital("Scala", 0))
}
