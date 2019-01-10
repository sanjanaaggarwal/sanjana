package assignmen1_10_1
import java.util.Scanner

object ques3 {

  def main(args :Array[String]):Unit ={
    val array = Array(0,1,1,2,3,5,8)
    println("enter the index at which you want to search")
    val Scanner= new Scanner(System.in)
    val index = Scanner.nextInt()
    for(i <- 0 to array.length )
      {
        if(i == index) println("i th element is "+ array(i))
      }
  }

}
