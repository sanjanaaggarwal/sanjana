package assignmen1_10_1

object ques2 {

  def main(args : Array[String]): Unit ={
    val list =List(1,9,2,19,7)
    var number=0
    for( a <- list) if(number< a) number=a
    println("largest element is "+ number)
  }
}
