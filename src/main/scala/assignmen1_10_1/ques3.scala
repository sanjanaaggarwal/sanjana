
package assignmen1_10_1

object ques3 extends App {
  //val number:Int=5
  def fibo(number :Int): Int = {
    number match {
      case 0 => 0
      case 1 => 1
      case _ => fibo(number - 1) + fibo(number - 2)
    }
  }
 println( ques3.fibo(6))

}

