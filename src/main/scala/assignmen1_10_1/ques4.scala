package assignmen1_10_1
import java.util.Scanner

object ques4 extends App {
   val number =5
   var multiply=1
    val result =for{ i<- 1 to number } if(i <= 1) i else multiply *= i
    println(result)
    println(multiply)

  /*def factorial(num: Int): Int = {
    num match {
      case 0 => 0
      case 1 => 1










      case _ => num * factorial(num - 1)
    }
  }

  println(factorial(4))*/
}
