package assignmen1_10_1

class ques2c {
  def largestelement( ):Unit ={
    val list =List(1,2,3)
    var number =list.head
    for( a <- list.tail) if(number< a) number=a
    println("largest element is "+ number)
  }

}
