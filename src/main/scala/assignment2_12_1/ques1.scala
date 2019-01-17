package assignment2_12_1
import scala.annotation._

object ques1 extends App {

 /* def fibonacci (number :Int):List[Int] ={
    @tailrec
      def fibo(number:Int , elementatnextindex :Int ,elementatprevindex :Int):List[Int]={
      if(number <=1)
         elementatnextindex
      else
        fibo(number-1 , elementatnextindex = elementatnextindex+elementatprevindex , elementatprevindex =elementatnextindex)
    }
    fibo(number , elementatnextindex = 1,elementatprevindex = 0)
  }
   fibonacci(5)*/
/* def fibonaccis(max: Int): List[Int] = { fibonaccis(max, 2, 1) }
  private def fibonaccis(max: Int, prev: Int, prevPrev: Int): List[Int] = prev >= max match {
    case true => List[Int](prevPrev)
    case false => prevPrev :: fibonaccis(max, prev + prevPrev, prev)
  }*/
  def fibSeq(n: Int): List[Int] = {
    var ret = scala.collection.mutable.ListBuffer[Int](1, 2)
    while (ret(ret.length - 1) < n) {
      val temp = ret(ret.length - 1) + ret(ret.length - 2)
      if (temp >= n) {
        return ret.toList
      }
      ret += temp
    }
    ret.toList
  }
  fibSeq(5)

}
