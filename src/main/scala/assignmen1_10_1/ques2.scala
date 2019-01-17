package assignmen1_10_1
/*object ques2 {
  def main(args : Array[String]): Unit ={
    val c =new ques2c
   // val list =List(1,9,2,19,7)
    c.largestelement()
  }
}*/
object ques2 extends App{
  def max(xs: List[Int]): Option[Int] = xs match {
    case Nil => None
    case List(x: Int) => Some(x)
    case x :: y :: rest => max((if (x > y) x else y) :: rest)
  }
  println(ques2.max(List(1,2,3)))
}
