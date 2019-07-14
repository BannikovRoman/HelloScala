package lesson_12_PatternMatching

/**
  * в match важен порядок case'ов
  * в одном case можно заматчить несколько значений через |, т.е.
  *   case 3 | 4 => 'three or four'
  * можно записывать условия в case:
  *   case x if x % 2 == 0 => "unknown even"
  * матчинг часто используется с case class (можно сравнивать как одно так и два поля (смотря какой case class)):
  *   case class Address(country: String, city: String)
  *   def addressInfo(address: Address): String = address match {
  *     case Address("Russia", _) => "r"
  *     case Address("Russia", "Moscow") => "r_m"
  *     case Address("Japan", city) => s"j $city"
  *     case _ => "no info"
  *   }
  */

object Main {
  /**
    * @_* - означает все остальные элементы
    */
  def sum(xs: List[Int], start: Int = 0): Int = xs match {
    case List() => start
    case List(x, rest@_*) => sum(rest.toList, start + x)
  }

  /**
    * регулярные выражения используются в матчинге
    */
  val address = "\\w+, \\w+".r
  def isAddress(str: String): Boolean = str match {
    case address() => true
    case _ => false
  }
  isAddress("Saratov, Russia") == true

  /**
    * регулярные выражения можно использовать вместе с case class в матчинге
    * круглые скобки в регулярке означают группы
    * регулярные выражения можно матчить используя структуру @_*
    */
  val address1 = "(\\w+), (\\w+)".r
  case class Address(country: String, city: String)
  def readAddress(str: String): Option[Address] =
    str match {
      case address1(city, country) =>
        Some(Address(city, country))
      case _ => None
    }
  readAddress("Saratov, Russia") == Some(Address("Saratov", "Russia"))


  case class Pet(name: String, says: String)

  def main(args: Array[String]): Unit = {
    //вопрос
//        val num = "Alexander" match {
//          case "Alexey" => 1
//          case "alexander" => 2
//          case "Alex" => 3
//          case "Oleg" => 4
//        }
//        println(num) //Будет брошено исключение scala.MatchError: Alexander (of class java.lang.String)

    //задача №1
//    val pet = Pet("Qwerty", "meow")
//    val saysRobot = ".*[01].*".r
//
//    val kind = pet match {
//      case Pet(_, "meow"|"nya") => "cat"
//      case Pet("Rex", _) => "dog"
//      case Pet(_, saysRobot()) => "robot"
//      case _ => "unknown"
//    }
//    println(kind)
//  }

    //задача №2
    val name = "[a-zA-Z]+".r
    val email = "\\w+@\\w+\\.\\w+"

    val input = "oleg oleg@email.com\n7bdaf0a1be3\na8af118b1a2\n28d74b7a3fe"

    val result = input match {
      case _ => "result"
    }
    println(result)
  }
}
